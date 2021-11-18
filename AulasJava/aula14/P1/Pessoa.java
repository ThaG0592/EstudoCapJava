package aula14.P1;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int codigo;
    private Date data_nascimento;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public Date getData_nascimento() {
        return data_nascimento;
    }

    
}
