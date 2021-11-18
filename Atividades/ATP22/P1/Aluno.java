package Atividades.ATP22.P1;

public class Aluno {
    private String nomeCompleto;
    private int idade;
    private int matricula;


    public Aluno(String nomeCompleto, int idade, int matricula) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.matricula = matricula;
    }
   

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    @Override
     public String toString() {
        String objetoAluno = " Nome completo: "+ " " +this.nomeCompleto + "\n Idade: "+ " " + this.idade + "\n Matricula: " + " " + this.matricula;
        return objetoAluno;
    }
}
