package Atividades.ATP07;

import java.util.Scanner;

public class Atividade7_primos {
    public static void main(String[] args) {

        System.out.println("Os numeros primos de 1 até 150 são: ");
        for (int i = 2; i <= 150; i++) {
            if( primo(i) )
                System.out.println(i);
        }
    }

    private static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
