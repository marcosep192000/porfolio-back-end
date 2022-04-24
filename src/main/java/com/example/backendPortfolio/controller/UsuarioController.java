package com.example.backendPortfolio.controller;

import com.example.backendPortfolio.entity.Persona;
import com.example.backendPortfolio.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    @ResponseBody
    public ResponseEntity<List<Persona>>traer()
    {
        return ResponseEntity.ok(personaService.listarTodos());
    }
@PostMapping("/persona/add")
    public ResponseEntity<Persona> save(@Valid  @RequestBody  Persona persona,BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return new ResponseEntity("datos mal ingresados",HttpStatus.BAD_REQUEST);
                personaService.crear(persona);
        return new ResponseEntity("DATOS GURDADOS" , HttpStatus.CREATED);

    }


}
