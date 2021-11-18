package Atividades.ATP09;

import java.util.Scanner;

public class Atividade9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double num1, num2;

        num1 = numeros();
        num2 = numeros();

        double r_soma = somar(num1, num2);
        double r_subtrai = subtrair(num1, num2);
        double r_multuplica = multiplicar(num1, num2);
        double r_divide = dividir(num1, num2);

        //Apresentação dos resultados
        resultados("soma", r_soma);
        resultados("subtração", r_subtrai);
        resultados("multiplicação", r_multuplica);
        resultados("divisão", r_divide);

    }


    static void resultados (String nome_operacao,double resultado){
        System.out.printf("\n O resultado da %s é %.2f", nome_operacao, resultado);
    }
    static double numeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }

    static double somar ( double n1, double n2){
        double resultado = n1+n2;
        return resultado;
    }
    static double subtrair ( double n1, double n2){
        double resultado = n1-n2;
        return resultado;
    }
    static double multiplicar ( double n1, double n2){
        double resultado = n1*n2;
        return resultado;
    }
    static double dividir ( double n1, double n2){
        double resultado = n1/n2;
        return resultado;
    }

}


