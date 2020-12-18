package EXERCICES.EX4.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the proxy package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResoudreEq2DegResponse_QNAME = new QName("myservices", "resoudreEq2degResponse");
    private final static QName _ResoudreEq2Deg_QNAME = new QName("myservices", "resoudreEq2deg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResoudreEq2Deg }
     */
    public ResoudreEq2Deg createResoudreEq2Deg() {
        return new ResoudreEq2Deg();
    }

    /**
     * Create an instance of {@link ResoudreEq2DegResponse }
     */
    public ResoudreEq2DegResponse createResoudreEq2DegResponse() {
        return new ResoudreEq2DegResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResoudreEq2DegResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "resoudreEq2degResponse")
    public JAXBElement<ResoudreEq2DegResponse> createResoudreEq2DegResponse(ResoudreEq2DegResponse value) {
        return new JAXBElement<ResoudreEq2DegResponse>(_ResoudreEq2DegResponse_QNAME, ResoudreEq2DegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResoudreEq2Deg }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "resoudreEq2deg")
    public JAXBElement<ResoudreEq2Deg> createResoudreEq2Deg(ResoudreEq2Deg value) {
        return new JAXBElement<ResoudreEq2Deg>(_ResoudreEq2Deg_QNAME, ResoudreEq2Deg.class, null, value);
    }

}
