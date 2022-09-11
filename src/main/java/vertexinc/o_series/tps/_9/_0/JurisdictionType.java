
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Copyright Vertex Inc. 2007-2012 All Rights Reserved
 * 
 * <p>Java class for JurisdictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JurisdictionType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="jurisdictionLevel" use="required" type="{urn:vertexinc:o-series:tps:9:0}JurisdictionLevelCodeType" /&gt;
 *       &lt;attribute name="jurisdictionId" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="999999999"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="externalJurisdictionCode" type="{urn:vertexinc:o-series:tps:9:0}ExternalJurisdictionCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JurisdictionType", propOrder = {
    "value"
})
@XmlSeeAlso({
    vertexinc.o_series.tps._9._0.TaxesType.Jurisdiction.class,
    vertexinc.o_series.tps._9._0.TaxesType.AccumulateAsJurisdiction.class
})
public class JurisdictionType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "jurisdictionLevel", required = true)
    protected JurisdictionLevelCodeType jurisdictionLevel;
    @XmlAttribute(name = "jurisdictionId", required = true)
    protected int jurisdictionId;
    @XmlAttribute(name = "effectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "expirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "externalJurisdictionCode")
    protected String externalJurisdictionCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the jurisdictionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JurisdictionLevelCodeType }
     *     
     */
    public JurisdictionLevelCodeType getJurisdictionLevel() {
        return jurisdictionLevel;
    }

    /**
     * Sets the value of the jurisdictionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JurisdictionLevelCodeType }
     *     
     */
    public void setJurisdictionLevel(JurisdictionLevelCodeType value) {
        this.jurisdictionLevel = value;
    }

    /**
     * Gets the value of the jurisdictionId property.
     * 
     */
    public int getJurisdictionId() {
        return jurisdictionId;
    }

    /**
     * Sets the value of the jurisdictionId property.
     * 
     */
    public void setJurisdictionId(int value) {
        this.jurisdictionId = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the externalJurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalJurisdictionCode() {
        return externalJurisdictionCode;
    }

    /**
     * Sets the value of the externalJurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalJurisdictionCode(String value) {
        this.externalJurisdictionCode = value;
    }

}
