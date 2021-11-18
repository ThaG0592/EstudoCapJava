package Atividades.ATP10;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        String nome, sobrenome, senhoridade;
        int idade;
        int cadastrar;

        String nomeling, descling;
        int front, back, mobile;

        ler_menu();


        nome = ler_nome();
        sobrenome = ler_sobrenome();
        senhoridade = ler_senhoridade();
        idade = ler_idade();
        cadastrar = case1();
        imprimir_negativa();
        front = ler_front();
        back = ler_back();
        mobile = ler_mobile();
        nomeling = ler_nomedalinguagem();
        descling = ler_descricaodalinguagem();

    }

    public static int ler_menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("==============BEM VINDO PROWAY CADASTRO=================");
        System.out.println("=================CADASTRO DE PRODUTOS===================");
        System.out.println("========================================================");
        System.out.println("|1| CADASTRAR DEV   |2| CADASTRAR LINGUAGEM     |3| SAIR");
        System.out.println("========================================================");
        System.out.println("Informe a opção desejada: ");

        int opcao = sc.nextInt();
        sc.nextLine();
        int escolha = 0;
        switch (escolha) {
            case 1:
                System.out.println("Digite o nome do desenvolvedor: ");
                System.out.println("Digite o sobrenome do desenvolvedor: ");
                System.out.println("Digite a senioridade do desenvolvedor: ");
                System.out.println("Digite a idade do dev: ");
                return opcao;

            case 2:
                System.out.println("Digite o nome da linguagem: ");
                System.out.println("Digite a descricao da linguagem: ");
                return opcao;

            case 3:

                System.out.println("================== OPAÇÃO DE CADASTRO ================= ");
                System.out.println("|1| Front-End        |2|Back-End              |3|Mobile ");
                System.out.println("========================================================");

                switch (opcao) {
                    case 1:
                        System.out.println("Opcao escolhida: Front-End. ");
                        System.out.printf("Parabens, a linguagem foi cadastrado com sucesso!");

                        break;
                    case 2:
                        System.out.println("Opcao escolhida: Back-End. ");
                        System.out.printf("Parabens, a linguagem foi cadastrado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Opcao escolhida: Mobile. ");
                        System.out.printf("Parabens, a linguagem foi cadastrado com sucesso!");
                        break;
                    case 4:
                        System.out.println("Digite novamente: ");
                        System.out.println("Cadastro realizado com sucesso!");
                        return opcao;

                    case 0:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opcao invalida. ");
                        break;
                }

                return opcao;
        }
        return opcao;
    }

    private static String ler_nome () {
        String nome = new String();
        return nome;
    }
    private static String ler_sobrenome () {
        String sobrenome = new String();
        return sobrenome;
    }
    private static String ler_senhoridade () {
        String senhoridade = new String();
        return senhoridade;
    }
    private static int ler_idade () {
        int idade = 0;
        return idade;
    }
    private static int ler_front () {
        int front = 0;
        return front;
    }
    private static int ler_back () {
        int back = 0;
        return back;
    }
    private static int ler_mobile () {
        int mobile = 0;
        return mobile;
    }
    private static String ler_nomedalinguagem () {
        String nomeling = new String();
        return nomeling;
    }
    private static String ler_descricaodalinguagem () {
        String descling = new String();
        return descling;
    }


    static void imprimir_negativa () {
        System.out.printf("\n Deve ter, no minimo, três (3) caracteres. ");
    }
    private static int case1 () {
        Scanner sc = new Scanner(System.in);
        boolean invalido = true;
        do {
            ler_nome();
            if (ler_nome().length() < 3) {
                imprimir_negativa();
            } else {
                invalido = false;
            }
        } while (invalido);
        invalido = true;
        do {
            ler_sobrenome();
            if (ler_sobrenome().length() < 3) {
                imprimir_negativa();
            } else {
                invalido = false;
            }
        } while (invalido);
        invalido = true;
        while (invalido) {
            ler_senhoridade();
            if (ler_senhoridade().length() < 3) {
                imprimir_negativa();
            } else {
                invalido = false;
            }
        }
        while (invalido) ;
        invalido = true;
        do {
            ler_idade();
            if (ler_idade() >= 1) {
                invalido = false;
            } else {
                imprimir_negativa();
            }
        } while (invalido);
        return 0;
    }


    private static void case2() {
        Scanner sc = new Scanner(System.in);
        boolean invalido = true;
        do {
            ler_nomedalinguagem();
            if (ler_nomedalinguagem().length() < 3) {
                imprimir_negativa();
            } else {
                invalido = false;
            }
        } while (invalido);
        invalido = true;
        do {
            ler_descricaodalinguagem();
            if (ler_descricaodalinguagem().length() < 3) {
                imprimir_negativa();
            } else {
                invalido = false;
            }
        } while (invalido);
    }


    private static String case3_default() {
        boolean invalido = true;
        imprimir_negativa();
        do {
            if (ler_mobile() > 3) {

            } else {
                invalido = false;
            }
        } while (invalido);

        return null;
    }
}




