
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Result of a tax area changes query.
 * 
 * <p>Java class for IsTaxAreaChangedResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsTaxAreaChangedResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vertexinc:o-series:tps:9:0}TaxgisResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsTaxAreaChangedResponseType", propOrder = {
    "isChanged"
})
public class IsTaxAreaChangedResponseType
    extends TaxgisResponseType
{

    @XmlElement(name = "IsChanged", defaultValue = "false")
    protected boolean isChanged;

    /**
     * Gets the value of the isChanged property.
     * 
     */
    public boolean isIsChanged() {
        return isChanged;
    }

    /**
     * Sets the value of the isChanged property.
     * 
     */
    public void setIsChanged(boolean value) {
        this.isChanged = value;
    }

}
