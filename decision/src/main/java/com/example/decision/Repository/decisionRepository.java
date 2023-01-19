package com.example.decision.Repository;

import com.example.decision.Entity.Decision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface decisionRepository extends JpaRepository<Decision,Long> {
}
