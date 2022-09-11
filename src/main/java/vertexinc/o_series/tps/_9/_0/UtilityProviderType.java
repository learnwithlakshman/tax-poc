
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityProviderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtilityProviderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="REGULATED_TAXPAYER"/&gt;
 *     &lt;enumeration value="UNREGULATED_TAXPAYER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UtilityProviderType")
@XmlEnum
public enum UtilityProviderType {

    REGULATED_TAXPAYER,
    UNREGULATED_TAXPAYER;

    public String value() {
        return name();
    }

    public static UtilityProviderType fromValue(String v) {
        return valueOf(v);
    }

}
