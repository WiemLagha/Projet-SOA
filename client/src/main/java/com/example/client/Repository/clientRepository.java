package com.example.client.Repository;

import com.example.client.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<Client,Long> {
    //Client findByCIN(Long cin);
}
