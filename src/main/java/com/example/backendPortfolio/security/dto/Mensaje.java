package com.example.backendPortfolio.security.dto;

public class Mensaje {
    private String mensaje ;

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
