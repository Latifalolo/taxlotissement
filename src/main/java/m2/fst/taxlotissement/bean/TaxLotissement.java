package m2.fst.taxlotissement.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Date;
@Entity
public class TaxLotissement {
    @Id
    private long id;
    @OneToOne

    private Redevoir redevoir;
    @OneToOne
    private Local local;
    private Date datePresentation;
    private double surface;
    private double montant;
    private double montantBase;


    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }
    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public double getSurface() {
        return surface;
    }
    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
 }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Redevoir getRedevoir() {
        return redevoir;
    }

    public void setRedevoir(Redevoir redevoir) {
        this.redevoir = redevoir;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }
}