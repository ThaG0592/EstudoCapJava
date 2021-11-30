package com.atp64.SpringDATA.repository;

import com.atp64.SpringDATA.model.SpringData;

import org.springframework.data.repository.CrudRepository;

public interface SpringDataRepository extends CrudRepository<SpringData,Integer> {
    
}
