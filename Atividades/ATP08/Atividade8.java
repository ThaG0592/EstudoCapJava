package Atividades.ATP08;

import java.util.Scanner;

public class Atividade8 {
    public static <juros> void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("================== CADASTRO DE CALCULO =================");
        System.out.println("1 - NUMEROS PARES   ");
        System.out.println("2 - NUMEROS IMPARES ");
        System.out.println("3 - PRIMOS ");
        System.out.println("4 - JUROS ");
        System.out.println("5 - SAIR ");
        System.out.println("================== SELECIONE UMA OPÇÃO =================");

        int escolha = sc.nextInt();
        sc.nextLine();
        int contador, numero, mes;
        double invest;
        double juros;
        double caljuros;
        double novoinvest;



        switch (escolha) {
            case 1:
                System.out.println("Informe o numero Par: ");
                contador = Integer.parseInt(sc.next());

                if (contador % 2 == 0) {
                    for (int i = contador; i >= 0; i--) {
                        if (i % 2 == 0) {
                            System.out.printf("\nO numero %s é par", i, contador);
                        }
                    }
                } else {
                    System.out.printf("O numero não é par");
                }
                break;
            case 2:
                System.out.println("Informe o numero impar: ");
                contador = Integer.parseInt(sc.next());

                if (contador % 2 != 0) {
                    for (int i = contador; i >= 0; i--) {
                        if (i % 2 != 0) {
                            System.out.printf("\nO numero %s é impar", i, contador);
                        }
                    }
                } else {
                    System.out.printf("O numero não é impar");
                }
                break;
            case 3:
                System.out.println("Informe um numero: ");
                contador = Integer.parseInt(sc.next());

                out:
                for (int i = contador; i >= 2; i--) {
                    for (int k = 2; k <= Math.sqrt(i); k++) {
                        if (i % k == 0) continue out;
                    }

                }
                break;
            case 4:
                System.out.println("Informe um o valor investido: ");
                invest = Integer.parseInt(sc.next());
                while (invest < 0){

                    System.out.print("\tEsse valor não pode ser negativo, informar novamente: ");
                    invest = Integer.parseInt(sc.next());
                }
                System.out.println("Informe um os meses usados na aplicação: ");
                mes = Integer.parseInt(sc.next());
                while (mes < 0){

                    System.out.print("\tEsse valor não pode ser negativo, informar novamente:");
                    mes = Integer.parseInt(sc.next());
                }
                System.out.println("Informe a taxa de juros: ");
                juros = Integer.parseInt(sc.next());
                while (juros < 0){

                    System.out.print("\tEsse valor não pode ser negativo, informar novamente:");
                    juros = Integer.parseInt(sc.next());
                }
                for (int i= 1; i<=mes; i++) {
                    caljuros = juros / 100;
                    novoinvest = invest +=invest * caljuros;

                    System.out.printf("\n O Mês de investimento é %d com o valor acumulado %.2f", i, novoinvest);
                }
                break;
            case 5:
                System.out.println("\n Volte Sempre!");

                break;
        }

    }
}

