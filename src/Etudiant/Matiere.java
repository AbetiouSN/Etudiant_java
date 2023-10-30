package Etudiant;
public class Matiere {
    private String nom;
    private String code;

    public Matiere(String nom, String code) {
        this.nom = nom;
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public String getCode() {
        return code;
    }


    @Override
    public String toString() {
        return  "Nom='" + nom + '\'' +
                " Code='" + code + '\'';
    }
}