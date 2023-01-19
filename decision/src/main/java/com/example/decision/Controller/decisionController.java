package com.example.decision.Controller;

import com.example.decision.Entity.Decision;
import com.example.decision.Service.decisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class decisionController {

    @Autowired
    decisionService decisionservice;

    @RequestMapping(value = "/decision/{refDemande}/{evaluation}", method = RequestMethod.POST)
    public Decision getDecision(@PathVariable(value = "refDemande") Long refDemande,
                                @PathVariable(value = "evaluation") String evaluation) throws IOException, ParseException {
        String status=decisionservice.getSatut(evaluation);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        Decision decision=new Decision(refDemande,date,status);
        return decisionservice.createDecision(decision);
    }
}
