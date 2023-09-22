package com.example.exemplo.conecxao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionTester {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void testDatabaseConnection(){
        try{

            String result = jdbcTemplate.queryForObject("SELECT * FROM locadora.carro", String.class);
            System.out.println("Conexão com o banco estabelecia com sucesso! Resultado: " + result );

        } catch (Exception e) {
            System.err.println("Erro ao testar a conexão com o banco de dados: " + e.getMessage());

        }
    }


    
}
