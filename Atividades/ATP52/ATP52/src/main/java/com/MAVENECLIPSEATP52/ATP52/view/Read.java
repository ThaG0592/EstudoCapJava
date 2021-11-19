package com.MAVENECLIPSEATP52.ATP52.view;

import com.MAVENECLIPSEATP52.ATP52.dao.CategoriaDao;
import com.MAVENECLIPSEATP52.ATP52.model.Categoria;

public class Read {
	public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        for (Categoria c : dao.read()) {
            System.out.printf("%d - %s", c.getId(), c.getNome());
            
        }
    
    }
}
