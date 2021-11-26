package com.zuplae.banco.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTINY)
    private int id;
    private String nome;
    private String nomeDiretor;
    private String genero;

    
}
