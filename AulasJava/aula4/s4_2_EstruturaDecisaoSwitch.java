package aula4;

public class s4_2_EstruturaDecisaoSwitch {

    public static void main(String[] args) {
        int idade = 15;
        String nome = "Joana";
        //double salario = 9998.00; não compativel

        switch (nome) {
            case "Thais":
                System.out.println("Valor1");
                break;
            case "Diego":
                System.out.println("Valor5");
                break;
            case "Emilia":
                System.out.println("Valor10");
                break;
            default:
                System.out.printf("Valor defaul %s", nome);
        }
    }
}
