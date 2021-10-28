package com.example.holaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class Controlador {


    @Value("${index.saludos}")
    private String saludo;

    @GetMapping("/")
    public String ControladorInicio(Model model) {
        var mensaje= "Adios con Thymeleaf";
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        return "index";
    }

}
