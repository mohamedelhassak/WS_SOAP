package EXERCICES.EX1.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "BanqueService", targetNamespace = "http://EX1.EXERCICES/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface BanqueService {


    /**
     * @return returns java.util.List<exercices.ex1.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://EX1.EXERCICES/", className = "exercices.ex1.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://EX1.EXERCICES/", className = "exercices.ex1.GetComptesResponse")
    @Action(input = "http://EX1.EXERCICES/BanqueService/getComptesRequest", output = "http://EX1.EXERCICES/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

    /**
     * @param montant
     * @return returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDh", targetNamespace = "http://EX1.EXERCICES/", className = "exercices.ex1.ConversionEuroToDh")
    @ResponseWrapper(localName = "conversionEuroToDhResponse", targetNamespace = "http://EX1.EXERCICES/", className = "exercices.ex1.ConversionEuroToDhResponse")
    @Action(input = "http://EX1.EXERCICES/BanqueService/conversionEuroToDhRequest", output = "http://EX1.EXERCICES/BanqueService/conversionEuroToDhResponse")
    public double conversionEuroToDh(
            @WebParam(name = "montant", targetNamespace = "")
                    double montant);

    /**
     * @param code
     * @return returns exercices.ex1.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://EX1.EXERCICES/", className = "exercices.ex1.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://EX1.EXERCICES/", className = "exercices.ex1.GetCompteResponse")
    @Action(input = "http://EX1.EXERCICES/BanqueService/getCompteRequest", output = "http://EX1.EXERCICES/BanqueService/getCompteResponse")
    public Compte getCompte(
            @WebParam(name = "code", targetNamespace = "")
                    Long code);

}
