package aula20.Controler;

import java.util.ArrayList;

import modulo1.aula20.Model.Categoria;

public class CategoriaController {
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public void salvar(Categoria c){
        categorias.add(c);
    }

    public ArrayList<Categoria> listar(){
        return categorias;
    }
}