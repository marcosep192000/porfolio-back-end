package com.example.backendPortfolio.entity.ObjetoNulo;

import com.example.backendPortfolio.entity.Persona;

public class PersonaNulo extends Persona {

    public static Persona construir(){
        return new PersonaNulo();
    }

    @Override
    public boolean esNulo(){
        return true;
    }

}
