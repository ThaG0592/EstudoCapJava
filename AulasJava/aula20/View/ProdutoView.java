package aula20.View;


import java.util.ArrayList;

import modulo1.aula20.Model.Produto;
import modulo1.aula20.Controler.ProdutoController;

public class ProdutoView {
    
    public void executa() {
        Produto p = new Produto("Tv", 1999.99);

        p.setMarca("Samsung");
        
        ProdutoController controller = new ProdutoController();
        controller.salvar(p);
        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods ) {
            System.out.println(prodSalvo);
        }
        
    }
}

