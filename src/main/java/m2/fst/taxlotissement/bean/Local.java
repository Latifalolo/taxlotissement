package m2.fst.taxlotissement.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Local {
    @Id
    private int id;
    @OneToOne
    private Redevoir redevoir;
    private String libelle;
    private String adresse;
    private String ref;

    public Redevoir getRedevoir() {
        return redevoir;
    }
    public void setRedevoir(Redevoir redevoir) {
        this.redevoir = redevoir;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
}