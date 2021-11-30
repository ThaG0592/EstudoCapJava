package com.atp64.SpringDATA.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.atp64.SpringDATA.repository.SpringDataRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.atp64.SpringDATA.model.SpringData;

@Controller
public class SpringDataController {
    private SpringDataRepository repository;

    public SpringDataController(SpringDataRepository repository){
        this.repository = repository;
    }
    @GetMapping("/springData")
    public String springData(HttpServletRequest req){
        List<SpringData> lista = (List<SpringData>)repository.findAll();
        req.setAttribute("springData", lista);
        return "springData";
    }
    @GetMapping("/springData/form")
    public String formulario(HttpServletRequest req){
        SpringData model = new SpringData();
        req.setAttribute("springData", model);
        return "springData-form";
    }
    @PostMapping("/springData/form")
    public String salvar(SpringData model){
        repository.save(model);
        return "redirect: /springData";
    }
    @GetMapping("springData/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect: /springData";
    }
    @GetMapping("springData/editar/{id}")
    public String editar(@PathVariable int id, HttpServletRequest req){
        SpringData model = repository.findById(id).get();
        req.setAttribute("springData", model);
        return "springData-fomr";
    }

}
