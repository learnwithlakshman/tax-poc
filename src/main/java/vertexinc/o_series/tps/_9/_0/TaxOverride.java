
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="overrideType" use="required" type="{urn:vertexinc:o-series:tps:9:0}TaxOverrideCodeType" /&gt;
 *       &lt;attribute name="overrideReasonCode" type="{urn:vertexinc:o-series:tps:9:0}ReasonCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TaxOverride")
public class TaxOverride {

    @XmlAttribute(name = "overrideType", required = true)
    protected TaxOverrideCodeType overrideType;
    @XmlAttribute(name = "overrideReasonCode")
    protected String overrideReasonCode;

    /**
     * Gets the value of the overrideType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOverrideCodeType }
     *     
     */
    public TaxOverrideCodeType getOverrideType() {
        return overrideType;
    }

    /**
     * Sets the value of the overrideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOverrideCodeType }
     *     
     */
    public void setOverrideType(TaxOverrideCodeType value) {
        this.overrideType = value;
    }

    /**
     * Gets the value of the overrideReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReasonCode() {
        return overrideReasonCode;
    }

    /**
     * Sets the value of the overrideReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReasonCode(String value) {
        this.overrideReasonCode = value;
    }

}
