package com.example.decision.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="decision")
public class Decision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="idDemande")
    private Long idDemande;

    @Column(name="date")
    private Date dateDecision;

    @Column(name="statut")
    private String status;

    public Decision(Long idDemande, Date dateDecision, String status) {
        this.idDemande = idDemande;
        this.dateDecision = dateDecision;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Long idDemande) {
        this.idDemande = idDemande;
    }

    public Date getDateDecision() {
        return dateDecision;
    }

    public void setDateDecision(Date dateDecision) {
        this.dateDecision = dateDecision;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
