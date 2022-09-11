
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CommodityCodeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityCodeResponseType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:vertexinc:o-series:tps:9:0&gt;EntityCodeType"&gt;
 *       &lt;attribute name="commodityCodeType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="60"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="usedCommodityCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="40"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="userDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityCodeResponseType", propOrder = {
    "value"
})
public class CommodityCodeResponseType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "commodityCodeType", required = true)
    protected String commodityCodeType;
    @XmlAttribute(name = "usedCommodityCode")
    protected String usedCommodityCode;
    @XmlAttribute(name = "userDefined")
    protected Boolean userDefined;

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
     * Gets the value of the commodityCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCodeType() {
        return commodityCodeType;
    }

    /**
     * Sets the value of the commodityCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCodeType(String value) {
        this.commodityCodeType = value;
    }

    /**
     * Gets the value of the usedCommodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedCommodityCode() {
        return usedCommodityCode;
    }

    /**
     * Sets the value of the usedCommodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedCommodityCode(String value) {
        this.usedCommodityCode = value;
    }

    /**
     * Gets the value of the userDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDefined() {
        return userDefined;
    }

    /**
     * Sets the value of the userDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDefined(Boolean value) {
        this.userDefined = value;
    }

}
