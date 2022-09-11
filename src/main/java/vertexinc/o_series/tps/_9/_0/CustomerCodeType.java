
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:vertexinc:o-series:tps:9:0&gt;CompanyCodeType"&gt;
 *       &lt;attribute name="isBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCodeType")
public class CustomerCodeType
    extends CompanyCodeType
{

    @XmlAttribute(name = "isBusinessIndicator")
    protected Boolean isBusinessIndicator;

    /**
     * Gets the value of the isBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBusinessIndicator() {
        return isBusinessIndicator;
    }

    /**
     * Sets the value of the isBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBusinessIndicator(Boolean value) {
        this.isBusinessIndicator = value;
    }

}
