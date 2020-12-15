import EXERCICES.EX1.BanqueService;
import EXERCICES.EX2.ApproxPIService;
import EXERCICES.EX3.EtudiantSOAPService;

import javax.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args) {
        /***********************************************************
         *                     definir les URLs                    *
         ***********************************************************/

        String URL_EX1 = "http://localhost:8088/EX1";
        String URL_EX2 = "http://localhost:8089/EX2";
        String URL_EX3 = "http://localhost:8087/EX3";


        /***********************************************************
        *                deployer les services                     *
        ***********************************************************/

        //deployer EX1
        //Endpoint.publish(URL_EX1,new BanqueService());

        //deployer EX2
        //Endpoint.publish(URL_EX2,new ApproxPIService());
        //System.out.println("Web Service Demarre sur "+URL_EX2+" ...");

        Endpoint.publish(URL_EX3,new EtudiantSOAPService());
        System.out.println("Web Service Demarre sur "+URL_EX3+" ...");
    }
}
