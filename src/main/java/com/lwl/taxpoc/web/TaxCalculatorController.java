package com.lwl.taxpoc.web;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.InputSource;
import vertexinc.o_series.tps._9._0.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tax")
public class TaxCalculatorController {

  @PostMapping("/calculate")
  public String taxResponse(@RequestBody String xmlRequest) throws SOAPException, IOException, JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(VertexEnvelope.class);
    SOAPMessage message = MessageFactory.newInstance().createMessage(null, new ByteArrayInputStream(xmlRequest.getBytes()));
    SOAPBody body = message.getSOAPBody();
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    VertexEnvelope request = (VertexEnvelope) unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
    VertexEnvelope response = convertRequestToResponse(request);
    return jaxbObjectToXML(response);
  }

  private VertexEnvelope convertRequestToResponse(VertexEnvelope request) {
    InvoiceRequestType temp = request.getInvoiceRequest();
    InvoiceResponseType response = new InvoiceResponseType();
    response.setPostingDate(temp.getPostingDate());
    response.setDocumentNumber(temp.getDocumentNumber());
    response.setTransactionType(temp.getTransactionType());
    request.setInvoiceResponse(response);
    request.getInvoiceResponse().setCurrency(temp.getCurrency());
    request.getInvoiceResponse().setSeller(temp.getSeller());
    request.getInvoiceResponse().setCustomer(temp.getCustomer());
    List<LineItemISIType> list = new ArrayList<>();
    BigDecimal subTotal = BigDecimal.valueOf(0);
    double totalTax = 0;
    for (LineItemISIType lineItem : temp.getLineItem()) {
      LineItemISOType item = new LineItemISOType();
      item.setProduct(lineItem.getProduct());
      item.setQuantity(lineItem.getQuantity());
      item.setLineItemNumber(lineItem.getLineItemNumber());
      item.setCostCenter(lineItem.getCostCenter());
      item.setGeneralLedgerAccount(lineItem.getGeneralLedgerAccount());
      subTotal = BigDecimal.valueOf(lineItem.getUnitPrice().doubleValue() * lineItem.getQuantity().getValue().doubleValue());
      double taxAmount = lineItem.getUnitPrice().doubleValue() * lineItem.getQuantity().getValue().doubleValue() * 0.1;
      item.setTotalTax(BigDecimal.valueOf(taxAmount));
      item.setUnitPrice(lineItem.getUnitPrice());
      request.getInvoiceResponse().getLineItem().add(item);
      totalTax += taxAmount;
    }
    request.getInvoiceResponse().getLineItem().add(request.getInvoiceResponse().getLineItem().get(0));
    BigDecimal total = subTotal;
    request.getInvoiceResponse().setTotalTax(BigDecimal.valueOf(totalTax));
    request.getInvoiceResponse().setSubTotal(subTotal);
    request.getInvoiceResponse().setTotal(total);
    request.setInvoiceRequest(null);
    return request;
  }

  private String jaxbObjectToXML(VertexEnvelope vertexEnvelope) {
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(VertexEnvelope.class);
      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
      jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
        @Override
        public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
          return "tax";
        }

      });
      StringWriter sw = new StringWriter();
      jaxbMarshaller.marshal(vertexEnvelope, sw);
      MessageFactory mf = MessageFactory.newInstance();
      SOAPMessage message = mf.createMessage();
      SOAPBody body = message.getSOAPBody();
      JAXBContext jc = JAXBContext.newInstance(VertexEnvelope.class);
      message.saveChanges();
      jaxbMarshaller.marshal(vertexEnvelope, body);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      SOAPPart soapPart = message.getSOAPPart();
      SOAPEnvelope envelope = soapPart.getEnvelope();
      envelope.removeNamespaceDeclaration("SOAP-ENV");
      envelope.setPrefix("soapenv");
      body.setPrefix("soapenv");
      SOAPHeader header = message.getSOAPHeader();
      header.setPrefix("soapenv");
      message.saveChanges();
      message.writeTo(out);
      String xmlString = prettyPrintByTransformer(out.toString("UTF-8"), 2);
      return xmlString;
    } catch (JAXBException e) {
      e.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (SOAPException e) {
      throw new RuntimeException(e);
    }
    return null;
  }

  public static String prettyPrintByTransformer(String xmlString, int indent) {
    try {
      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      StreamResult result = new StreamResult(new StringWriter());
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      InputSource inputSource = new InputSource(new StringReader(xmlString));
      DOMSource source = new DOMSource(documentBuilder.parse(inputSource));
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
          String.valueOf(2));
      transformer.transform(source, result);
      return result.getWriter().toString();
    } catch (Exception e) {
      throw new RuntimeException("Error occurs when pretty-printing xml:\n" + xmlString, e);
    }
  }
}
