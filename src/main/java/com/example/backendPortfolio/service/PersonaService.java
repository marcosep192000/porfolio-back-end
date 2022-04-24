package com.example.backendPortfolio.service;

import com.example.backendPortfolio.entity.Persona;
import com.example.backendPortfolio.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonaService implements IpersonaService {





     @Autowired
    public final PersonaRepository persona;

    @Override
    public void crear(Persona person) {
         persona.save(person);
    }

    @Override
    public List<Persona> listarTodos() {
        return persona.findAll();
    }

    @Override
    public Persona listarPorId(Long id) {
        return persona.findById(id).orElse(null);
    }

    @Override
    public Persona editar(Persona persona) {
        return null;
    }

    @Override
    public void eliminar(Long id) {
      persona.deleteById(id);
    }




}

