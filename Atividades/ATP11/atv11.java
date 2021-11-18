package Atividades.ATP11;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';

        do {
            System.out.println("************************* Bradesco Financiamentos *********************** ");
            System.out.println("1 -Crédito Pessoal");
            System.out.println("2 -Crédito Imobiliário");
            System.out.println("3 -Crédito Empresarial");
            System.out.println("4 -Empréstimo Consignado");
            System.out.println("************************************************************************* ");
            System.out.println("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Crédito Pessoal");
                    break;
                case 2:
                    System.out.println("Crédito Imobiliário");
                    break;
                case 3:
                    System.out.println("Crédito Empresarial");
                    break;
                case 4:
                    System.out.println("Empréstimo Consignado");
                    break;
                default:
                    System.out.println("O numero digitado não é uma opção");
                    break;
            }
            if (opcao > 0 && opcao < 4) {
                do {
                    System.out.print("Para voltar digite V e para sair digite S:");
                    continua = sc.nextLine().toUpperCase().charAt(0);
                } while (continua != 'V' && continua != 'S');
                
            }

        } while (opcao < 1 || opcao > 4 || continua == 'V');

        sc.close();
    }
}
