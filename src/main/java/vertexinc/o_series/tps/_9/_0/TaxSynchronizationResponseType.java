
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Parent type for all Tax Synchronziation response message
 * 
 * <p>Java class for TaxSynchronizationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSynchronizationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSynchronizationResponseType")
@XmlSeeAlso({
    AccrualSyncResponseType.class,
    APInvoiceSyncResponseType.class,
    ARBillingSyncResponseType.class,
    DeleteResponseType.class,
    ReversalResponseType.class,
    RollbackResponseType.class,
    TransactionExistsResponseType.class
})
public class TaxSynchronizationResponseType {


}
