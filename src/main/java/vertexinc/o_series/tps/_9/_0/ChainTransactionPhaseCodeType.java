
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChainTransactionPhaseCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChainTransactionPhaseCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="MANUFACTURER"/&gt;
 *     &lt;enumeration value="INTERMEDIARY"/&gt;
 *     &lt;enumeration value="FINAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChainTransactionPhaseCodeType")
@XmlEnum
public enum ChainTransactionPhaseCodeType {


    /**
     * An entity that creates some good or tangible property.
     * 
     */
    MANUFACTURER,

    /**
     * A third-party entity between the manufacturer that creates the good or tangible
     *                         property and the final consumer of the good or property. This is a Domestic VAT scenario.
     *                     
     * 
     */
    INTERMEDIARY,

    /**
     * An entity that is the final consumer of the good or tangible property. This is an
     *                         Intra-EU, Zero Rate VAT scenario.
     *                     
     * 
     */
    FINAL;

    public String value() {
        return name();
    }

    public static ChainTransactionPhaseCodeType fromValue(String v) {
        return valueOf(v);
    }

}
