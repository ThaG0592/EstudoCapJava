package com.zumplae.filmes.repository;

import com.zumplae.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer> {
    
}
