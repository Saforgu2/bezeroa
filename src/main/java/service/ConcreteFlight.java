
package service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for concreteFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="concreteFlight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concreteFlightCode" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="bussinesNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="touristNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firstNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flight" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concreteFlight", propOrder = {
    "concreteFlightCode",
    "date",
    "bussinesNumber",
    "touristNumber",
    "firstNumber",
    "time",
    "flight"
})
public class ConcreteFlight {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String concreteFlightCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected int bussinesNumber;
    protected int touristNumber;
    protected int firstNumber;
    protected String time;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object flight;

    /**
     * Gets the value of the concreteFlightCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcreteFlightCode() {
        return concreteFlightCode;
    }

    /**
     * Sets the value of the concreteFlightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcreteFlightCode(String value) {
        this.concreteFlightCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the bussinesNumber property.
     * 
     */
    public int getBussinesNumber() {
        return bussinesNumber;
    }

    /**
     * Sets the value of the bussinesNumber property.
     * 
     */
    public void setBussinesNumber(int value) {
        this.bussinesNumber = value;
    }

    /**
     * Gets the value of the touristNumber property.
     * 
     */
    public int getTouristNumber() {
        return touristNumber;
    }

    /**
     * Sets the value of the touristNumber property.
     * 
     */
    public void setTouristNumber(int value) {
        this.touristNumber = value;
    }

    /**
     * Gets the value of the firstNumber property.
     * 
     */
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * Sets the value of the firstNumber property.
     * 
     */
    public void setFirstNumber(int value) {
        this.firstNumber = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFlight(Object value) {
        this.flight = value;
    }
    
    public String toString() {
    	Calendar calendar = date.toGregorianCalendar();
    	int year = calendar.get(Calendar.YEAR);
    	//Add one to month {0 - 11}
    	int month = calendar.get(Calendar.MONTH) + 1;
    	int day = calendar.get(Calendar.DAY_OF_MONTH);
    	
    	return flight.toString()+"-"+(year)+"/"+(month)+"/"+day+"/"+time+"-->"+bussinesNumber+"/"+firstNumber+"/"+touristNumber;}

}
