package com.MAVENECLIPSEATP52.ATP52.view;

import java.util.Scanner;

import com.MAVENECLIPSEATP52.ATP52.dao.CategoriaDao;
import com.MAVENECLIPSEATP52.ATP52.model.Categoria;

public class Update {
	public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        
        try (Scanner sc = new Scanner(System.in)){
            System.out.printf("\nDigite o ID que deseja alterar");
            int id = Integer.parseInt(sc.nextLine());
            model.setId(id);

            System.out.printf("\nDigite o nome que deseja alterar");
            String nome = sc.nextLine();
            model.setNome(nome);
        
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }
        int linhasAlteradas = dao.delete(model);
        System.out.println(linhasAlteradas);
    }
}
