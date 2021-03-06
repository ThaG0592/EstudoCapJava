package com.zumplae.filmes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zumplae.filmes.model.Filme;
import com.zumplae.filmes.repository.FilmeRepository;

import java.util.List;

@RestController
public class FilmeAPI {   

        @RestController
        @RequestMapping("/api/filme")
    public class FilmeApi {

        @Autowired
        private FilmeRepository repository;
        
        @GetMapping
        public List<Filme> filmes(){
            List<Filme> lista = (List<Filme>)repository.findAll();
            return lista;        
        }
        
        @PostMapping   
        public String salvar(@RequestBody Filme model){
            repository.save(model);
            return "salvo com sucesso";
        }

        @DeleteMapping("/{id}")    
        public String deletar(@PathVariable int id){
            repository.deleteById(id);
            return "deletado com sucesso";
        }

        @PutMapping("/{id}")    
        public String update(@RequestBody Filme model, @PathVariable int id){
            if(model.getId() == id){
                repository.save(model);
                return "alterado com sucesso";
            }
            return "id da url diferente do body";
        }
    }
}
