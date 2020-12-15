package EXERCICES.EX1;

import EXERCICES.EX1.proxy.BanqueService;
import EXERCICES.EX1.proxy.BanqueWS;

public class Client {
    public static void main(String[] args) throws Exception {

        BanqueService port = new BanqueWS().getBanqueServicePort();

        //invoker conversion
        System.out.println(port.conversionEuroToDh(3));

        //invoker getCompte
        System.out.println(port.getCompte(1L).getCode());

        //invoker getComptes
        port.getComptes().forEach(c->{
            System.out.println(c.getCode());
        });

    }
}
