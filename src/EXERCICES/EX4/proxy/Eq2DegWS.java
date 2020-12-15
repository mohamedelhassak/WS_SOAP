
package EXERCICES.EX4.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "eq2degWS", targetNamespace = "myservices")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Eq2DegWS {


    /**
     * 
     * @param a
     * @param b
     * @param c
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "resoudreEq2deg")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resoudreEq2deg", targetNamespace = "myservices", className = "proxy.ResoudreEq2Deg")
    @ResponseWrapper(localName = "resoudreEq2degResponse", targetNamespace = "myservices", className = "proxy.ResoudreEq2DegResponse")
    @Action(input = "myservices/eq2degWS/resoudreEq2degRequest", output = "myservices/eq2degWS/resoudreEq2degResponse")
    public String resoudreEq2Deg(
        @WebParam(name = "A", targetNamespace = "")
        double a,
        @WebParam(name = "B", targetNamespace = "")
        double b,
        @WebParam(name = "C", targetNamespace = "")
        double c);

}
