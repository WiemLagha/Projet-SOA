package com.example.dossierCredit.Repository;

import com.example.dossierCredit.Entity.dossierCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dossierCreditRepository extends JpaRepository<dossierCredit,Long> {
}
