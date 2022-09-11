
package vertexinc.o_series.tps._9._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRuleCurrencyConversionFactor" type="{urn:vertexinc:o-series:tps:9:0}TaxRuleCurrencyConversionFactorType" maxOccurs="unbounded"/&gt;
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
    "taxRuleCurrencyConversionFactor"
})
@XmlRootElement(name = "TaxRuleCurrencyConversionFactors")
public class TaxRuleCurrencyConversionFactors {

    @XmlElement(name = "TaxRuleCurrencyConversionFactor", required = true)
    protected List<TaxRuleCurrencyConversionFactorType> taxRuleCurrencyConversionFactor;

    /**
     * Gets the value of the taxRuleCurrencyConversionFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRuleCurrencyConversionFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRuleCurrencyConversionFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRuleCurrencyConversionFactorType }
     * 
     * 
     */
    public List<TaxRuleCurrencyConversionFactorType> getTaxRuleCurrencyConversionFactor() {
        if (taxRuleCurrencyConversionFactor == null) {
            taxRuleCurrencyConversionFactor = new ArrayList<TaxRuleCurrencyConversionFactorType>();
        }
        return this.taxRuleCurrencyConversionFactor;
    }

}
