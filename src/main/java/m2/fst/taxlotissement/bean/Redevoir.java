package m2.fst.taxlotissement.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Redevoir {
    @Id
    private int id;
    private String cim;
    private String nom;
    private String prenom;
    private String ref;
    private String libelle;
    private String adresse;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCim() {
        return cim;
    }
    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter and Setter methods for prenom
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;

    }
}
