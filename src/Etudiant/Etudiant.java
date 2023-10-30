package Etudiant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Etudiant {
    private String nom,prenom,cne,cin;
    private List<Note> notes = new ArrayList<>();

    private int age;
    static int nbr_etudiant = 0;
    private int nbr_etu;

    public Etudiant(String nom, String prenom, String cne, String cin, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.cin = cin;
        this.age = age;
        this.nbr_etu = nbr_etudiant++;
    }

    public String getNom() {return nom;}

    public void setNom(String nom) { this.nom = nom;}

    public String getPrenom() {return prenom;}

    public void setPrenom(String prenom) {this.prenom = prenom;}

    public String getCne() {return cne; }

    public void setCne(String cne) {this.cne = cne;}

    public String getCin() {return cin; }

    public static int getNbr_etudiant() {return nbr_etudiant;}

    public int getNbr_etu() {return nbr_etu;}

    public void setCin(String cin) {this.cin = cin;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    //Ajouter la note de l'etudiant
    public void ajouterNote(Matiere matiere, double note) {
        Note nouvelleNote = new Note(matiere, this, note);
        notes.add(nouvelleNote);
    }

    //calculer la moyenne
    public double calculerMoyenne() {
        if (notes.isEmpty()) {
            return 0.0; // Pas de notes, la moyenne est 0.
        }

        double somme = 0.0;
        for (Note note : notes) {
            somme += note.getNote();
        }

        return somme / notes.size();
    }

    public void afficherInformations() {
        System.out.print("Nom: " + nom +" | ");
        System.out.print("Prenom: " + prenom+" | ");
        System.out.print("CNE: " + cne+" | ");
        System.out.print("CIN: " + cin+" | ");
        System.out.print("Age: " + age+" | ");
        System.out.println();
        System.out.println("Notes:");
        for (Note note : notes) {
            System.out.print("Matiere: " + note.getMatiere().getNom()+" | ");
            System.out.println("Note: " + note.getNote());
        }
        System.out.print("Moyenne: " + calculerMoyenne());
    }
    public static Comparator<Etudiant> CompareNote = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            return (int) (o1.calculerMoyenne()-o2.calculerMoyenne());
        }
    };
    @Override
    public String toString() {
        return " N' d'etu="+getNbr_etu()+
                " Nom='" + nom + '\'' +
                " Prenom='" + prenom + '\'' +
                " Cne='" + cne + '\'' +
                " Cin='" + cin + '\'' +
                " Age=" + age +'\'' +
                " Moyenne=" + calculerMoyenne() +'\'' +
                " Nbr d'etu="+getNbr_etudiant();
    }
}
