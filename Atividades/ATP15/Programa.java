package Atividades.ATP15;

public class Programa {

    public static void main(String[] args){

        titulo();
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome  = "Maria";
        pessoa1.sobrenome = "Pereira";
        pessoa1.idade = 34;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome  = "João";
        pessoa2.sobrenome = "Silva";
        pessoa2.idade = 25;

      
        impressao(pessoa1, pessoa2);

        Fim();
      
    }

    private static void Fim() {
        System.out.println("\n ===========================================================================");
    }

    private static void titulo() {
        System.out.println("\n =========================== Cadastro de pessoas ===========================");
    }

    private static void impressao(Pessoa pessoa1, Pessoa pessoa2) {
        System.out.printf("\n Nome: %s, Sobrenome: %s, Idade: %d", pessoa1.nome, pessoa1.sobrenome, pessoa1.idade);
        System.out.printf("\n Nome: %s, Sobrenome: %s, Idade: %d", pessoa2.nome, pessoa2.sobrenome, pessoa2.idade);
    }

    
}
