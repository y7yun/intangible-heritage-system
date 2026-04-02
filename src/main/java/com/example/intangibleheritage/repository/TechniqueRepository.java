package com.example.intangibleheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.intangibleheritage.entity.Technique;

@Repository
public interface TechniqueRepository extends JpaRepository<Technique, Long> {

    // Find techniques by status
    List<Technique> findByStatus(String status);

    // Find techniques by creator Id
    List<Technique> findByCreatorId(Long creatorId);

    // Find public techniques
    @Query("SELECT t FROM Technique t WHERE t.isPublic = true")
    List<Technique> findPublicTechniques();
}
