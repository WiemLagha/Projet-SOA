package com.example.score.Entity;

import jakarta.persistence.*;

@Entity(name="score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="idDossier")
    private Long idDossier;

    @Column(name="score")
    private double score;

    @Column(name="evaluation")
    private String evaluation;


    public Score(Long idDossier, double score, String evaluation) {
        this.idDossier = idDossier;
        this.score = score;
        this.evaluation = evaluation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(Long idDossier) {
        this.idDossier = idDossier;
    }

    public double getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
}
