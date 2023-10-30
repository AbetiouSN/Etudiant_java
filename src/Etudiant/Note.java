package Etudiant;

public class Note {
    private Matiere matiere;
    private Etudiant etudiant;
    private double note;

    public Note(Matiere matiere, Etudiant etudiant, double note) {
        this.matiere = matiere;
        this.etudiant = etudiant;
        this.note = note;
    }


    @Override
    public String toString() {
        return "Etudiant :N' " +
                "Etudiant=" + etudiant +
                " Matiere=" + matiere +
                " Note=" + note;
    }

    public double getNote() {
        return note;
    }
    public Matiere getMatiere() {
        return matiere;
    }
}
