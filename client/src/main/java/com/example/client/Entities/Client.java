package com.example.client.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="cin")
    private Long cin;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="salaire")
    private double salaire;

    @Column(name="contrat")
    private String contrat;

    @Column(name="date_naiss")
    private Date dateNaissance;

    public Client() {
    }

    public Client(String nom, String prenom, double salaire, String contrat, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.contrat = contrat;
        this.dateNaissance = dateNaissance;
    }

    public Client(Long cin, String nom, String prenom, double salaire, String contrat, Date dateNaissance) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.contrat = contrat;
        this.dateNaissance = dateNaissance;
    }

    public Long getCin() {
        return cin;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
