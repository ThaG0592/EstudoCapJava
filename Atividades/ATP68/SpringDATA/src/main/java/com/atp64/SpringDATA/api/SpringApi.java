package com.atp64.SpringDATA.api;
import java.util.List;

import com.atp64.SpringDATA.model.SpringData;
import com.atp64.SpringDATA.repository.SpringDataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spring")
public class SpringApi {
    @Autowired
    private SpringDataRepository repository;
    
    @GetMapping
    public List<SpringData> spring(String nome){
        if(nome != null){
            return (List<SpringData>)repository.findAll(nome) ;
        }
        return (List<SpringData>)repository.findAll();     
    }
    
    @GetMapping("/{id}")    
    public SpringData buscarPorId(@PathVariable int id){
        return repository.findById(id).get();        
    }
    
    @PostMapping  
    public String salvar(@RequestBody SpringData model){
        repository.save(model);
        return "salvo com sucesso";
    }

    @DeleteMapping("/{id}")    
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "deletado com sucesso";
    }

    @PutMapping("/{id}")    
    public String update(@RequestBody SpringData model, @PathVariable int id){
        if(model.getId() == id){
            repository.save(model);
            return "alterado com sucesso";
        }
        return "id da url diferente do body";
    }

}
