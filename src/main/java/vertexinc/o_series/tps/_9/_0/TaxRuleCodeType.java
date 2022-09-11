
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRuleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRuleCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="TAXABILITY_RULE"/&gt;
 *     &lt;enumeration value="MAX_TAX_RULE"/&gt;
 *     &lt;enumeration value="TAX_BASIS_RULE"/&gt;
 *     &lt;enumeration value="RECOVERABILITY_RULE"/&gt;
 *     &lt;enumeration value="TAX_INCLUSION_RULE"/&gt;
 *     &lt;enumeration value="POST_CALCULATION_EVALUATION_RULE"/&gt;
 *     &lt;enumeration value="CREDIT_RULE"/&gt;
 *     &lt;enumeration value="BASIS_APPORTIONMENT_RULE"/&gt;
 *     &lt;enumeration value="INVOICE_TEXT_RULE"/&gt;
 *     &lt;enumeration value="TAX_RATE_ADJUSTMENT_RULE"/&gt;
 *     &lt;enumeration value="TAX_APPORTIONMENT_RULE"/&gt;
 *     &lt;enumeration value="TAX_ACCUMULATION_RULE"/&gt;
 *     &lt;enumeration value="REPORTING_BASIS_RULE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxRuleCodeType")
@XmlEnum
public enum TaxRuleCodeType {


    /**
     * Taxability Rule.
     * 
     */
    TAXABILITY_RULE,

    /**
     * Max Tax Rule.
     * 
     */
    MAX_TAX_RULE,

    /**
     * Tax Basis Rule.
     * 
     */
    TAX_BASIS_RULE,

    /**
     * Recoverability Rule.
     * 
     */
    RECOVERABILITY_RULE,

    /**
     * Tax Inclusion Rule.
     * 
     */
    TAX_INCLUSION_RULE,

    /**
     * Post Calculation Evaluation Rule.
     * 
     */
    POST_CALCULATION_EVALUATION_RULE,

    /**
     * Credit Rule.
     * 
     */
    CREDIT_RULE,

    /**
     * Basis Apportionment Rule.
     * 
     */
    BASIS_APPORTIONMENT_RULE,

    /**
     * Invoice Text Rule.
     * 
     */
    INVOICE_TEXT_RULE,

    /**
     * Tax Rate Adjustment Rule.
     * 
     */
    TAX_RATE_ADJUSTMENT_RULE,

    /**
     * Tax Apportionment Rule.
     * 
     */
    TAX_APPORTIONMENT_RULE,

    /**
     * Tax Accumulsation Rule.
     * 
     */
    TAX_ACCUMULATION_RULE,

    /**
     * Reporting Basis Rule.
     * 
     */
    REPORTING_BASIS_RULE;

    public String value() {
        return name();
    }

    public static TaxRuleCodeType fromValue(String v) {
        return valueOf(v);
    }

}
