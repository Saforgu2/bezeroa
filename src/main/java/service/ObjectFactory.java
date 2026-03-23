
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllDepartingCities_QNAME = new QName("http://service/", "getAllDepartingCities");
    private final static QName _GetAllDepartingCitiesResponse_QNAME = new QName("http://service/", "getAllDepartingCitiesResponse");
    private final static QName _GetArrivalCitiesFrom_QNAME = new QName("http://service/", "getArrivalCitiesFrom");
    private final static QName _GetArrivalCitiesFromResponse_QNAME = new QName("http://service/", "getArrivalCitiesFromResponse");
    private final static QName _GetConcreteFlights_QNAME = new QName("http://service/", "getConcreteFlights");
    private final static QName _GetConcreteFlightsResponse_QNAME = new QName("http://service/", "getConcreteFlightsResponse");
    private final static QName _GetContainerConcreteFlights_QNAME = new QName("http://service/", "getContainerConcreteFlights");
    private final static QName _GetContainerConcreteFlightsResponse_QNAME = new QName("http://service/", "getContainerConcreteFlightsResponse");
    private final static QName _Register_QNAME = new QName("http://service/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://service/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllDepartingCities }
     * 
     */
    public GetAllDepartingCities createGetAllDepartingCities() {
        return new GetAllDepartingCities();
    }

    /**
     * Create an instance of {@link GetAllDepartingCitiesResponse }
     * 
     */
    public GetAllDepartingCitiesResponse createGetAllDepartingCitiesResponse() {
        return new GetAllDepartingCitiesResponse();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFrom }
     * 
     */
    public GetArrivalCitiesFrom createGetArrivalCitiesFrom() {
        return new GetArrivalCitiesFrom();
    }

    /**
     * Create an instance of {@link GetArrivalCitiesFromResponse }
     * 
     */
    public GetArrivalCitiesFromResponse createGetArrivalCitiesFromResponse() {
        return new GetArrivalCitiesFromResponse();
    }

    /**
     * Create an instance of {@link GetConcreteFlights }
     * 
     */
    public GetConcreteFlights createGetConcreteFlights() {
        return new GetConcreteFlights();
    }

    /**
     * Create an instance of {@link GetConcreteFlightsResponse }
     * 
     */
    public GetConcreteFlightsResponse createGetConcreteFlightsResponse() {
        return new GetConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link GetContainerConcreteFlights }
     * 
     */
    public GetContainerConcreteFlights createGetContainerConcreteFlights() {
        return new GetContainerConcreteFlights();
    }

    /**
     * Create an instance of {@link GetContainerConcreteFlightsResponse }
     * 
     */
    public GetContainerConcreteFlightsResponse createGetContainerConcreteFlightsResponse() {
        return new GetContainerConcreteFlightsResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link ConcreteFlight }
     * 
     */
    public ConcreteFlight createConcreteFlight() {
        return new ConcreteFlight();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link ConcreteFlightContainer }
     * 
     */
    public ConcreteFlightContainer createConcreteFlightContainer() {
        return new ConcreteFlightContainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllDepartingCities")
    public JAXBElement<GetAllDepartingCities> createGetAllDepartingCities(GetAllDepartingCities value) {
        return new JAXBElement<GetAllDepartingCities>(_GetAllDepartingCities_QNAME, GetAllDepartingCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllDepartingCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllDepartingCitiesResponse")
    public JAXBElement<GetAllDepartingCitiesResponse> createGetAllDepartingCitiesResponse(GetAllDepartingCitiesResponse value) {
        return new JAXBElement<GetAllDepartingCitiesResponse>(_GetAllDepartingCitiesResponse_QNAME, GetAllDepartingCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFrom }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getArrivalCitiesFrom")
    public JAXBElement<GetArrivalCitiesFrom> createGetArrivalCitiesFrom(GetArrivalCitiesFrom value) {
        return new JAXBElement<GetArrivalCitiesFrom>(_GetArrivalCitiesFrom_QNAME, GetArrivalCitiesFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArrivalCitiesFromResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getArrivalCitiesFromResponse")
    public JAXBElement<GetArrivalCitiesFromResponse> createGetArrivalCitiesFromResponse(GetArrivalCitiesFromResponse value) {
        return new JAXBElement<GetArrivalCitiesFromResponse>(_GetArrivalCitiesFromResponse_QNAME, GetArrivalCitiesFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getConcreteFlights")
    public JAXBElement<GetConcreteFlights> createGetConcreteFlights(GetConcreteFlights value) {
        return new JAXBElement<GetConcreteFlights>(_GetConcreteFlights_QNAME, GetConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getConcreteFlightsResponse")
    public JAXBElement<GetConcreteFlightsResponse> createGetConcreteFlightsResponse(GetConcreteFlightsResponse value) {
        return new JAXBElement<GetConcreteFlightsResponse>(_GetConcreteFlightsResponse_QNAME, GetConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getContainerConcreteFlights")
    public JAXBElement<GetContainerConcreteFlights> createGetContainerConcreteFlights(GetContainerConcreteFlights value) {
        return new JAXBElement<GetContainerConcreteFlights>(_GetContainerConcreteFlights_QNAME, GetContainerConcreteFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContainerConcreteFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getContainerConcreteFlightsResponse")
    public JAXBElement<GetContainerConcreteFlightsResponse> createGetContainerConcreteFlightsResponse(GetContainerConcreteFlightsResponse value) {
        return new JAXBElement<GetContainerConcreteFlightsResponse>(_GetContainerConcreteFlightsResponse_QNAME, GetContainerConcreteFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
