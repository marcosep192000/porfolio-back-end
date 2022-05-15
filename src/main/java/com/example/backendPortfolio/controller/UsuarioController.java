package com.example.backendPortfolio.controller;

import com.example.backendPortfolio.entity.Persona;
import com.example.backendPortfolio.security.dto.Mensaje;
import com.example.backendPortfolio.service.PersonaService;
import org.h2.util.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Persona> save(@Valid @RequestBody  Persona persona, BindingResult bindingResult){
     Map map = new HashMap<>();
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(error -> {
              map.put(error.getField(), error.getDefaultMessage());
            });
            System.out.println(fieldErrors);


            return new ResponseEntity(map, HttpStatus.BAD_REQUEST);
        }

                personaService.crear(persona);
        return new ResponseEntity(new Mensaje("¡Datos de Usuario Creados con exito!"), HttpStatus.CREATED);
    }

    //actualizar Usuario

    //actualizar usuario.












}
