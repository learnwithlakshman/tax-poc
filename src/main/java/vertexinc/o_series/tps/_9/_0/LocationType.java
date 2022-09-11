
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vertexinc:o-series:tps:9:0}PostalAddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:vertexinc:o-series:tps:9:0}CurrencyConversion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="taxAreaId" type="{urn:vertexinc:o-series:tps:9:0}TaxAreaIdType" /&gt;
 *       &lt;attribute name="latitude"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="20"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="longitude"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="20"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="locationCustomsStatus" type="{urn:vertexinc:o-series:tps:9:0}LocationCustomsStatusCodeType" /&gt;
 *       &lt;attribute name="locationCode" type="{urn:vertexinc:o-series:tps:9:0}LocationCodeType" /&gt;
 *       &lt;attribute name="externalJurisdictionCode" type="{urn:vertexinc:o-series:tps:9:0}ExternalJurisdictionCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "currencyConversion"
})
@XmlSeeAlso({
    TaxingJurisdictionLocationType.class
})
public class LocationType
    extends PostalAddressType
{

    @XmlElement(name = "CurrencyConversion")
    protected CurrencyConversion currencyConversion;
    @XmlAttribute(name = "taxAreaId")
    protected Integer taxAreaId;
    @XmlAttribute(name = "latitude")
    protected String latitude;
    @XmlAttribute(name = "longitude")
    protected String longitude;
    @XmlAttribute(name = "locationCustomsStatus")
    protected LocationCustomsStatusCodeType locationCustomsStatus;
    @XmlAttribute(name = "locationCode")
    protected String locationCode;
    @XmlAttribute(name = "externalJurisdictionCode")
    protected String externalJurisdictionCode;

    /**
     * Gets the value of the currencyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion }
     *     
     */
    public CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }

    /**
     * Sets the value of the currencyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion }
     *     
     */
    public void setCurrencyConversion(CurrencyConversion value) {
        this.currencyConversion = value;
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
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the locationCustomsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCustomsStatusCodeType }
     *     
     */
    public LocationCustomsStatusCodeType getLocationCustomsStatus() {
        return locationCustomsStatus;
    }

    /**
     * Sets the value of the locationCustomsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCustomsStatusCodeType }
     *     
     */
    public void setLocationCustomsStatus(LocationCustomsStatusCodeType value) {
        this.locationCustomsStatus = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
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
