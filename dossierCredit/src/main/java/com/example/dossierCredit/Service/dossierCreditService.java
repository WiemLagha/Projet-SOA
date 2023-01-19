package com.example.dossierCredit.Service;

import com.example.dossierCredit.Entity.dossierCredit;
import com.example.dossierCredit.Repository.dossierCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dossierCreditService {

    @Autowired
    dossierCreditRepository dossierRepo;

    public dossierCredit create(dossierCredit d){
        return dossierRepo.save(d);
    }
    public double calculInteret(double montant, double taux)
    {
        return montant*taux;
    }
    public double calculMensualite(double montant, double interet, int duree)
    {
        return (montant+interet)/duree;
    }
}
