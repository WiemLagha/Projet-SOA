package com.example.bareme.Controller;

import com.example.bareme.Entity.Bareme;
import com.example.bareme.Service.baremeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class baremeController {

    @Autowired
    baremeService baremeservice;

    @RequestMapping(value="/bareme",method = RequestMethod.POST)
    public Bareme create(@RequestBody Bareme b){

        return baremeservice.create(b);

    }

    @RequestMapping(value="/bareme/{duree}/{montant}", method=RequestMethod.GET)
    public Bareme getBareme(@PathVariable(value = "duree") int duree, @PathVariable(value = "montant") String montant){
        return baremeservice.getBareme(duree, Float.parseFloat(montant));
    }

    @RequestMapping(value="/bareme/existe/{duree}/{montant}", method=RequestMethod.GET)
    public Map<String, Boolean> verifyBareme(@PathVariable(value = "duree") int duree, @PathVariable(value = "montant") String montant){
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("verify",baremeservice.getBareme(duree, Double.parseDouble(montant))!=null);
        return map;
    }
    @RequestMapping(value="/bareme/getTaux/{duree}/{montant}", method=RequestMethod.GET)
    public double getTaux(@PathVariable(value = "duree") int duree, @PathVariable(value = "montant") String montant){
        return baremeservice.getTaux(duree, Double.parseDouble(montant));
    }
}
