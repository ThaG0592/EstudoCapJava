package aula11;


public class Produto {
    String nome;
    String descricao;
    double valor;
    int quantidade;

    void imprimir(){
        System.out.printf("Nome: %s, descrição: %s, valor: %.2f", nome, descricao, valor);
    }

}
