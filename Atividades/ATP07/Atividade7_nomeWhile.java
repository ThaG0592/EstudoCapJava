package Atividades.ATP07;

import java.util.Scanner;

public class Atividade7_nomeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, sobrenome;
        int i = 1;

        System.out.println("Digite o nome ");
        nome=sc.next();
        System.out.println("Digite o sobrenome ");
        sobrenome=sc.next();

        while (i <= 10){
            System.out.printf("\n O nome completo: %d %s %s", i, nome, sobrenome);
            i++;
        }


    }
}



