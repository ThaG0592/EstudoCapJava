package aula26;

public class Main {
    public static void main(String[] args) {
        String nome = null;
        // erro compialado é aquele que o programa não deixa agir ou usar algum recurso.
        // erro de execução é quando o erro ocorre após a programação do sistema, causando falha no processo
        // erro de exceção é quando o programa deixa executar mas apos a execução da erro.
        
        //nome.length();//NullPointerException
    
        int num = Integer.parseInt("-10");

        if(idade <0 || idade>150){
            throw IllegalArgumentException("Idade invalida");
        }
        

    }
    
}
