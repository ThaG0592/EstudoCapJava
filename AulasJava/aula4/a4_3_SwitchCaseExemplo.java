package aula4;

import java.util.Scanner;

public class a4_3_SwitchCaseExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de cliente");
        System.out.println("\t 1- Cadastrar");
        System.out.println("\t 2- Listar");
        System.out.println("\t 0- Sair ");
        System.out.println("\t\n Escolha uma opção do menu");
       int op =sc.nextInt();
       switch (op) {
           case 1:
               System.out.println("Cadastrar cliente");
               break;
           case 2:
               System.out.println("Listar cliente");
               break;
           case 0:
               System.out.println("Sair do Sistema");
               break;

       }
    }
}
