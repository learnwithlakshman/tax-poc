
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxStructureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxStructureCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="BRACKET"/&gt;
 *     &lt;enumeration value="FLAT_TAX"/&gt;
 *     &lt;enumeration value="QUANTITY"/&gt;
 *     &lt;enumeration value="SINGLE_RATE"/&gt;
 *     &lt;enumeration value="TIERED"/&gt;
 *     &lt;enumeration value="QUANTITY_TIERED"/&gt;
 *     &lt;enumeration value="QUANTITY_RATE_TIERED"/&gt;
 *     &lt;enumeration value="TIERED_MODIFIER"/&gt;
 *     &lt;enumeration value="QUANTITY_TIERED_MODIFIER"/&gt;
 *     &lt;enumeration value="QUANTITY_RATE_TIERED_MODIFIER"/&gt;
 *     &lt;enumeration value="QUANTITY_TIERED_FLAT"/&gt;
 *     &lt;enumeration value="TIERED_FLAT"/&gt;
 *     &lt;enumeration value="QUANTITY_RATE_TIERED_EQUIVALENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxStructureCodeType")
@XmlEnum
public enum TaxStructureCodeType {


    /**
     * Tax is based on a the bracket tax schedule logic of a jurisdiction. Bracket tax
     *                         schedules are provided through Vertex data updates.
     *                     
     * 
     */
    BRACKET,

    /**
     * Tax is a flat fee amount that is applied uniformly to every transaction.
     *                     
     * 
     */
    FLAT_TAX,

    /**
     * Tax is based on either the number of units or the type of units in a
     *                         transaction.
     *                     
     * 
     */
    QUANTITY,

    /**
     * Tax is based on a single percentage rate.
     * 
     */
    SINGLE_RATE,

    /**
     * Tax varies, based on the levels of taxable amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    TIERED,

    /**
     * Tax varies, based on the levels of quantity amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    QUANTITY_TIERED,

    /**
     * Tax rate varies, based on the levels of quantity amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    QUANTITY_RATE_TIERED,

    /**
     * Tax varies with a modifying percentage, based on the levels of taxable amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    TIERED_MODIFIER,

    /**
     * Tax varies with a modifying percentage, based on the levels of quantity amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    QUANTITY_TIERED_MODIFIER,

    /**
     * Tax rate varies with a modifying percentage, based on the levels of quantity amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    QUANTITY_RATE_TIERED_MODIFIER,

    /**
     * Flat tax varies as a flat amount, based on the levels of quantity amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    QUANTITY_TIERED_FLAT,

    /**
     * Flat tax varies, based on the levels of taxable amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    TIERED_FLAT,

    /**
     * Tax varies, based on the levels of quantity amounts or equavlent quantity amounts defined by the
     *                         jurisdiction.
     *                     
     * 
     */
    QUANTITY_RATE_TIERED_EQUIVALENT;

    public String value() {
        return name();
    }

    public static TaxStructureCodeType fromValue(String v) {
        return valueOf(v);
    }

}
