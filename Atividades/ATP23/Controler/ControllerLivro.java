package Atividades.ATP23.Controler;

import java.util.ArrayList;

import Atividades.Atividade17.ATP23.Model.Livro;

public class ControllerLivro {
    private ArrayList<Livro>livros = new ArrayList<Livro>();

    public void salvar(Livro liv){
        livros.add(liv);
    }

    public ArrayList<Livro> listar(){
        return livros;
    }

    public void excluir(Livro liv){
        livros.remove(liv);
    }

    public void atualizar(Livro liv){
        if(livros.contains(liv)){
            livros.remove(liv);
        }
    }
    
}
