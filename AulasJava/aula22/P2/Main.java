package aula22.P2;

import java.io.PipedWriter;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pessoa1";

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.nome = "Pessoa Fisica1";
        pessoaFisica1.cpf = "12345678912";

        Pessoa pessoa2 = pessoaFisica1;
        Object obj1 = pessoa2;

        imprimir(obj1);
       // imprimir(pessoaFisica1);
        imprimir(pessoa2);



    }
    public static void imprimir (Object obj){
        System.out.println(obj);
    }
    
}
