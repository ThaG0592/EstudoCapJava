package Atividades.ATP31.view;

import java.util.Scanner;

import Atividades.ATP31.controller.ProdutoContoller;
import Atividades.ATP31.model.Produto;

public class MainProduto {
    static Scanner scanner = new Scanner(System.in);
    static ProdutoContoller produtoContoller = new ProdutoContoller();
    static Produto produto = new Produto();
    public static void main(String[] args) {


        System.out.println("================== Cadastro de Produtos ====================");
        System.out.println("==================== Escolha uma opção =====================");
        System.out.println("1 - Cadastrar || 2 - Alterar || 3 - Consultar || 4 - Excluir");

        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch(opcao){
            case 1:
                System.out.println("Informe o nome: ");
                int nome.produto.
                System.out.println("Informe o descrição: ");
                System.out.println("Informe o tipo: ");
                System.out.println("Informe o valor: ");
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            default:

        }

    }
}
