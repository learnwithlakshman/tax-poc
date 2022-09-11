
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxCollectedFromPartyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxCollectedFromPartyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="SELLER"/&gt;
 *     &lt;enumeration value="BUYER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxCollectedFromPartyType")
@XmlEnum
public enum TaxCollectedFromPartyType {


    /**
     * In Supplies transactions, the Seller is equivalent to the Taxpayer
     *                         responsible for collecting and remitting tax.
     *                     
     * 
     */
    SELLER,

    /**
     * In Sales tax or Value Added Tax Supplies transactions, the Buyer is
     *                         equivalent to the Customer receiving goods or services.
     *                     
     * 
     */
    BUYER;

    public String value() {
        return name();
    }

    public static TaxCollectedFromPartyType fromValue(String v) {
        return valueOf(v);
    }

}
