package com.example.dossierCredit.Entity;

import jakarta.persistence.*;

@Entity(name="dossier")
public class dossierCredit {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="reference")
    private Long reference;

    @Column(name="cin_client")
    private Long cinClient;

    @Column(name="montant_credit")
    private double montantCredit;

    @Column(name="ref_bareme")
    private Long refBareme;

    @Column(name="interet")
    private double interet;

    @Column(name="duree_credit")
    private int dureeCredit;

    @Column(name="mensualite")
    private double mensualité;

    public dossierCredit() {
    }

    public dossierCredit(Long cinClient, double montantCredit, Long refBareme, double interet, int dureeCredit, double mensualité) {
        this.cinClient = cinClient;
        this.montantCredit = montantCredit;
        this.refBareme = refBareme;
        this.interet = interet;
        this.dureeCredit = dureeCredit;
        this.mensualité = mensualité;
    }

    public dossierCredit(Long reference, Long cinClient, double montantCredit, Long refBareme, double interet, int dureeCredit, double mensualité) {
        this.reference = reference;
        this.cinClient = cinClient;
        this.montantCredit = montantCredit;
        this.refBareme = refBareme;
        this.interet = interet;
        this.dureeCredit = dureeCredit;
        this.mensualité = mensualité;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public Long getCinClient() {
        return cinClient;
    }

    public void setCinClient(Long cinClient) {
        this.cinClient = cinClient;
    }

    public double getMontantCredit() {
        return montantCredit;
    }

    public void setMontantCredit(double montantCredit) {
        this.montantCredit = montantCredit;
    }

    public Long getRefBareme() {
        return refBareme;
    }

    public void setRefBareme(Long refBareme) {
        this.refBareme = refBareme;
    }

    public double getInteret() {
        return interet;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

    public int getDureeCredit() {
        return dureeCredit;
    }

    public void setDureeCredit(int dureeCredit) {
        this.dureeCredit = dureeCredit;
    }

    public double getMensualité() {
        return mensualité;
    }

    public void setMensualité(double mensualité) {
        this.mensualité = mensualité;
    }
}
