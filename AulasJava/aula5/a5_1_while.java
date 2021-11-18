package aula5;

import java.util.Scanner;

public class a5_1_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = "";

        boolean invalido = true;

        do {
            System.out.println("Digite no minimo 5 caracteres: ");
            System.out.println("Digite novamente o nome: ");
            if (nome.length() < 5) {
                System.out.println("Digite no minimo 5 caracteres: ");
                System.out.println("Digite novamente o nome: ");
            } else {
                invalido = false;
            }
            }
            while (invalido);

        }
    }

