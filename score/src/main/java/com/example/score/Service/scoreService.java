package com.example.score.Service;

import com.example.score.Entity.Score;
import com.example.score.Repository.scoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class scoreService {

    @Autowired
    scoreRepository repo;
    public Score createScore(Score score)
    {
        return repo.save(score);
    }

    public double calculScore(double salaire,String typeContrat, double mensualite)
    {
        double score=0;
        if(salaire>2000) score=score+20;
        if(salaire>1000 && salaire<2000) score=score+10;
        if(typeContrat.equals("CDI")) score=score+30;
        if((mensualite/salaire)<0.45) score=score+50;

        return score;
    }
}
