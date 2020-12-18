package EXERCICES.EX1;

import EXERCICES.EX1.proxy.BanqueService;
import EXERCICES.EX1.proxy.BanqueWS;

import javax.swing.*;
import javax.xml.ws.WebServiceException;

public class Client {
    public static void main(String[] args) throws Exception {

        try {
            BanqueService port = new BanqueWS().getBanqueServicePort();

            //invoker conversion
            System.out.println(port.conversionEuroToDh(3));

            //invoker getCompte
            System.out.println(port.getCompte(1L).getCode());

            //invoker getComptes
            port.getComptes().forEach(c -> {
                System.out.println(c.getCode());
            });
        } catch (WebServiceException e) {
            JOptionPane.showMessageDialog(null,
                    "Le service recherche n'exist pas ou \n Le serveur JAX-WS n'est pas demarre",
                    "Erreur !!", JOptionPane.ERROR_MESSAGE);
        }

    }
}
