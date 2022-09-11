
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxOverrideCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxOverrideCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="TAXABLE"/&gt;
 *     &lt;enumeration value="NONTAXABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxOverrideCodeType")
@XmlEnum
public enum TaxOverrideCodeType {


    /**
     * Indicates the line item is subject to tax.
     * 
     */
    TAXABLE,

    /**
     * Indicates the line item is not subject to tax. You can indicate the reason in the
     *                         overrideReasonCode attribute.
     *                     
     * 
     */
    NONTAXABLE;

    public String value() {
        return name();
    }

    public static TaxOverrideCodeType fromValue(String v) {
        return valueOf(v);
    }

}
