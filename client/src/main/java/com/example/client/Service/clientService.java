package com.example.client.Service;

import com.example.client.Entities.Client;
import com.example.client.Repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clientService {

    @Autowired
    clientRepository clientRepo;


    public Client create(Client c){
        return clientRepo.save(c);
    }


//    public boolean verifyClient(Long CIN){
//        Client ficheClient = clientRepo.findByCIN(CIN);
//        return ficheClient!=null;
//    }
//    public Client getByCIN(Long CIN){
//        Client ficheClient = clientRepo.findByCIN(CIN);
//        return ficheClient;
//    }

}
