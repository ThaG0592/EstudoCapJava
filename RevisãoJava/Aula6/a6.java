package Aula6;

public class a6 {
    public static void main(String[] args) {
        boolean executa = true;
        if(executa){
            System.out.println("Entrou o if");
        }

        boolean verdadeiro = false;
        if(!verdadeiro){
            System.out.println("Entrou no segundo if");
        }
        if(!verdadeiro||executa){
            System.out.println("Entrou no terceiro if");
        }
        if(!verdadeiro && !executa){
            System.out.println("Entrou no quarto if");
        }
        boolean resultado = !verdadeiro && !executa;
        if(resultado){
            System.out.println("Entrou no quinto if");
        }
    }
}
