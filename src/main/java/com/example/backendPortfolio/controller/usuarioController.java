package com.example.backendPortfolio.controller;

import com.example.backendPortfolio.entity.Persona;
import com.example.backendPortfolio.service.PersonaService;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;
@RestController
public class usuarioController {


    @Autowired
    PersonaService personaService ;


    @PutMapping("/persona/actualizar")
    public ResponseEntity<?> actualizar(@Valid  @RequestBody  Persona nombre) {
        personaService.crear(nombre);
        return new ResponseEntity<>("Usuario actualizado Corrctamente", HttpStatus.ACCEPTED) ;
    }

    @PostMapping("/persona/nuevo")
    public ResponseEntity<?> findByNombre(@Valid  @RequestBody  Persona nombre) {
        personaService.crear(nombre);
        return new ResponseEntity<>("Usuario Creado Corrctamente", HttpStatus.CREATED) ;
    }
     @GetMapping("/persona")
     @ResponseBody
     public List<Persona> listar()
     {return  personaService.listarTodos();
     }


    @DeleteMapping("/persona/eliminar/{id}")
    public ResponseEntity<?> borrar(@PathVariable  Long id){
        personaService.eliminar(id);

        return new ResponseEntity<>("Usuario Eliminado" , HttpStatus.ACCEPTED);}





}
