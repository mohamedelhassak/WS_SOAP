package EXERCICES.EX2;


import EXERCICES.EX2.proxy.ApproxPIService;
import EXERCICES.EX2.proxy.ApproxPI_Service;

public class Client {
    public static void main(String[] args) {
        ApproxPIService port =  new ApproxPI_Service().getApproxPIServicePort();

        System.out.println("******** [START...] Invoquation de la methode approxPI *********");
        System.out.println("Resultat : "+port.approxPI(10000));
        System.out.println("******** [END...] Invoquation de la methode approxPI *********");

    }
}
