package EXERCICES.EX3;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@WebService(name = "etudiantService", targetNamespace = "myservices")
public class EtudiantSOAPService {

    List<Etudiant> etudiants = new ArrayList<>();

    public EtudiantSOAPService() {
        etudiants.add(new Etudiant(null, "mohamed", "elhassak", 12.0, 15.0));
        etudiants.add(new Etudiant(null, "abdessamad", "allabouche", 14.0, 16.0));
        etudiants.add(new Etudiant(null, "soukayna", "bousfiha", 1.0, 15.0));
    }

    @WebMethod(operationName = "getEtudiants")
    public List<Etudiant> getEtudiants() {

        return etudiants;
    }


    @WebMethod(operationName = "ajouterEtudiant", exclude = true)
    public boolean ajouterEtudiant(@WebParam(name = "e") Etudiant e) {

        return etudiants.add(e);
    }


    @WebMethod(operationName = "getNote", exclude = false)
    public double getNote(@WebParam(name = "name") String name) {

        double note = 0;
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getNom().equals(name)) {
                note = (etudiants.get(i).getNote1() + etudiants.get(i).getNote2()) / 2;
            }
        }

        return note;
    }


    @WebMethod(operationName = "getEtudiantsValidants", exclude = false)
    public List<Etudiant> getEtudiantsValidants() {

        List<Etudiant> etudiantsVal = new ArrayList<>();

        for (int i = 0; i < etudiants.size(); i++) {
            double note = (etudiants.get(i).getNote1() + etudiants.get(i).getNote2()) / 2;
            if (note > 12) {
                etudiantsVal.add(etudiants.get(i));
            }
        }

        return etudiantsVal;
    }


    @WebMethod(operationName = "getEtudiantsMajorants", exclude = false)
    public List<Etudiant> getMajorants() {

        List<Etudiant> etudiantsMaj = new ArrayList<>();

        for (int i = 0; i < etudiants.size(); i++) {
            double note = (etudiants.get(i).getNote1() + etudiants.get(i).getNote2()) / 2;
            if (note > 16) {
                etudiantsMaj.add(etudiants.get(i));
            }
        }

        return etudiantsMaj;
    }


    @WebMethod(operationName = "getEtudiantsTries", exclude = false)
    public List<Etudiant> getEtudiantsTriers() {
        List<Etudiant> etudiantsTries = new ArrayList<>();

        etudiants.forEach(e -> {
            etudiantsTries.add(e);
        });

        Collections.sort(etudiantsTries, null);

        return etudiantsTries;

    }

}
