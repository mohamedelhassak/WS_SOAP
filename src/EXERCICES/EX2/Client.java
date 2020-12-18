package EXERCICES.EX2;


import EXERCICES.EX2.proxy.ApproxPIService;
import EXERCICES.EX2.proxy.ApproxPI_Service;

import javax.swing.*;
import javax.xml.ws.WebServiceException;

public class Client {
    public static void main(String[] args) {
        ApproxPIService port = new ApproxPI_Service().getApproxPIServicePort();

        try {
            System.out.println("******** [START...] Invoquation de la methode approxPI *********");
            System.out.println("Resultat : " + port.approxPI(10000));
            System.out.println("******** [END...] Invoquation de la methode approxPI *********");
        } catch (WebServiceException e) {
            JOptionPane.showMessageDialog(null,
                    "Le service recherche n'exist pas ou \n Le serveur JAX-WS n'est pas demarre",
                    "Erreur !!", JOptionPane.ERROR_MESSAGE);
        }

    }
}
