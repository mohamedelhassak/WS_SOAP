
package EXERCICES.EX2.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the myservices package. 
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

    private final static QName _ApproxPIResponse_QNAME = new QName("myservices", "approxPIResponse");
    private final static QName _ApproxPI_QNAME = new QName("myservices", "approxPI");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApproxPIResponse }
     * 
     */
    public ApproxPIResponse createApproxPIResponse() {
        return new ApproxPIResponse();
    }

    /**
     * Create an instance of {@link ApproxPI }
     * 
     */
    public ApproxPI createApproxPI() {
        return new ApproxPI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproxPIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "myservices", name = "approxPIResponse")
    public JAXBElement<ApproxPIResponse> createApproxPIResponse(ApproxPIResponse value) {
        return new JAXBElement<ApproxPIResponse>(_ApproxPIResponse_QNAME, ApproxPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproxPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "myservices", name = "approxPI")
    public JAXBElement<ApproxPI> createApproxPI(ApproxPI value) {
        return new JAXBElement<ApproxPI>(_ApproxPI_QNAME, ApproxPI.class, null, value);
    }

}
