package Atividades.ATP05;

import java.io.PrintStream;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================Sistema Desenvolvedores=============== ");
        System.out.println("================Cadastro de Cliente=================== ");
        System.out.println("\t 1- Cadatrar Dev");
        System.out.println("\t 2- Cadastra linguagem");
        System.out.println("\t 3- Sair ");
        System.out.println("================Escolha uma Opção===================== ");

        //case 1
        int idade;
        String nome,sobrenome;
        //case 2
        String nomelinguagem,aplicação;



        int op = Integer.parseInt(sc.nextLine());
        switch (op) {
            case 1:
                System.out.print("\tDigite o nome: ");
                nome = sc.nextLine();

                while (nome.length()<3) {

                    System.out.print("\tNome com menos de 3 caracteres digite novamente: ");
                    nome = sc.nextLine();
                }

                System.out.print("\tDigite o sobrenome: ");
                sobrenome = sc.nextLine();

                while (sobrenome.length()<3){

                    System.out.print("\tSobrenome com menos de 3 caracteres digite novamente: ");
                sobrenome = sc.nextLine();
                }

                System.out.print("\tDigite o senioridade: ");
                String senioridade = sc.nextLine();


                System.out.print("\tDigite a idade: ");
                idade = sc.nextInt();
                while (idade <= 0){
                    System.out.print("\tIdade menor ou igual a zero digite novamente: ");
                    idade = sc.nextInt();
                }



                System.out.printf("\t\n Desenvolvedor %s cadastrado com sucesso", nome);
                break;

            case 2:
                System.out.print("\tDigite o nome da linguagem: ");
                nomelinguagem = sc.nextLine();

                while (nomelinguagem.length()<3){
                    System.out.print("\tLinguagem com menos de 3 caracteres digite novamente: ");
                    nomelinguagem = sc.nextLine();
                }


                System.out.print("\tDigite a descrição: ");
                String descricao = sc.nextLine();

                System.out.println("Selecione uma das aplicações ");
                System.out.println("\t 1- Frontend");
                System.out.println("\t 2- Backend");
                System.out.println("\t 3- Mobile");
                System.out.print("\tEscolha uma Opção: ");

                int ab = Integer.parseInt(sc.nextLine());

                while (ab<0 || ab>3){
                  System.out.print("\tOpção invalida digite novamente : ");
                    ab = Integer.parseInt(sc.nextLine());
                }

            System.out.printf("\t\n Linguegem %s cadastrada com sucesso", nomelinguagem);
            break;

            case 3:
                System.out.printf("\t\n Esperamos você de volta!");
            break;
        }
    }
}
