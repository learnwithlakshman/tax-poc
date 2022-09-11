
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncronizationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncronizationCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="MODIFY"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SyncronizationCodeType")
@XmlEnum
public enum SyncronizationCodeType {


    /**
     * O Series synchronization adds a line item.
     * 
     */
    ADD,

    /**
     * O Series synchronization modifies a line item. The line item to be modified must
     *                         have existed on a previous transaction.
     *                     
     * 
     */
    MODIFY,

    /**
     * O Series synchronization deletes a line item. The line item to be deleted must
     *                         have existed on a previous transaction.
     *                     
     * 
     */
    DELETE;

    public String value() {
        return name();
    }

    public static SyncronizationCodeType fromValue(String v) {
        return valueOf(v);
    }

}
