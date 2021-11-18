package aula24.P1;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();
        
        Pessoa p1 = new Pessoa();
        p1.nome = "jojo";
        p1.sobrenome = "juju";
        p1.idade = 12;

        Aluno a1 = new Aluno();
        a1.nome = "juno";
        a1.sobrenome = "bros";
        a1.idade = 34;
        a1.matricula = "mat123";
        a1.curso = "soninho";
        a1.turma = "b3";

        dados.add(p1);
        dados.add(a1);
            
        Pessoa p2 = new Pessoa();
        p2.nome = "jojo";
        p2.sobrenome = "juju";
        p2.idade = 12;

        boolean existe = dados.existe(p2);
        System.out.println(existe);

        dados.remove(a1);
        System.out.println(dados.existe(a1));
 
    }
}
