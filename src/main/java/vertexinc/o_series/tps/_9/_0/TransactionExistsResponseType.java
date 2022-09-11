
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Transaction Exists Response message.
 * 
 * <p>Java class for TransactionExistsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionExistsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vertexinc:o-series:tps:9:0}TaxSynchronizationResponseType"&gt;
 *       &lt;attribute name="transactionId" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="40"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="transactionExistsIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionExistsResponseType")
public class TransactionExistsResponseType
    extends TaxSynchronizationResponseType
{

    @XmlAttribute(name = "transactionId", required = true)
    protected String transactionId;
    @XmlAttribute(name = "transactionExistsIndicator", required = true)
    protected boolean transactionExistsIndicator;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionExistsIndicator property.
     * 
     */
    public boolean isTransactionExistsIndicator() {
        return transactionExistsIndicator;
    }

    /**
     * Sets the value of the transactionExistsIndicator property.
     * 
     */
    public void setTransactionExistsIndicator(boolean value) {
        this.transactionExistsIndicator = value;
    }

}
