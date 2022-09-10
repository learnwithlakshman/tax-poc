package com.lwl.taxpoc.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tax")
public class TaxCalculatorController {

    @PostMapping("/calculate")
    public String taxResponse(@RequestBody String requestPayload){
      return xmlResponse;
    }
    String xmlResponse = "<?xml version='1.0' encoding='UTF-8'?>\n" +
        "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
        "    <soapenv:Header/>\n" +
        "    <soapenv:Body>\n" +
        "        <VertexEnvelope xmlns=\"urn:vertexinc:o-series:tps:9:0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
        "            <Login>\n" +
        "                <TrustedId>******</TrustedId>\n" +
        "            </Login>\n" +
        "            <InvoiceResponse documentNumber=\"319\" documentDate=\"2022-08-26\" transactionType=\"SALE\" postingDate=\"2022-06-01\">\n" +
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
        "                <SubTotal>136.8</SubTotal>\n" +
        "                <Total>136.8</Total>\n" +
        "                <TotalTax>0.0</TotalTax>\n" +
        "                <LineItem lineItemNumber=\"12791\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
        "                    <Product productClass=\"9999\"/>\n" +
        "                    <Quantity>20.0</Quantity>\n" +
        "                    <FairMarketValue>7.2</FairMarketValue>\n" +
        "                    <UnitPrice>0.36</UnitPrice>\n" +
        "                    <ExtendedPrice>7.2</ExtendedPrice>\n" +
        "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
        "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
        "                        <CalculatedTax>0.0</CalculatedTax>\n" +
        "                        <EffectiveRate>0.0</EffectiveRate>\n" +
        "                        <Exempt>7.2</Exempt>\n" +
        "                        <Taxable>0.0</Taxable>\n" +
        "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
        "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
        "                    </Taxes>\n" +
        "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
        "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
        "                        <CalculatedTax>0.0</CalculatedTax>\n" +
        "                        <EffectiveRate>0.0</EffectiveRate>\n" +
        "                        <Exempt>7.2</Exempt>\n" +
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
        "                        <Exempt>7.2</Exempt>\n" +
        "                        <Taxable>0.0</Taxable>\n" +
        "                        <Imposition impositionId=\"1\">\n" +
        "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
        "                        </Imposition>\n" +
        "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
        "                    </Taxes>\n" +
        "                    <TotalTax>9.0</TotalTax>\n" +
        "                    <FlexibleFields>\n" +
        "                        <FlexibleCodeField fieldId=\"1\">CFM-AT-IR-AT02-US</FlexibleCodeField>\n" +
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
        "                <LineItem lineItemNumber=\"12792\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
        "                    <Product productClass=\"9999\"/>\n" +
        "                    <Quantity>18.0</Quantity>\n" +
        "                    <FairMarketValue>6.48</FairMarketValue>\n" +
        "                    <UnitPrice>0.36</UnitPrice>\n" +
        "                    <ExtendedPrice>6.48</ExtendedPrice>\n" +
        "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
        "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
        "                        <CalculatedTax>0.0</CalculatedTax>\n" +
        "                        <EffectiveRate>0.0</EffectiveRate>\n" +
        "                        <Exempt>6.48</Exempt>\n" +
        "                        <Taxable>0.0</Taxable>\n" +
        "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
        "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
        "                    </Taxes>\n" +
        "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
        "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
        "                        <CalculatedTax>0.0</CalculatedTax>\n" +
        "                        <EffectiveRate>0.0</EffectiveRate>\n" +
        "                        <Exempt>6.48</Exempt>\n" +
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
        "                        <Exempt>6.48</Exempt>\n" +
        "                        <Taxable>0.0</Taxable>\n" +
        "                        <Imposition impositionId=\"1\">\n" +
        "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
        "                        </Imposition>\n" +
        "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
        "                    </Taxes>\n" +
        "                    <TotalTax>10.0</TotalTax>\n" +
        "                    <FlexibleFields>\n" +
        "                        <FlexibleCodeField fieldId=\"1\">CFM-AT-IR-AT03-US</FlexibleCodeField>\n" +
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
        "                <LineItem lineItemNumber=\"12793\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
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
        "                    <TotalTax>1.0</TotalTax>\n" +
        "                    <FlexibleFields>\n" +
        "                        <FlexibleCodeField fieldId=\"1\">CFM-AV-IR-AC05-US</FlexibleCodeField>\n" +
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
        "                <LineItem lineItemNumber=\"12794\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
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
        "                    <TotalTax>2.0</TotalTax>\n" +
        "                    <FlexibleFields>\n" +
        "                        <FlexibleCodeField fieldId=\"1\">CFM-AV-IR-AC01-US</FlexibleCodeField>\n" +
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
        "                <LineItem lineItemNumber=\"12795\" costCenter=\"01234\" generalLedgerAccount=\"7551000000\">\n" +
        "                    <Product productClass=\"9999\"/>\n" +
        "                    <Quantity>266.0</Quantity>\n" +
        "                    <FairMarketValue>95.76</FairMarketValue>\n" +
        "                    <UnitPrice>0.36</UnitPrice>\n" +
        "                    <ExtendedPrice>95.76</ExtendedPrice>\n" +
        "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
        "                        <Jurisdiction jurisdictionLevel=\"STATE\" jurisdictionId=\"24354\">NEW YORK</Jurisdiction>\n" +
        "                        <CalculatedTax>0.0</CalculatedTax>\n" +
        "                        <EffectiveRate>0.0</EffectiveRate>\n" +
        "                        <Exempt>95.76</Exempt>\n" +
        "                        <Taxable>0.0</Taxable>\n" +
        "                        <Imposition impositionId=\"1\">Sales and Compensating Use Tax</Imposition>\n" +
        "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
        "                    </Taxes>\n" +
        "                    <Taxes taxResult=\"EXEMPT\" taxType=\"SELLER_USE\" rateClassification=\"Exempt\" situs=\"DESTINATION\" taxCollectedFromParty=\"BUYER\">\n" +
        "                        <Jurisdiction jurisdictionLevel=\"CITY\" jurisdictionId=\"25353\">NEW YORK</Jurisdiction>\n" +
        "                        <CalculatedTax>0.0</CalculatedTax>\n" +
        "                        <EffectiveRate>0.0</EffectiveRate>\n" +
        "                        <Exempt>95.76</Exempt>\n" +
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
        "                        <Exempt>95.76</Exempt>\n" +
        "                        <Taxable>0.0</Taxable>\n" +
        "                        <Imposition impositionId=\"1\">\n" +
        "                            <![CDATA[Metropolitan Commuter Transportation District]]>\n" +
        "                        </Imposition>\n" +
        "                        <ImpositionType impositionTypeId=\"1\">General Sales and Use Tax</ImpositionType>\n" +
        "                    </Taxes>\n" +
        "                    <TotalTax>3.0</TotalTax>\n" +
        "                    <FlexibleFields>\n" +
        "                        <FlexibleCodeField fieldId=\"1\">CFM-AV-IR-AC00-US</FlexibleCodeField>\n" +
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
        "                <ResponseTimeMS>64.4</ResponseTimeMS>\n" +
        "            </ApplicationData>\n" +
        "        </VertexEnvelope>\n" +
        "    </soapenv:Body>\n" +
        "</soapenv:Envelope>\n";
}
