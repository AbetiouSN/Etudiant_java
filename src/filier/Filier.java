package filier;
import Etudiant.*;

import java.util.ArrayList;
import java.util.List;

public class Filier {
    private List<Etudiant> etudiant = new ArrayList<>();
    private String nom , code;
    private static int nb_etudiant = 0;
    private int nb_etu;

    public Filier(List<Etudiant> etudiant, String nom, String code) {
        this.etudiant = etudiant;
        this.nom = nom;
        this.code = code;
        nb_etu = nb_etudiant++;
    }
    //Ajouter etuidant
    public void ajouterEtudiant(Matiere matiere, double note) {
//        Note nouvelleNote = new Note(matiere, this, note);
//        notes.add(nouvelleNote);
    }

    public void setEtudiant(List<Etudiant> etudiant) {
        this.etudiant = etudiant;
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
}
