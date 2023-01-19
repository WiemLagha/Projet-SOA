package com.example.score.Repository;

import com.example.score.Entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface scoreRepository extends JpaRepository<Score, Long> {
}
