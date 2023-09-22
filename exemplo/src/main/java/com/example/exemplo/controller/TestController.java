package com.example.exemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exemplo.conecxao.DatabaseConnectionTester;

@RestController
public class TestController {

    @Autowired
    private DatabaseConnectionTester connectionTester;

    @GetMapping("/test-database-connection")

    public String testDatabaseConnection(){
        try {
            connectionTester.testDatabaseConnection();
            return "Teste de conexão com o banco de dados concluído com sucesso!";
        } catch (Exception e) {
            return "Erro ao testar a conexão com o banco de dados: " + e.getMessage();
        }
    }
}