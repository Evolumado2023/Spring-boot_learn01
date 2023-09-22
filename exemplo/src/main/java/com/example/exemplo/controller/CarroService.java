package com.example.exemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exemplo.model.Carro;
import com.example.exemplo.model.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public void salvarCarro(Carro carro){
        carroRepository.save(carro);
    }
    
}
