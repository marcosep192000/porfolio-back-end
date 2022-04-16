package com.example.backendPortfolio.repository;

import com.example.backendPortfolio.entity.Persona;
import com.example.backendPortfolio.service.PersonaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {


}