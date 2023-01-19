package com.example.dossierCredit.Controller;

import com.example.dossierCredit.Entity.dossierCredit;
import com.example.dossierCredit.Service.dossierCreditService;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping("/api")
public class dossierCreditController {

    public dossierCreditService dossierservice;

    @RequestMapping(value="/dossiercredit",method = RequestMethod.POST)
    public dossierCredit create(@RequestBody dossierCredit d){

        return dossierservice.create(d);
    }

    @RequestMapping(value = "/dossiercredit/{cin}/{idBareme}/{duree}/{montant}", method = RequestMethod.POST)
    public dossierCredit getInteret(@PathVariable(value = "cin") Long cin,
                                      @PathVariable(value = "idBareme") Long idBareme,
                                      @PathVariable(value = "duree") int duree,
                                      @PathVariable(value = "montant") double montant) throws IOException
    {
        URL url = new URL("http://localhost:8081/api/bareme/getTaux/"+duree+"/"+montant);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        inputLine = in.readLine();
        double interet=dossierservice.calculInteret(montant, Float.parseFloat(inputLine));
        double mensualite=dossierservice.calculMensualite(montant, interet, duree);
        dossierCredit dossierDeCredit=new
                dossierCredit(cin,montant,idBareme,interet,duree,mensualite);
        return dossierservice.create(dossierDeCredit);
    }
}
