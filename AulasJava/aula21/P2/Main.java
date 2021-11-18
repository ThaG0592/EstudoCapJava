package aula21.P2;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();

        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica = new PessoaFisica();

        pessoa.imprimir();
        pessoaFisica.imprimir();

        Pessoa pessoa2 = pessoaFisica;
        pessoa2.imprimir();

        Object object1 = pessoa;
        Object object2 = pessoaFisica;
    }
    
}
