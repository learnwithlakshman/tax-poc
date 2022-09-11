
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Parent type for all Tax Synchronization request messages
 * 
 * <p>Java class for TaxSynchronizationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSynchronizationRequestType"&gt;
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
@XmlType(name = "TaxSynchronizationRequestType")
@XmlSeeAlso({
    AccrualSyncRequestType.class,
    APInvoiceSyncRequestType.class,
    ARBillingSyncRequestType.class,
    DeleteRequestType.class,
    ReversalRequestType.class,
    RollbackRequestType.class,
    TransactionExistsRequestType.class
})
public class TaxSynchronizationRequestType {


}
