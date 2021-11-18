package Atividades.ATP26;

public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;
    
    @Override
    public boolean equals(Object obj) {
       Aluno aluno = (Aluno) obj;
       if(this.nome.equals(aluno.nome) && this.sobrenome.equals(aluno.sobrenome) && this.idade.equals(aluno.idade) && this.matricula.equals(aluno.matricula) && this.turma.equals(aluno.turma) && this.curso.equals(aluno.curso)){
            return true;
       }
        return false;
    }

    @Override
    public String toString() {
        return  "\nAluno" +
                "\nNome: " + this.nome +
                "\nSobrenome: " + this.sobrenome +
                "\nIdade: " + this.idade +
                "\nMatricula: " + this.matricula +
                "\nTurma: " + this.turma +
                "\nCurso: " + this.curso;
    }
}
