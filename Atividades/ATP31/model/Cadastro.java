package Atividades.ATP31.model;

public class Cadastro extends Base {
    public String nome;
    public String descricao;

    @Override
    public String toString() {
        return "Nome: "+this.nome + "Descrição: "+ this.descricao;
    };
}
