package aula24.P1;

public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aluno){
            Aluno outra = (Aluno) obj;
            if( super.equals(outra) && this.matricula.equals(outra.matricula) && this.turma.equals(outra.turma) && this.curso.equals(outra.curso)){
                    return true;
                }

        }
        return false;
    }
    @Override
    public String toString() {
        String retorno = super.toString() +  this. matricula + "||" + this. turma + "||" +this. curso;
        return retorno;
    }
}
