package Atividades.ATP10;

import java.util.Scanner;

public class atv10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte idade = 0;
    do{
        System.out.print("Informe sua Idade: ");
        idade = Byte.parseByte(sc.nextLine());

        if(idade>25){
          
            System.out.println("Passou dos 25 anos");
        }
        else if (idade==25){
            System.out.println("Esta com 25 anos");
        }
        else{
            System.out.println("Abaixo de 25 anos");
        }
    }while (idade==0);
    System.out.println("+++++++++++++++++++++++++++Obrigada!++++++++++++++++++++++++++++++++++++++++++++++++++++");
}
}