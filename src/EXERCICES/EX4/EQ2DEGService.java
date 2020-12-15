package EXERCICES.EX4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(name = "eq2degWS",targetNamespace = "myservices")
public class EQ2DEGService {

    String respnse = "";
    @WebMethod(operationName = "resoudreEq2deg")
    public String resoudreEq(@WebParam(name = "A") double a,
                             @WebParam(name = "B") double b,
                             @WebParam(name = "C") double c)
    {

        if (a==0){
            respnse = "eq de 1er ordre...";
        }else{
            double delta = -b*4*a*c;
            if(delta>0){
                double x1=(-b-Math.sqrt(delta))/2*a;
                double x2=(b+Math.sqrt(delta))/2*a;

                respnse = "eq a 2 solutions..."+ x1 + " ET "+x2 ;

            }
            else if(delta==0){
                double x=(-b/2*a);
                respnse = "eq a seul solution..."+ x;
            }
            else {
                respnse = "eq n'a pas de solution dans R...";
            }
        }

        return respnse;


    }
}
