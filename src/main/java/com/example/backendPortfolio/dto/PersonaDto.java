package com.example.backendPortfolio.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonaDto implements Serializable {
    private final String usuario;
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final String direccion;
    private final String ciudad;
    private final String pais;
    private final String fecha_nacimiento;
    private final String genero;
    private final String foto;
    private final String rol;
    private final String estado;
}
