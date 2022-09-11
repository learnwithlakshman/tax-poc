
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
 *       &lt;attribute name="taxingLocation" use="required" type="{urn:vertexinc:o-series:tps:9:0}TaxingLocationCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SitusOverride")
public class SitusOverride {

    @XmlAttribute(name = "taxingLocation", required = true)
    protected TaxingLocationCodeType taxingLocation;

    /**
     * Gets the value of the taxingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxingLocationCodeType }
     *     
     */
    public TaxingLocationCodeType getTaxingLocation() {
        return taxingLocation;
    }

    /**
     * Sets the value of the taxingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxingLocationCodeType }
     *     
     */
    public void setTaxingLocation(TaxingLocationCodeType value) {
        this.taxingLocation = value;
    }

}
