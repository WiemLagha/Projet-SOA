package com.example.bareme.Repository;

import com.example.bareme.Entity.Bareme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface baremeRepository extends JpaRepository<Bareme,Long> {
    @Query("SELECT b FROM Bareme b WHERE (b.dureeMaximale >= ?1 and b.dureeMinimale <= ?1) and (b.montantMaximale >= ?2 and b.montantMinimal <= ?2)")
    Bareme getBareme(int duree, double montant);
}
