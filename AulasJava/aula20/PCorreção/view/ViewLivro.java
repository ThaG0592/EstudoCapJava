package aula20.PCorreção.view;

import modulo1.aula20.PCorreção.model.Livroc;

public class ViewLivro {
    public static void main(String[] args) {
        Livroc livro1 = new Livroc(1);
        Livroc livro2 = new Livroc(1);
        System.out.println(livro1.equals(livro2));
    }
    
}
