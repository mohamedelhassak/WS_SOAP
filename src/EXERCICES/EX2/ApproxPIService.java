package EXERCICES.EX2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "ApproxPI",targetNamespace = "myservices")
public class ApproxPIService {

    @WebMethod(operationName = "approxPI")
    public Double calcApproxPI(@WebParam(name = "max") int m) {

        double somme=0;  //PI/4
        for (int i=0; i<m; i++)
            somme += Math.pow(-1, i)/(2*i+1);

        return 4*somme;

    }
}
