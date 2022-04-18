package com.example.backendPortfolio.service;

import com.example.backendPortfolio.entity.Persona;

import java.util.List;

public interface IpersonaService {

    public List<Persona> listarTodos();
    public Persona listarPorId(Long id);
    public void crear(Persona persona);
    public Persona editar(Persona persona);
    public void eliminar(Long id);

}
