
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for concreteFlightContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="concreteFlightContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concreteFlight" type="{http://service/}concreteFlight" minOccurs="0"/&gt;
 *         &lt;element name="flight" type="{http://service/}flight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concreteFlightContainer", propOrder = {
    "concreteFlight",
    "flight"
})
public class ConcreteFlightContainer {

    protected ConcreteFlight concreteFlight;
    protected Flight flight;

    /**
     * Gets the value of the concreteFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ConcreteFlight }
     *     
     */
    public ConcreteFlight getConcreteFlight() {
        return concreteFlight;
    }

    /**
     * Sets the value of the concreteFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcreteFlight }
     *     
     */
    public void setConcreteFlight(ConcreteFlight value) {
        this.concreteFlight = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight(Flight value) {
        this.flight = value;
    }
    
    public String toString() {
		return this.concreteFlight.toString() + "/" + this.flight.toString();
	}

}
