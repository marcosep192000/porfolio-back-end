package com.example.backendPortfolio;

import com.example.backendPortfolio.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import com.example.backendPortfolio.security.entity.Usuario;

@Component
@ComponentScan
public class RunnerCargarUsuarios implements CommandLineRunner {
    @Autowired
    public UsuarioService usuarioService;
     @Autowired
    PasswordEncoder pass;
    @Override
    public void run(String... args) throws Exception {
       System.out.println("Insert MySQL");
     /*   Usuario u = new Usuario("marcospa","maros@gmail.com",pass.encode("123456"));
        usuarioService.save(u);*/
        System.out.println("Fin insercion Base de datos");

    }
}



