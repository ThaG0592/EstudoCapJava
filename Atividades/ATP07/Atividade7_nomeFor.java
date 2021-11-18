package Atividades.ATP07;

import java.util.Scanner;

public class Atividade7_nomeFor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            String nome, sobrenome;

            System.out.println("Digite o nome ");
            nome=sc.next();
            System.out.println("Digite o sobrenome ");
            sobrenome=sc.next();


        for (int i = 1; i<=10; i++){
            System.out.printf("\n O nome completo: %d %s %s", i, nome, sobrenome);

        }



    }
}

