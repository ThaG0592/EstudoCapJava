package 
aula22.P1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Prod1";
        produto1.descricao = "Eletro";
        produto1.valor = 189.00;

        Eletrodomestico eletrodomestico1 = new Eletrodomestico();
        eletrodomestico1.nome = "Eletro";
        eletrodomestico1.descricao = "Eletro";
        eletrodomestico1.voltagem = "220v";
        eletrodomestico1.valor = 123.00;


        Produto produto2 = eletrodomestico1; 
        Produto produto3 = new Eletrodomestico();

        Eletrodomestico eletrodomestico2 = (Eletrodomestico)produto2;
        
        Object obj1 = eletrodomestico2;
        Eletrodomestico eletro3 = (Eletrodomestico)obj1;

        imprimir(produto1);
        imprimir(eletrodomestico1);

        // é possivel converter eletrodomestico em  produto pois tem produto dentro de eletrodomestico
        // porém o contrario os itens que não tem em produto não são lidos ocorrem erro ou 
        // ausencia dos itens desejados.
    }
    public static void imprimir(Object obj){
        if(obj instanceof Eletrodomestico){
            System.out.println("É eletrodomentico");
            Eletrodomestico eletro = (Eletrodomestico)obj;
            System.out.println(eletro.nome);
            System.out.println(eletro.descricao);
            System.out.println(eletro.valor);
            System.out.println(eletro.voltagem);
        }
        else if (obj instanceof Produto){
            System.out.println("É um produto");
            Produto prod = (Produto)obj;
            System.out.println(prod.nome);
            System.out.println(prod.descricao);
            System.out.println(prod.valor);
        }
    }
    
    
}
