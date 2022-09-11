
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindChangedTaxAreaIdsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindChangedTaxAreaIdsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:vertexinc:o-series:tps:9:0}TaxgisRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatePeriod"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{urn:vertexinc:o-series:tps:9:0}DatePeriodType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindChangedTaxAreaIdsRequestType", propOrder = {
    "datePeriod"
})
public class FindChangedTaxAreaIdsRequestType
    extends TaxgisRequestType
{

    @XmlElement(name = "DatePeriod", required = true)
    protected FindChangedTaxAreaIdsRequestType.DatePeriod datePeriod;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FindChangedTaxAreaIdsRequestType.DatePeriod }
     *     
     */
    public FindChangedTaxAreaIdsRequestType.DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindChangedTaxAreaIdsRequestType.DatePeriod }
     *     
     */
    public void setDatePeriod(FindChangedTaxAreaIdsRequestType.DatePeriod value) {
        this.datePeriod = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{urn:vertexinc:o-series:tps:9:0}DatePeriodType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DatePeriod
        extends DatePeriodType
    {


    }

}
