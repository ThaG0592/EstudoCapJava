//Dia 2021 - 09 - 21
// Modulo 2 - Aula 9 - Procedimentos, funções e Metodos
//SRP = Single Responsability Principle - Principior da rresponsabilidade unica

package aula9;

import java.util.Scanner;

public class a9_1_metodos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        cabecalho();
        imprimeMenu();
        escolhaMenu();
        

    }
    static void cabecalho(){
        System.out.println("==================Calculadora=====================\n");
    }
    static void imprimeMenu(){
        System.out.println("Menu");
        System.out.println("1-Soma\t");
        System.out.println("2-Subtração\t");
        System.out.println("3-Divisão\t");
        System.out.println("4-Multiplicação\t");
        System.out.println("0-Sair\t");
    }
    static void escolhaMenu() {

        System.out.println("========================================================\n");
        int op = lerNumeros("Digite uma opção");
        int n1 = 0,n2 = 0,r=0;

        if (op >0) {
            n1 = lerNumeros("Digite o primeiro numero: ");
            n2 = lerNumeros("Digite o segundo numero: ");
        }


        switch (op) {
            case 1: //soma
               r = soma(n1, n2);
                break;
            case 2: //subtração
                r = subtracao(n1, n2);
                break;
            case 3: //divisao
                r = divisao(n1, n2);
                break;
            case 4: //multiplicação
                r = multiplicacao(n1, n2);
                break;
            case 0: //sair
                return;
        }
        System.out.printf("Resultado da Operação: %d", r);

    }
    static int lerNumeros(String mensagem){
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    //== Operações
    static int soma (int numero1, int numero2){
        int resultado = numero1+numero2;
        return resultado;
    }
    static int subtracao (int numero1, int numero2){
        int resultado = numero1-numero2;
        return resultado;
    }
    static int divisao (int numero1, int numero2){
        int resultado = numero1/numero2;
        return resultado;
    }
    static int multiplicacao (int numero1, int numero2){
        int resultado = numero1 * numero2;
        return resultado;
    }
}
