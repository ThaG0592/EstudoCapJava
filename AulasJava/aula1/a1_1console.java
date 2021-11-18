package aula1;

import java.util.Scanner;

public class a1_1console {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

//       //println imprime e pula a linha
//        System.out.println("Olá");
//        //print imprime e não pula a linha
//        System.out.print("Tchau");
//        //Com duas aspas mais de um caracter
//        System.out.print("Mais uma vez");
//        //Com uma aspa só aceita um caracter
//        System.out.print('2');

        System.out.print("Digite seu nome: ");
    String nome = scanner.next();

        System.out.print("Digite seu nome: ");
    String sobrenome = scanner.next();

        System.out.println("O nome  e sobrenome digitado foi: " + nome +"  "+ sobrenome);
}

}
