package m2.fst.taxlotissement.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class TaxLotissement {
    @Id
    private long id;
    private String local;
    private Date datePresentation;
    private double surface;
    private double montant;


    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
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
}