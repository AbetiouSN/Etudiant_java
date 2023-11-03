import Etudiant.Etudiant;
import Etudiant.Matiere;
import Etudiant.Note;
import filier.Filier;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        List<Matiere> matieres   = new ArrayList<Matiere>();
        List<Note> notes = new ArrayList<>();
        Filier f;
        System.out.println("Hello world!");

        matieres.add(new Matiere("ANALYSE1", "ANL1"));
        matieres.add(new Matiere("ALGEBRE1", "ALG1"));
        matieres.add(new Matiere("MECANIQUE1", "MEC1"));
        matieres.add(new Matiere("PHYSIQUE1", "PHY1"));
        matieres.add(new Matiere("INFORMATIQUE1", "INF1"));
        matieres.add(new Matiere("LANGUES & COMMUNICATION1", "LC1"));

        //s2
        matieres.add(new Matiere("ANALYSE2", "ANL2"));
        matieres.add(new Matiere("ALGEBRE2", "ALG2"));
        matieres.add(new Matiere("MECANIQUE2", "MEC2"));
        matieres.add(new Matiere("PHYSIQUE2", "PHY2"));
        matieres.add(new Matiere("INFORMATIQUE2", "INF2"));
        matieres.add(new Matiere("LANGUES & COMMUNICATION2", "LC2"));

        Etudiant etudiant  = new Etudiant("ABETIOU", "Sofiane", "L100989537", "K876654", 23);
        Etudiant etudiant1 = new Etudiant("ABETIOU", "Hind",    "K875760537", "KL09766", 23);
        Etudiant etudiant2 = new Etudiant("ABETIOU", "Ahmed",   "M833355037", "JK98452", 23);
        Etudiant etudiant3 = new Etudiant("ABETIOU", "Siham",   "N133987537", "FE87654", 23);

        etudiants.add(etudiant);
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);

// Ajouter des notes pour des matières
        etudiants.get(0).ajouterNote(matieres.get(0), 18);
        etudiants.get(0).ajouterNote(matieres.get(1), 15);
        etudiants.get(0).ajouterNote(matieres.get(2),18);
        etudiants.get(0).ajouterNote(matieres.get(3),15);
        etudiants.get(0).ajouterNote(matieres.get(4), 18);
        etudiants.get(0).ajouterNote(matieres.get(5), 15);

        etudiants.get(0).ajouterNote(matieres.get(6), 7);
        etudiants.get(0).ajouterNote(matieres.get(7), 11);
        etudiants.get(0).ajouterNote(matieres.get(8),9.8);
        etudiants.get(0).ajouterNote(matieres.get(9),13);
        etudiants.get(0).ajouterNote(matieres.get(10), 10);
        etudiants.get(0).ajouterNote(matieres.get(1), 18);

        // etudiants.get(1).ajouterNote(matieres.get(0), 14);
        // etudiants.get(1).ajouterNote(matieres.get(1), 10);
        // etudiants.get(1).ajouterNote(matieres.get(2),9);
        // etudiants.get(1).ajouterNote(matieres.get(3),15);
        // etudiants.get(1).ajouterNote(matieres.get(4), 7);
        // etudiants.get(1).ajouterNote(matieres.get(5), 12);

        // etudiants.get(2).ajouterNote(matieres.get(0), 12);
        // etudiants.get(2).ajouterNote(matieres.get(1), 11);
        // etudiants.get(2).ajouterNote(matieres.get(2),9);
        // etudiants.get(2).ajouterNote(matieres.get(3),8);
        // etudiants.get(2).ajouterNote(matieres.get(4), 7);
        // etudiants.get(2).ajouterNote(matieres.get(5), 14);

        // etudiants.get(3).ajouterNote(matieres.get(0), 11);
        // etudiants.get(3).ajouterNote(matieres.get(1), 10);
        // etudiants.get(3).ajouterNote(matieres.get(2),17);
        // etudiants.get(3).ajouterNote(matieres.get(3),13.4);
        // etudiants.get(3).ajouterNote(matieres.get(4), 7.5);
        // etudiants.get(3).ajouterNote(matieres.get(5), 13);

        //========= ici pour pour tri les etudiants (10.6 < 11.16 < 11.9 < 16.5)  par moyenne =========
//        Collections.sort(etudiants,Etudiant.CompareNote);
//        etudiants.forEach(Etudiant -> System.out.println(" "+Etudiant));


        f = new Filier(etudiants,"Genie Informatique ", "GINF");
        System.out.println(f);
        /*
       < il y a une class Note pour enregistrer directement les notes(chaque note a 1 matiere et 1 etidiant)>
        notes.add(new Note(matieres.get(0),etudiant,18));
        notes.add(new Note(matieres.get(1),etudiant,13));
        notes.add(new Note(matieres.get(2),etudiant,11));
        notes.add(new Note(matieres.get(3),etudiant,9));
        notes.add(new Note(matieres.get(4),etudiant,8));
        notes.add(new Note(matieres.get(5),etudiant,14));
        System.out.println(etudiants);
        System.out.println(" ===================== ");
        System.out.println(notes);
*/






/*
         <==================== Affichage normale ======================>

         for (Etudiant etudiantS : etudiants) {
            etudiantS.calculerMoyenne();
        }
        for (Etudiant etudiantS : etudiants) {
            etudiantS.afficherInformations();
        }

        for (int i = 0; i < etudiants.size(); i++) {
            Etudiant etudiantS = etudiants.get(i);
            etudiantS.calculerMoyenne();
            etudiantS.afficherInformations();
        }
        for (Etudiant etudiantS : etudiants) {
            etudiantS.calculerMoyenne();
            etudiantS.afficherInformations();
        }
         <=========================================>
*/

/*
//ici pour tester sur une seul element
// Calculer la moyenne de l'étudiant
        double moyenne = etudiants.get(0).calculerMoyenne();
        System.out.println(moyenne);
// Afficher les informations complètes de l'étudiant
        etudiants.get(0).afficherInformations();

*/
    }
}
