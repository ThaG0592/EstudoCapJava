package com.zumplae.filmes.repository;

import com.zumplae.filmes.model.Filme;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmeRepository extends PagingAndSortingRepository<Filme,Integer> {
    
}
