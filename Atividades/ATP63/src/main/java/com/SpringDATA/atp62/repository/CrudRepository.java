package com.SpringDATA.atp62.repository;

import com.SpringDATA.atp62.model.Clientes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudRepository implements CommandLineRunner {
    private Clientes repository;
    
    public CrudRepository(Clientes repository){
        this.repository = repository;
    }
    public static void main(String[] args){
        SpringApplication.run(CrudRepository.class, args);
    }
    @Override
    public void run(String... args) throws Exception{
        Clientes model = new Clientes();
        model.setId(1);
        model.setNome("Jose");
        model.setSobrenome("João");

        System.out.println(model);
    }
}
