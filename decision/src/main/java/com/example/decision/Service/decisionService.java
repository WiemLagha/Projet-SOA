package com.example.decision.Service;

import com.example.decision.Entity.Decision;
import com.example.decision.Repository.decisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class decisionService {

    @Autowired
    decisionRepository decisionRepo;
    public Decision createDecision(Decision decision)
    {
        return decisionRepo.save(decision);
    }

    public String getSatut(String evaluation){
        if(evaluation.equals("Rouge")) return ("Refuser");
        else return ("Accepter");
    }
}
