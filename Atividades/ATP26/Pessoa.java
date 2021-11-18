package Atividades.ATP26;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public String idade;

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa) obj;
        if(this.nome.equals(pessoa.nome) && this.sobrenome.equals(pessoa.sobrenome) && this.idade.equals(pessoa.idade)){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return  "\nPessoa" +
                "\nNome: " + this.nome +
                "\nSobrenome: " + this.sobrenome +
                "\nIdade: " + this.idade; 
    }
}
