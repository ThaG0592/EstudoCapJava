package aula13;

public class ArrayCategoria {
    public static void main(String[] args) {
        Categoria[] categorias = new Categoria[3];

        Categoria cat1 = new Categoria();
        cat1.setNome("Eletro");
        cat1.setDescricao("Eletroeletronico");

        Categoria cat2 = new Categoria();
        cat2.setNome("Smartphone");
        cat2.setDescricao("Telefone que tem app");

        Categoria cat3 = new Categoria();

        categorias[0] = cat1;
        categorias[1] = cat2;
        categorias[2] = cat3;

        for(Categoria c: categorias){
            System.out.printf("%s - %s \n", c.getNome(), c.getDescricao());
        }
    }
    
}
