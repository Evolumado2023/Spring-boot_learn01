package com.example.exemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exemplo.funcoes.Media;

@RestController
public class GreetingController {


    // @GetMapping vai definir rotas de navegação

    @GetMapping("/Hello")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("apresentation")
    public String apresentacao() {
        return "Olá, meu nome é Darlison de Souza Silva";
    }

    @GetMapping("/resultado")
    public String funcao() {
        int a = 5;
        int b = 10;
        int resultado = a + b;
        return "Resultado da operação: " + resultado;
    }

    @GetMapping("/cauculo")
    public String mostrar(){
        Media media = new Media();

        media.valor_media();
        return "O valor médio da operação é: ";
    }
    
}
