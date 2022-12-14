
package vertexinc.o_series.tps._9._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxAreaLookupResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAreaLookupResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAreaResult" type="{urn:vertexinc:o-series:tps:9:0}TaxAreaResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LookupException" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExceptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RootCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lookupId"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="40"/&gt;
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
@XmlType(name = "TaxAreaLookupResultType", propOrder = {
    "taxAreaResult",
    "lookupException"
})
public class TaxAreaLookupResultType {

    @XmlElement(name = "TaxAreaResult")
    protected List<TaxAreaResultType> taxAreaResult;
    @XmlElement(name = "LookupException")
    protected TaxAreaLookupResultType.LookupException lookupException;
    @XmlAttribute(name = "lookupId")
    protected String lookupId;

    /**
     * Gets the value of the taxAreaResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAreaResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAreaResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAreaResultType }
     * 
     * 
     */
    public List<TaxAreaResultType> getTaxAreaResult() {
        if (taxAreaResult == null) {
            taxAreaResult = new ArrayList<TaxAreaResultType>();
        }
        return this.taxAreaResult;
    }

    /**
     * Gets the value of the lookupException property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAreaLookupResultType.LookupException }
     *     
     */
    public TaxAreaLookupResultType.LookupException getLookupException() {
        return lookupException;
    }

    /**
     * Sets the value of the lookupException property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAreaLookupResultType.LookupException }
     *     
     */
    public void setLookupException(TaxAreaLookupResultType.LookupException value) {
        this.lookupException = value;
    }

    /**
     * Gets the value of the lookupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupId() {
        return lookupId;
    }

    /**
     * Sets the value of the lookupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupId(String value) {
        this.lookupId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ExceptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RootCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exceptionType",
        "rootCause"
    })
    public static class LookupException {

        @XmlElement(name = "ExceptionType")
        protected String exceptionType;
        @XmlElement(name = "RootCause")
        protected String rootCause;

        /**
         * Gets the value of the exceptionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionType() {
            return exceptionType;
        }

        /**
         * Sets the value of the exceptionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionType(String value) {
            this.exceptionType = value;
        }

        /**
         * Gets the value of the rootCause property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRootCause() {
            return rootCause;
        }

        /**
         * Sets the value of the rootCause property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRootCause(String value) {
            this.rootCause = value;
        }

    }

}
