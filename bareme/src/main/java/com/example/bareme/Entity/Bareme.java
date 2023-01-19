package com.example.bareme.Entity;

import jakarta.persistence.*;

@Entity(name="bareme")
public class Bareme {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="reference")
    private Long reference;

    @Column(name="taux")
    private double taux;

    @Column(name="duree_min")
    private int dureeMin; //en années

    @Column(name="duree_max")
    private int dureeMax;

    @Column(name="montant_min")
    private double montantMin;

    @Column(name="montant_max")
    private double montantMax;

    public Bareme() {
    }

    public Bareme(double taux, int dureeMin, int dureeMax, double montantMin, double montantMax) {
        this.taux = taux;
        this.dureeMin = dureeMin;
        this.dureeMax = dureeMax;
        this.montantMin = montantMin;
        this.montantMax = montantMax;
    }

    public Bareme(Long reference, double taux, int dureeMin, int dureeMax, double montantMin, double montantMax) {
        this.reference = reference;
        this.taux = taux;
        this.dureeMin = dureeMin;
        this.dureeMax = dureeMax;
        this.montantMin = montantMin;
        this.montantMax = montantMax;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public int getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(int dureeMin) {
        this.dureeMin = dureeMin;
    }

    public int getDureeMax() {
        return dureeMax;
    }

    public void setDureeMax(int dureeMax) {
        this.dureeMax = dureeMax;
    }

    public double getMontantMin() {
        return montantMin;
    }

    public void setMontantMin(double montantMin) {
        this.montantMin = montantMin;
    }

    public double getMontantMax() {
        return montantMax;
    }

    public void setMontantMax(double montantMax) {
        this.montantMax = montantMax;
    }

}
