package Atividades.ATP02;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("=============== Produtos Melhor Desempenho =================\n");
        System.out.println("=============== Cadatro de Cliente =================\n");
        System.out.println("\tBem-Vindo,Digite os dados do seu cliente.");

        System.out.print("\tDigite o nome  do cliente: ");
        String nome = sc.next();
        System.out.print("\tDigite o sobrenome  do cliente: ");
        String sobrenome = sc.next();

        System.out.print("\tDigite a descrição de idade: ");
        int idade = Integer.parseInt(sc.next());

        if (idade >= 18) {
            System.out.print("Cadastrado realizado com sucesso");
        } else{
                System.out.print("Cadastro não permitido menor de idade");
        }
    }
}
