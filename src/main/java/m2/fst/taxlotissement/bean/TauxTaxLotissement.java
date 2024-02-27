package m2.fst.taxlotissement.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class TauxTaxLotissement {
    @Id
    private int id;
    private double montant;
    private Date dateAppMin;
    private Date dateAppMax;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateAppMin() {
        return dateAppMin;
    }
    public void setDateAppMin(Date dateAppMin) {
        this.dateAppMin = dateAppMin;
    }


    public Date getDateAppMax() {
        return dateAppMax;
    }
    public void setDateAppMax(Date dateAppMax) {
        this.dateAppMax = dateAppMax;
}
}
