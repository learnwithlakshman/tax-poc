
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxingJurisdictionLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxingJurisdictionLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vertexinc:o-series:tps:9:0}LocationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:vertexinc:o-series:tps:9:0}ImpositionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="jurisdictionLevel" use="required" type="{urn:vertexinc:o-series:tps:9:0}JurisdictionLevelCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxingJurisdictionLocationType", propOrder = {
    "impositionType"
})
@XmlSeeAlso({
    vertexinc.o_series.tps._9._0.InputTax.TaxingJurisdictionLocation.class
})
public class TaxingJurisdictionLocationType
    extends LocationType
{

    @XmlElement(name = "ImpositionType")
    protected ImpositionType impositionType;
    @XmlAttribute(name = "jurisdictionLevel", required = true)
    protected JurisdictionLevelCodeType jurisdictionLevel;

    /**
     * Gets the value of the impositionType property.
     * 
     * @return
     *     possible object is
     *     {@link ImpositionType }
     *     
     */
    public ImpositionType getImpositionType() {
        return impositionType;
    }

    /**
     * Sets the value of the impositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpositionType }
     *     
     */
    public void setImpositionType(ImpositionType value) {
        this.impositionType = value;
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

}
