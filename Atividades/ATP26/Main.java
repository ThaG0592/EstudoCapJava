package Atividades.ATP26;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Stephen";
        pessoa2.sobrenome = "King";
        pessoa2.idade = "80";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Sidney";
        aluno2.sobrenome = "Sheldon";
        aluno2.idade = "80";
        aluno2.matricula = "MAT23456";
        aluno2.turma = "B5";
        aluno2.curso = "Letras";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Stephen";
        pessoa3.sobrenome = "King";
        pessoa3.idade = "80";

        Dados dados  = new Dados();

        System.out.println(dados.size());

        System.out.println(dados.contains(pessoa2));
        System.out.println(dados.contains(aluno2));

        System.out.println(dados.size());
        
        System.out.println(dados.add(pessoa2));
        System.out.println(dados.add(aluno2));
        System.out.println(dados.add(pessoa3));

        System.out.println(dados.size());
        

        System.out.println(dados.contains(pessoa2));
        System.out.println(dados.contains(aluno2));
        
        System.out.println(dados.remove(aluno2));

        System.out.println(dados.size());
      
        System.out.println(pessoa2);
        System.out.println(aluno2);



    }
    
}
