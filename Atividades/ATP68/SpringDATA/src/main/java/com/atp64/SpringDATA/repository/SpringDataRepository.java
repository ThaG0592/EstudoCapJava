package com.atp64.SpringDATA.repository;

import java.util.List;

import com.atp64.SpringDATA.model.SpringData;

import org.springframework.data.repository.CrudRepository;

public interface SpringDataRepository extends CrudRepository<SpringData,Integer> {

    List<SpringData> findAll(String nome);
    
}
