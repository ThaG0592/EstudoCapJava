package Atividades.ATP23.View;

import java.util.ArrayList;
import java.util.Scanner;

import Atividades.Atividade17.ATP23.Controler.ControllerLivro;
import Atividades.Atividade17.ATP23.Model.Livro;

public class LivroView {
    private static Livro[] lista;

    public static void main(String[] args) {
        ControllerLivro cadastro = new ControllerLivro();
        Scanner sc = new Scanner(System.in);
        

        int opcao = menu(sc);

        do{
            switch(opcao){
                case 1:
                    cadatro(sc, cadastro);

                break;
                case 2:
                    Listar(cadastro);
                break;
                case 3:
                    excluir(cadastro);
                break;
                case 4:
                    atualizar(cadastro);
                break;
                case 5:
                    sair();
                break;

            }
        }while(opcao != 0);

    }
    private static void atualizar(ControllerLivro cadastro){

    }


    private static void sair() {
        System.out.println("Volte sempre!");
        
    }

    private static void excluir(ControllerLivro cadastro) {
        Livro livros = new Livro();
        cadastro.excluir(livros);
    }

    private static void Listar(ControllerLivro cadastro) {
        ArrayList<Livro> livro1 = cadastro.listar();
            for(Livro liv : lista){
            System.out.println(livro1);
             }
    }

    private static void cadatro(Scanner sc, ControllerLivro cadastro) {
        Livro livro = new Livro();
        System.out.println("Informe o titulo do livro: ");
        livro.titulo = sc.nextLine();
        System.out.println("Informe o autor do livro: ");
        livro.autor = sc.nextLine();
        System.out.println("Informe o editora do livro: ");
        livro.editora = sc.nextLine();
        System.out.println("Informe o valor do livro: ");
        livro.valor = sc.nextDouble();
        cadastro.salvar(livro);
    }

    private static int menu(Scanner sc) {
        System.out.println("***** Cadastro de Livro *****");
        System.out.println("***** Escolha uma opção: *****");
        System.out.println("1 - Cadastro: ");
        System.out.println("2 - Listar: ");
        System.out.println("3 - Excluir: ");
        System.out.println("4 - Atualizar: ");
        System.out.println("5 - Sair: ");

        

        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }
}
