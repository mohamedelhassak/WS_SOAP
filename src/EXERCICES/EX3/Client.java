package EXERCICES.EX3;

import EXERCICES.EX3.proxy.EtudiantSOAPServiceService;
import EXERCICES.EX3.proxy.EtudiantService;

public class Client {
    public static void main(String[] args) {
        EtudiantService port = new EtudiantSOAPServiceService().getEtudiantServicePort();

        System.out.println("**********************************************************");

        //consulter les data
        System.out.println("********** CONSULTER LES ETUDIANTS ************");
        port.getEtudiants().forEach(e->{
            System.out.println("[Nom : ]"+e.getNom() +" "+ e.getPrenom());
        });

        System.out.println("**********************************************************");


        //consulter la note de mohamed
        System.out.println("********** CONSULTER LA NOTE ************");
        System.out.println("[Note de mohamed ] "+port.getNote("mohamed"));

        System.out.println("**********************************************************");

        //consulter la liste des validants
        System.out.println("********** CONSULTER LES ETUDIANTS VALIDANTS ************");
        port.getEtudiantsValidants().forEach(e->{
            System.out.println("[Nom : ]"+e.getNom() +" "+ e.getPrenom());
        });

        System.out.println("**********************************************************");

        //consulter la liste des majorants
        System.out.println("********** CONSULTER LES ETUDIANTS MAJORANTS ************");
        port.getEtudiantsMajorants().forEach(e->{
            System.out.println("[Nom : ]"+e.getNom() +" "+ e.getPrenom());
        });

    }
}
