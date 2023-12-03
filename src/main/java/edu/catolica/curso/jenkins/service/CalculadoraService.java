package edu.catolica.curso.jenkins.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CalculadoraService {

    public String hello(){
        return "Seja bem vindo(a) ao Mini Curso de Jenkins";
    }

    public int somar(int a, int b){
        return a+b;
    }

    public int subtrair(int a, int b){
        return a-b;
    }
}
