package com.example.bareme.Service;

import com.example.bareme.Entity.Bareme;
import com.example.bareme.Repository.baremeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class baremeService {
    @Autowired
    baremeRepository baremeRepo;

    public Bareme create(Bareme b){
        return baremeRepo.save(b);
    }

    public Bareme getBareme(int duree, double montant) {
        Bareme bareme =baremeRepo.getBareme(duree,montant);
        return bareme;
    }
    public double getTaux(int duree, double montant) {
        Bareme bareme =baremeRepo.getBareme(duree,montant);
        return bareme.getTaux();
    }
}
