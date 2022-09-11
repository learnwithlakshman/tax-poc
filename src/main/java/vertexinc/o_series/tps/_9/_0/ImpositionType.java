
package vertexinc.o_series.tps._9._0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="userDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="impositionTypeId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="withholdingType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlRootElement(name = "ImpositionType")
public class ImpositionType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "userDefined")
    protected Boolean userDefined;
    @XmlAttribute(name = "impositionTypeId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger impositionTypeId;
    @XmlAttribute(name = "withholdingType")
    protected String withholdingType;

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

    /**
     * Gets the value of the impositionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImpositionTypeId() {
        return impositionTypeId;
    }

    /**
     * Sets the value of the impositionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImpositionTypeId(BigInteger value) {
        this.impositionTypeId = value;
    }

    /**
     * Gets the value of the withholdingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingType() {
        return withholdingType;
    }

    /**
     * Sets the value of the withholdingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingType(String value) {
        this.withholdingType = value;
    }

}
