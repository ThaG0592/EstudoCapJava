package Atividades.ATP03;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=============== XILFTEN =================\n");
        System.out.println("\tBem-Vindo,Ao sistema de filmes, seiries e documentarios.");

        System.out.println("\t 1- Filme");
        System.out.println("\t 2- Serie ");
        System.out.println("\t 3- Documentario ");
        System.out.println("\t 4- Sair ");
        System.out.println("\t\n Escolha uma opção do menu");

        int op = Integer.parseInt(sc.nextLine());
        switch (op) {
            case 1:
                System.out.print("\tDigite o titulo  do filme ");
                String titulo = sc.nextLine();
                System.out.print("\tDigite a descrição ");
                String descricao = sc.nextLine();
                System.out.print("\tDigite o genero: ");
                String genero = sc.nextLine();
                System.out.print("\tDigite o ano de lançamento: ");
                String ano = sc.nextLine();
                System.out.printf("\t\n Filme %s cadastrado com sucesso", titulo);
                break;
            case 2:
                System.out.print("\tDigite o titulo  da serie ");
                String tituloserie = sc.nextLine();
                System.out.print("\tDigite o ano de lançamento ");
                String anolancamento = sc.nextLine();
                System.out.print("\tDigite a produtora: ");
                String produtora = sc.nextLine();
                System.out.printf("\t\n Serie %s cadastrada com sucesso", tituloserie);
                break;
            case 3:
                System.out.print("\tDigite o titulo  do Documentario ");
                String tituloDocumentario = sc.nextLine();
                System.out.print("\tDigite a descrição ");
                String anolancamentoDocumentario = sc.nextLine();
                System.out.print("\tDigite o genero: ");
                String tema = sc.nextLine();
                System.out.printf("\t\n Documentario %s cadastrado com sucesso", tituloDocumentario);
                break;
            case 4:
                System.out.printf("\t\n Esperamos você de volta!");
                break;
        }
    }
}
