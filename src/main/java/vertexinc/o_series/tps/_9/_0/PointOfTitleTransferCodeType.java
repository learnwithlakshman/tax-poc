
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfTitleTransferCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointOfTitleTransferCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ORIGIN"/&gt;
 *     &lt;enumeration value="IN_TRANSIT"/&gt;
 *     &lt;enumeration value="DESTINATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PointOfTitleTransferCodeType")
@XmlEnum
public enum PointOfTitleTransferCodeType {


    /**
     * The Title Transfer for the transaction occurred at the point of origin. The buyer
     *                         takes title at the origin and pays import tax when the goods clear customs.
     *                     
     * 
     */
    ORIGIN,

    /**
     * The Title Transfer is executed in transit (for example, on the high seas). In
     *                         this scenario, no VAT is charged.
     *                     
     * 
     */
    IN_TRANSIT,

    /**
     * The Title Transfer is executed at the destination. In this scenario, the supplier
     *                         is the importer of record and would be charged import VAT. Then, a domestic supply takes place
     *                         between the supplier and the buyer.
     *                     
     * 
     */
    DESTINATION;

    public String value() {
        return name();
    }

    public static PointOfTitleTransferCodeType fromValue(String v) {
        return valueOf(v);
    }

}
