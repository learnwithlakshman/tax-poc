
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryTermCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryTermCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="SUP"/&gt;
 *     &lt;enumeration value="CUS"/&gt;
 *     &lt;enumeration value="DPU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryTermCodeType")
@XmlEnum
public enum DeliveryTermCodeType {


    /**
     * Ex Works (EXW).The customer is the importer of record. 
     * 
     */
    EXW,

    /**
     * Free Carrier (FCA). The customer is the importer of record.
     * 
     */
    FCA,

    /**
     * Free Along Side Ship (FAS). The customer is the importer of record.
     * 
     */
    FAS,

    /**
     * Free Onboard Vessel (FOB). The customer is the importer of record.
     * 
     */
    FOB,

    /**
     * Cost and Freight (CFR). The customer is the importer of record.
     * 
     */
    CFR,

    /**
     * Cost Insurance and Freight (CIF). The customer is the importer of record.
     * 
     */
    CIF,

    /**
     * Carriage Paid To (CPT). The customer is the importer of record.
     * 
     */
    CPT,

    /**
     * Carriage Insurance Paid To (CIP).The customer is the importer of record.
     * 
     */
    CIP,

    /**
     * Delivered at Frontier (DAF). The customer is the importer of record. While this identifier was removed from active use in 2010, O Series will process it. 
     * 
     */
    DAF,

    /**
     * Delivered Ex Ship (DES). The customer is the importer of record. While this identifier was removed from active use in 2010, O Series will process it. 
     * 
     */
    DES,

    /**
     * Delivered Ex Quay Duty Unpaid (DEQ). The customer is the importer of record. While this identifier was removed from active use in 2010, O Series will process it. 
     * 
     */
    DEQ,

    /**
     * Delivery Duty Unpaid (DDU). The customer is the importer of record. While this identifier was removed from active use in 2010, O Series will process it. 
     * 
     */
    DDU,

    /**
     *  Delivery Duty Paid (DDP).The Supplier is the importer of record.
     * 
     */
    DDP,

    /**
     * Delivered at Place (DAP). The customer is the importer of record.
     * 
     */
    DAP,

    /**
     * Delivered at Terminal (DAT). The customer is the importer of record.
     * 
     */
    DAT,

    /**
     * Supplier Ships (SUP). The Supplier is the importer of record.
     * 
     */
    SUP,

    /**
     * Customer Ships (CUS). The customer is the importer of record.
     * 
     */
    CUS,

    /**
     * Delivered at Place Unloaded. The customer is the importer of record.
     * 
     */
    DPU;

    public String value() {
        return name();
    }

    public static DeliveryTermCodeType fromValue(String v) {
        return valueOf(v);
    }

}
