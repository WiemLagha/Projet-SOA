package com.example.client.Controller;

import com.example.client.Entities.Client;
import com.example.client.Service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class clientController {

    @Autowired
    clientService clientservice;

    @RequestMapping(value="/client",method = RequestMethod.POST)
    public Client create(@RequestBody Client c){

        return clientservice.create(c);
    }

//    @RequestMapping(value="/ficheclient/existe/{CIN}", method= RequestMethod.GET)
//    public Map<String, Boolean> verifyClient(@PathVariable(value="cin") Long CIN){
//        HashMap<String, Boolean> map = new HashMap<>();
//        map.put("verify",clientservice.verifyClient(CIN));
//        return map;
//    }
//
//    @RequestMapping(value="/ficheclient/{CIN}", method= RequestMethod.GET)
//    public Client findById(@PathVariable(value="CIN") Long CIN){
//        return clientservice.getByCIN(CIN);
//    }


}
