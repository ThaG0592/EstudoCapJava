package Atividades.ATP10;

import java.util.Scanner;

public class atv10_2 {
    private static int salario;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    do{
    System.out.print("Informe seu Salario: ");
    double salario = sc.nextDouble();

    if(salario>1997.58 && salario<5399.99){
      
        System.out.printf("Seu salario é: R$%f", salario);
    }
    else if (salario<0){
            System.out.println("O Salario deve conter um numeri positovo");
    }
    else{
        System.out.println("Seu salario não se enquadra");

    }
    }while(salario == 0);
    }
}

