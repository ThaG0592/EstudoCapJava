package aula20.PCorreção.controller;

import java.util.ArrayList;
import modulo1.aula20.PCorreção.model.Livroc;

public class LivroController {
    private ArrayList<Livroc> livros = new ArrayList<Livroc>();
    
    //crud

    public void create (Livroc livro){
        this.livros.add(livro);
    }
    public ArrayList<Livroc> read(){
        return this.livros;
    }
    public void updat(Livroc livro){

    }
    public void delete(Livroc livro){
        this.livros.remove(livro);
    }
    

    
}
