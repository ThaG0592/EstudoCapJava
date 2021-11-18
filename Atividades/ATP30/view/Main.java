package Atividades.ATP30.view;

import java.util.Scanner;

import Atividades.ATP30.controll.CalculadoraControll;
import Atividades.ATP30.model.Calculadora;
import Atividades.ATP30.model.Divisao;
import Atividades.ATP30.model.Multiplicacao;
import Atividades.ATP30.model.Soma;
import Atividades.ATP30.model.Subtracao;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static CalculadoraControll calculadoraControll = new CalculadoraControll();
    static Calculadora calculadora = new Calculadora();
    static Divisao divisao = new Divisao();
    static Multiplicacao multiplicacao = new Multiplicacao();
    static Subtracao subtracao = new Subtracao();
    static Soma soma = new Soma();
    public static void main(String[] args) {
         int n1;
         int n2;
         
        System.out.println("=============== Calculadora ===============");
        System.out.println("Informe o primeiro numero inteiro:  ");
        n1 = calculadoraControll.n1;
        System.out.println("Informe o segundo numero inteiro:  ");
        n2 = calculadoraControll.n2;
        System.out.println("========Informe a operação desejada========");
        System.out.println("1 - Somar || 2 - Subtrair || 3 - Multiplicar || 4 - Dividir ");

        int opcao = sc.nextInt();
        sc.nextLine();
        switch(opcao){
            case 1:
            Soma.somar(n1, n2);
            break;
            case 2:
            Subtracao.subtrair(n1, n2);
            break;
            case 3:
            Multiplicacao.multiplicar(n1, n2);
            break;
            case 4:
            Divisao.dividir(n1, n2);
            break;
            

        }
    }

   
  
    
    
    

 
    
}
