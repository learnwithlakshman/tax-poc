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
    return reponse;
    //return jaxbObjectToXML(response);
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
  String reponse="<?xml version='1.0' encoding='UTF-8'?>\n" +
      "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
      "    <soapenv:Header/>\n" +
      "    <soapenv:Body>\n" +
      "        <VertexEnvelope xmlns=\"urn:vertexinc:o-series:tps:9:0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
      "            <Login>\n" +
      "                <TrustedId>******</TrustedId>\n" +
      "            </Login>\n" +
      "            <InvoiceResponse documentNumber=\"342\" documentDate=\"2022-09-13\" transactionType=\"SALE\" postingDate=\"2022-06-01\">\n" +
      "                <Currency isoCurrencyCodeAlpha=\"USD\" isoCurrencyCodeNum=\"840\" isoCurrencyName=\"US Dollar\"/>\n" +
      "                <Seller>\n" +
      "                    <Company>0102</Company>\n" +
      "                    <PhysicalOrigin taxAreaId=\"10010870\">\n" +
      "                        <Country>USA</Country>\n" +
      "                    </PhysicalOrigin>\n" +
      "                </Seller>\n" +
      "                <Customer>\n" +
      "                    <Destination taxAreaId=\"330612010\">\n" +
      "                        <StreetAddress1>270 Park Avenue</StreetAddress1>\n" +
      "                        <City>New York</City>\n" +
      "                        <MainDivision>New York</MainDivision>\n" +
      "                        <PostalCode>10154</PostalCode>\n" +
      "                    </Destination>\n" +
      "                </Customer>\n" +
      "                <SubTotal>273.6</SubTotal>\n" +
      "                <Total>273.6</Total>\n" +
      "                <TotalTax>0.0</TotalTax>\n" +
      "                <LineItem lineItemNumber=\"10059\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
      "                    <Product productClass=\"9999\"/>\n" +
      "                    <Quantity>40.0</Quantity>\n" +
      "                    <FairMarketValue>14.4</FairMarketValue>\n" +
      "                    <UnitPrice>0.36</UnitPrice>\n" +
      "                    <ExtendedPrice>14.4</ExtendedPrice>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>14.4</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>14.4</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Local Sales and Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"DISTRICT\" jurisdictionId=\"79774\">\n" +
      "                            <![CDATA[METROPOLITAN COMMUTER TRANSPORTATION DISTRICT]]>\n" +
      "                        </Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>14.4</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">\n" +
      "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
      "                        </Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <TotalTax>0.0</TotalTax>\n" +
      "                    <FlexibleFields>\n" +
      "                        <FlexibleCodeField fieldId=\"1\">CFM-AT-IR-AT02</FlexibleCodeField>\n" +
      "                        <FlexibleCodeField fieldId=\"2\">\n" +
      "                            <![CDATA[Account Transaction Activity: Response Received: Activity]]>\n" +
      "                        </FlexibleCodeField>\n" +
      "                    </FlexibleFields>\n" +
      "                    <AssistedParameters>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Undefined Commodity Codes\" originalValue=\"\">9999</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Commodity Codes to Product Class\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product\" phase=\"PRE\" ruleName=\"Moving Product Class to Product Field\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.company\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"0102\">0102</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.department\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.division\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                    </AssistedParameters>\n" +
      "                </LineItem>\n" +
      "                <LineItem lineItemNumber=\"10060\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
      "                    <Product productClass=\"9999\"/>\n" +
      "                    <Quantity>36.0</Quantity>\n" +
      "                    <FairMarketValue>12.96</FairMarketValue>\n" +
      "                    <UnitPrice>0.36</UnitPrice>\n" +
      "                    <ExtendedPrice>12.96</ExtendedPrice>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>12.96</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>12.96</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Local Sales and Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"DISTRICT\" jurisdictionId=\"79774\">\n" +
      "                            <![CDATA[METROPOLITAN COMMUTER TRANSPORTATION DISTRICT]]>\n" +
      "                        </Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>12.96</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">\n" +
      "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
      "                        </Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <TotalTax>0.0</TotalTax>\n" +
      "                    <FlexibleFields>\n" +
      "                        <FlexibleCodeField fieldId=\"1\">CFM-AT-IR-AT03</FlexibleCodeField>\n" +
      "                        <FlexibleCodeField fieldId=\"2\">\n" +
      "                            <![CDATA[Account Transaction Activity: Response Received: Exception]]>\n" +
      "                        </FlexibleCodeField>\n" +
      "                    </FlexibleFields>\n" +
      "                    <AssistedParameters>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Undefined Commodity Codes\" originalValue=\"\">9999</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Commodity Codes to Product Class\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product\" phase=\"PRE\" ruleName=\"Moving Product Class to Product Field\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.company\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"0102\">0102</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.department\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.division\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                    </AssistedParameters>\n" +
      "                </LineItem>\n" +
      "                <LineItem lineItemNumber=\"10061\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
      "                    <Product productClass=\"9999\"/>\n" +
      "                    <Quantity>80.0</Quantity>\n" +
      "                    <FairMarketValue>28.8</FairMarketValue>\n" +
      "                    <UnitPrice>0.36</UnitPrice>\n" +
      "                    <ExtendedPrice>28.8</ExtendedPrice>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>28.8</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>28.8</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Local Sales and Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"DISTRICT\" jurisdictionId=\"79774\">\n" +
      "                            <![CDATA[METROPOLITAN COMMUTER TRANSPORTATION DISTRICT]]>\n" +
      "                        </Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>28.8</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">\n" +
      "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
      "                        </Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <TotalTax>0.0</TotalTax>\n" +
      "                    <FlexibleFields>\n" +
      "                        <FlexibleCodeField fieldId=\"1\">CFM-AV-IR-AC05</FlexibleCodeField>\n" +
      "                        <FlexibleCodeField fieldId=\"2\">\n" +
      "                            <![CDATA[Account Validation: Response Received: Closed Account]]>\n" +
      "                        </FlexibleCodeField>\n" +
      "                    </FlexibleFields>\n" +
      "                    <AssistedParameters>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Undefined Commodity Codes\" originalValue=\"\">9999</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Commodity Codes to Product Class\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product\" phase=\"PRE\" ruleName=\"Moving Product Class to Product Field\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.company\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"0102\">0102</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.department\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.division\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                    </AssistedParameters>\n" +
      "                </LineItem>\n" +
      "                <LineItem lineItemNumber=\"10062\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
      "                    <Product productClass=\"9999\"/>\n" +
      "                    <Quantity>72.0</Quantity>\n" +
      "                    <FairMarketValue>25.92</FairMarketValue>\n" +
      "                    <UnitPrice>0.36</UnitPrice>\n" +
      "                    <ExtendedPrice>25.92</ExtendedPrice>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>25.92</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>25.92</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Local Sales and Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"DISTRICT\" jurisdictionId=\"79774\">\n" +
      "                            <![CDATA[METROPOLITAN COMMUTER TRANSPORTATION DISTRICT]]>\n" +
      "                        </Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>25.92</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">\n" +
      "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
      "                        </Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <TotalTax>0.0</TotalTax>\n" +
      "                    <FlexibleFields>\n" +
      "                        <FlexibleCodeField fieldId=\"1\">CFM-AV-IR-AC01</FlexibleCodeField>\n" +
      "                        <FlexibleCodeField fieldId=\"2\">\n" +
      "                            <![CDATA[Account Validation: Response Received: Incorrect Account Number Format]]>\n" +
      "                        </FlexibleCodeField>\n" +
      "                    </FlexibleFields>\n" +
      "                    <AssistedParameters>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Undefined Commodity Codes\" originalValue=\"\">9999</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Commodity Codes to Product Class\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product\" phase=\"PRE\" ruleName=\"Moving Product Class to Product Field\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.company\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"0102\">0102</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.department\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.division\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                    </AssistedParameters>\n" +
      "                </LineItem>\n" +
      "                <LineItem lineItemNumber=\"10063\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
      "                    <Product productClass=\"9999\"/>\n" +
      "                    <Quantity>532.0</Quantity>\n" +
      "                    <FairMarketValue>191.52</FairMarketValue>\n" +
      "                    <UnitPrice>0.36</UnitPrice>\n" +
      "                    <ExtendedPrice>191.52</ExtendedPrice>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>191.52</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>191.52</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">Local Sales and Use Tax</Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
      "                        <Jurisdiction jurisdictionLevel=\"DISTRICT\" jurisdictionId=\"79774\">\n" +
      "                            <![CDATA[METROPOLITAN COMMUTER TRANSPORTATION DISTRICT]]>\n" +
      "                        </Jurisdiction>\n" +
      "                        <CalculatedTax>0.0</CalculatedTax>\n" +
      "                        <EffectiveRate>0.0</EffectiveRate>\n" +
      "                        <Exempt>191.52</Exempt>\n" +
      "                        <Taxable>0.0</Taxable>\n" +
      "                        <Imposition impositionId=\"1\">\n" +
      "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
      "                        </Imposition>\n" +
      "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
      "                    </Taxes>\n" +
      "                    <TotalTax>0.0</TotalTax>\n" +
      "                    <FlexibleFields>\n" +
      "                        <FlexibleCodeField fieldId=\"1\">CFM-AV-IR-AC00</FlexibleCodeField>\n" +
      "                        <FlexibleCodeField fieldId=\"2\">\n" +
      "                            <![CDATA[Account Validation: Response Received: Open Account]]>\n" +
      "                        </FlexibleCodeField>\n" +
      "                    </FlexibleFields>\n" +
      "                    <AssistedParameters>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Undefined Commodity Codes\" originalValue=\"\">9999</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product.productClass\" phase=\"PRE\" ruleName=\"Commodity Codes to Product Class\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"product\" phase=\"PRE\" ruleName=\"Moving Product Class to Product Field\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.company\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"0102\">0102</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.department\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                        <AssistedParameter paramName=\"seller.division\" phase=\"PRE\" ruleName=\"Division Code Lookup AR\" originalValue=\"\">null</AssistedParameter>\n" +
      "                    </AssistedParameters>\n" +
      "                </LineItem>\n" +
      "            </InvoiceResponse>\n" +
      "            <ApplicationData>\n" +
      "                <ResponseTimeMS>113</ResponseTimeMS>\n" +
      "            </ApplicationData>\n" +
      "        </VertexEnvelope>\n" +
      "    </soapenv:Body>\n" +
      "</soapenv:Envelope>\n";
}
