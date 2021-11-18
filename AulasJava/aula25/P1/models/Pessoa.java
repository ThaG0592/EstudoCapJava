package aula25.P1.models;

public abstract class Pessoa extends Base{ //herança
    public String nome;
    public Endereco enderecoResidencial; //Composição
    public Endereco enderecoComercial;
}