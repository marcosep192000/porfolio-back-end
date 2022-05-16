package com.example.backendPortfolio.repository;

import com.example.backendPortfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
  public Persona findByEmail(String email);
}