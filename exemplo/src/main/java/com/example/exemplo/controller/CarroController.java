package com.example.exemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exemplo.model.Carro;

@RestController
public class CarroController {
    
    @Autowired
    private CarroService carroService;

    @PostMapping("/carros")
    public ResponseEntity<String> adicionarCarro(@RequestBody Carro carro) {
        carroService.salvarCarro(carro);
        return ResponseEntity.ok("Carro inserido com sucesso!");
    }
}
