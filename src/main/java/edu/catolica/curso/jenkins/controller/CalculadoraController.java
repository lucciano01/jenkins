package edu.catolica.curso.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/calculadora")
public class CalculadoraController {

    @GetMapping("/ola")
    public String hello(){
        return "Seja bem vindo(a) ao Mini Curso de Jenkins!";
    }

    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return a+b;
    }
}
