package com.MAVENECLIPSEATP52.ATP52.view;

import java.util.Scanner;

import com.MAVENECLIPSEATP52.ATP52.dao.CategoriaDao;
import com.MAVENECLIPSEATP52.ATP52.model.Categoria;

public class Creat {
	public static void main(String[] args) {
		CategoriaDao dao = new CategoriaDao();
		Categoria model = new Categoria();

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("\nDigite cat: ");
			model.setNome(sc.nextLine());

		} catch (Exception e) {
			System.out.println("Deu ruim");
		}
		dao.insert(model);
	}

}
