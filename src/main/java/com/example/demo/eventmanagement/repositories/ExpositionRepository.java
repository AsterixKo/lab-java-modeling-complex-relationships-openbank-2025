package com.example.demo.eventmanagement.repositories;

import com.example.demo.eventmanagement.models.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Long> {
}
