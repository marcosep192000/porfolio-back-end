package com.example.backendPortfolio.service;

import java.util.List;

public interface ServicioComun {

    public List<Object> listar();
    public Object listarPorId(int id);
    public Object guardar(Object object);
    public Object actualizar(Object object);
    public Object eliminar(int id);
}
