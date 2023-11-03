package filier;
import Etudiant.*;

import java.util.ArrayList;
import java.util.List;

public class Filier {
    private List<Etudiant> etudiants = new ArrayList<>();
    private String nom , code;
    private static int nb_etudiant = 0;
    private int nb_etu;

    public Filier(List<Etudiant> etudiant, String nom, String code) {
        this.etudiants = etudiant;
        this.nom = nom;
        this.code = code;
        nb_etu = nb_etudiant++;
    }
    //Ajouter etuidant
    public void ajouterEtudiant(String nom, String prenom, String cne, String cin, int age) {
          Etudiant etud = new Etudiant(nom,prenom,cne,cin,age);
          etudiants.add(etud);
    }
    public  void ajouterEtudiant(Etudiant etud){
        etudiants.add(etud);
    }

    public void setEtudiant(List<Etudiant> etudiant) {
        this.etudiants = etudiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static void setNb_etudiant(int nb_etudiant) {
        Filier.nb_etudiant = nb_etudiant;
    }

    public void setNb_etu(int nb_etu) {
        this.nb_etu = nb_etu;
    }

    @Override
    public String toString() {
        return "Filier{" +
                "etudiants=" + etudiants +'\n' +
                ", nom='" + nom + '\'' +
                ", code='" + code + '\'' +
                ", nb_etu=" + nb_etu +'\n' +
                '}';
    }
}
