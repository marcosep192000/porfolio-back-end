package com.example.backendPortfolio.controller;

import com.example.backendPortfolio.entity.Persona;
import com.example.backendPortfolio.security.dto.Mensaje;
import com.example.backendPortfolio.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("v1/user")
public class UsuarioController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/data")
    @ResponseBody
    public ResponseEntity<List<Persona>>traer()
    {
        if (personaService.listarTodos().isEmpty())
        {
            return new ResponseEntity(new Mensaje("Listado de Usuarios vacio"),HttpStatus.BAD_REQUEST);
        }
        return new  ResponseEntity(personaService.listarTodos(),HttpStatus.OK);

    }
    //agregar Usuario solo una vez
@PostMapping("/add")
    public ResponseEntity<Persona> save(@Valid  @RequestBody  Persona persona,BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Datos Erroneos"),HttpStatus.BAD_REQUEST);
                personaService.crear(persona);
        return new ResponseEntity(new Mensaje("Datos de usuario Cradors con exito"), HttpStatus.CREATED);
    }

    //actualizar Usuario

    //actualizar usuario.












}
