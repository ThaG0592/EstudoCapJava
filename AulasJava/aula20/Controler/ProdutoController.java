package aula20.Controler;

import java.util.ArrayList;

import modulo1.aula20.Model.Produto;

public class ProdutoController {
    private ArrayList<Produto> produtos =  new ArrayList<Produto>();


    public void salvar(Produto p){
        this.produtos.add(p);
    }

    public ArrayList<Produto> listar(){
        return produtos;
    }
}
