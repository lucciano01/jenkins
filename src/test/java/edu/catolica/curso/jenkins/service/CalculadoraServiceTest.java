package edu.catolica.curso.jenkins.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void shouldReturnHelloMessage(){
        String hello = "Seja bem vindo(a) ao Mini Curso de Jenkins";
        Assertions.assertEquals(calculadoraService.hello(), hello);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers(){
        int a = 2;
        int b = 2;
        int result = 4;
        Assertions.assertEquals(result, calculadoraService.somar(a,b));
    }

    @Test
    public void shouldReturnSubtractionOfTwoNumbers(){
        int a = 2;
        int b = 2;
        int result = 0;
        Assertions.assertEquals(result, calculadoraService.subtrair(a,b));
    }
}
