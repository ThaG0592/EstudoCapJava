package aula20.View;

import modulo1.aula20.Model.Categoria;
import modulo1.aula20.Controler.CategoriaController;

public class CategoriaView {
    
    public void executa() {
        CategoriaController controller = new CategoriaController();

        Categoria categoria1 = new Categoria();
        categoria1.nome = "Tvs";
        categoria1.descrição = "Tvs até 32\"";

        controller.salvar(categoria1);
        
        for (Categoria cat : controller.listar()) {
            System.out.println(cat.nome);
            System.out.println(cat.descrição);
        }        
    }
}
