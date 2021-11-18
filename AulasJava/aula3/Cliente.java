package aula3;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== Cadatro de Cliente =================\n");
        System.out.println("\tBem-Vindo,Digite as informações do cliente.");
        System.out.printf("\tDigite o nome do clinete: ");
        String nome = sc.next();
        System.out.print("\tDigite sa idade do cliente: ");
        short idade = sc.nextShort();
        System.out.printf("\tO cliente %s de idade %d foi cadastrado com sucesso!\n",nome, idade);

    }
}
