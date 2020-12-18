package EXERCICES.EX3.proxy;

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
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEtudiants_QNAME = new QName("myservices", "getEtudiants");
    private final static QName _GetEtudiantsMajorants_QNAME = new QName("myservices", "getEtudiantsMajorants");
    private final static QName _GetEtudiantsMajorantsResponse_QNAME = new QName("myservices", "getEtudiantsMajorantsResponse");
    private final static QName _GetEtudiantsValidantsResponse_QNAME = new QName("myservices", "getEtudiantsValidantsResponse");
    private final static QName _GetNote_QNAME = new QName("myservices", "getNote");
    private final static QName _GetNoteResponse_QNAME = new QName("myservices", "getNoteResponse");
    private final static QName _GetEtudiantsResponse_QNAME = new QName("myservices", "getEtudiantsResponse");
    private final static QName _GetEtudiantsValidants_QNAME = new QName("myservices", "getEtudiantsValidants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myservices
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNoteResponse }
     */
    public GetNoteResponse createGetNoteResponse() {
        return new GetNoteResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantsResponse }
     */
    public GetEtudiantsResponse createGetEtudiantsResponse() {
        return new GetEtudiantsResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantsValidants }
     */
    public GetEtudiantsValidants createGetEtudiantsValidants() {
        return new GetEtudiantsValidants();
    }

    /**
     * Create an instance of {@link GetEtudiants }
     */
    public GetEtudiants createGetEtudiants() {
        return new GetEtudiants();
    }

    /**
     * Create an instance of {@link GetEtudiantsMajorants }
     */
    public GetEtudiantsMajorants createGetEtudiantsMajorants() {
        return new GetEtudiantsMajorants();
    }

    /**
     * Create an instance of {@link GetEtudiantsMajorantsResponse }
     */
    public GetEtudiantsMajorantsResponse createGetEtudiantsMajorantsResponse() {
        return new GetEtudiantsMajorantsResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantsValidantsResponse }
     */
    public GetEtudiantsValidantsResponse createGetEtudiantsValidantsResponse() {
        return new GetEtudiantsValidantsResponse();
    }

    /**
     * Create an instance of {@link GetNote }
     */
    public GetNote createGetNote() {
        return new GetNote();
    }

    /**
     * Create an instance of {@link Etudiant }
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getEtudiants")
    public JAXBElement<GetEtudiants> createGetEtudiants(GetEtudiants value) {
        return new JAXBElement<GetEtudiants>(_GetEtudiants_QNAME, GetEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsMajorants }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getEtudiantsMajorants")
    public JAXBElement<GetEtudiantsMajorants> createGetEtudiantsMajorants(GetEtudiantsMajorants value) {
        return new JAXBElement<GetEtudiantsMajorants>(_GetEtudiantsMajorants_QNAME, GetEtudiantsMajorants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsMajorantsResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getEtudiantsMajorantsResponse")
    public JAXBElement<GetEtudiantsMajorantsResponse> createGetEtudiantsMajorantsResponse(GetEtudiantsMajorantsResponse value) {
        return new JAXBElement<GetEtudiantsMajorantsResponse>(_GetEtudiantsMajorantsResponse_QNAME, GetEtudiantsMajorantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsValidantsResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getEtudiantsValidantsResponse")
    public JAXBElement<GetEtudiantsValidantsResponse> createGetEtudiantsValidantsResponse(GetEtudiantsValidantsResponse value) {
        return new JAXBElement<GetEtudiantsValidantsResponse>(_GetEtudiantsValidantsResponse_QNAME, GetEtudiantsValidantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNote }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getNote")
    public JAXBElement<GetNote> createGetNote(GetNote value) {
        return new JAXBElement<GetNote>(_GetNote_QNAME, GetNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getNoteResponse")
    public JAXBElement<GetNoteResponse> createGetNoteResponse(GetNoteResponse value) {
        return new JAXBElement<GetNoteResponse>(_GetNoteResponse_QNAME, GetNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getEtudiantsResponse")
    public JAXBElement<GetEtudiantsResponse> createGetEtudiantsResponse(GetEtudiantsResponse value) {
        return new JAXBElement<GetEtudiantsResponse>(_GetEtudiantsResponse_QNAME, GetEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsValidants }{@code >}}
     */
    @XmlElementDecl(namespace = "myservices", name = "getEtudiantsValidants")
    public JAXBElement<GetEtudiantsValidants> createGetEtudiantsValidants(GetEtudiantsValidants value) {
        return new JAXBElement<GetEtudiantsValidants>(_GetEtudiantsValidants_QNAME, GetEtudiantsValidants.class, null, value);
    }

}
