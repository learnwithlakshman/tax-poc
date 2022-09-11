
package vertexinc.o_series.tps._9._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TaxAreaResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAreaResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Jurisdiction" type="{urn:vertexinc:o-series:tps:9:0}JurisdictionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:vertexinc:o-series:tps:9:0}PostalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:vertexinc:o-series:tps:9:0}Coordinates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Status" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="lookupResult" use="required" type="{urn:vertexinc:o-series:tps:9:0}LookupResultType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressCleansingResultMessage" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="taxAreaId" type="{urn:vertexinc:o-series:tps:9:0}TaxAreaIdType" /&gt;
 *       &lt;attribute name="asOfDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="confidenceIndicator"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="100"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAreaResultType", propOrder = {
    "jurisdiction",
    "postalAddress",
    "coordinates",
    "status",
    "addressCleansingResultMessage"
})
public class TaxAreaResultType {

    @XmlElement(name = "Jurisdiction")
    protected List<JurisdictionType> jurisdiction;
    @XmlElement(name = "PostalAddress")
    protected List<PostalAddressType> postalAddress;
    @XmlElement(name = "Coordinates")
    protected List<CoordinatesType> coordinates;
    @XmlElement(name = "Status")
    protected List<TaxAreaResultType.Status> status;
    @XmlElement(name = "AddressCleansingResultMessage")
    protected List<TaxAreaResultType.AddressCleansingResultMessage> addressCleansingResultMessage;
    @XmlAttribute(name = "taxAreaId")
    protected Integer taxAreaId;
    @XmlAttribute(name = "asOfDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "confidenceIndicator")
    protected Integer confidenceIndicator;

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionType }
     * 
     * 
     */
    public List<JurisdictionType> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<JurisdictionType>();
        }
        return this.jurisdiction;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressType }
     * 
     * 
     */
    public List<PostalAddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<PostalAddressType>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinatesType }
     * 
     * 
     */
    public List<CoordinatesType> getCoordinates() {
        if (coordinates == null) {
            coordinates = new ArrayList<CoordinatesType>();
        }
        return this.coordinates;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAreaResultType.Status }
     * 
     * 
     */
    public List<TaxAreaResultType.Status> getStatus() {
        if (status == null) {
            status = new ArrayList<TaxAreaResultType.Status>();
        }
        return this.status;
    }

    /**
     * Gets the value of the addressCleansingResultMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressCleansingResultMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressCleansingResultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAreaResultType.AddressCleansingResultMessage }
     * 
     * 
     */
    public List<TaxAreaResultType.AddressCleansingResultMessage> getAddressCleansingResultMessage() {
        if (addressCleansingResultMessage == null) {
            addressCleansingResultMessage = new ArrayList<TaxAreaResultType.AddressCleansingResultMessage>();
        }
        return this.addressCleansingResultMessage;
    }

    /**
     * Gets the value of the taxAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxAreaId() {
        return taxAreaId;
    }

    /**
     * Sets the value of the taxAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxAreaId(Integer value) {
        this.taxAreaId = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the confidenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceIndicator() {
        return confidenceIndicator;
    }

    /**
     * Sets the value of the confidenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceIndicator(Integer value) {
        this.confidenceIndicator = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AddressCleansingResultMessage {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code")
        protected String code;
        @XmlAttribute(name = "type")
        protected String type;

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
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="lookupResult" use="required" type="{urn:vertexinc:o-series:tps:9:0}LookupResultType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Status {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "lookupResult", required = true)
        protected LookupResultType lookupResult;

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
         * Gets the value of the lookupResult property.
         * 
         * @return
         *     possible object is
         *     {@link LookupResultType }
         *     
         */
        public LookupResultType getLookupResult() {
            return lookupResult;
        }

        /**
         * Sets the value of the lookupResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link LookupResultType }
         *     
         */
        public void setLookupResult(LookupResultType value) {
            this.lookupResult = value;
        }

    }

}
