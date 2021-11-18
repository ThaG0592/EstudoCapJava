package Atividades.ATP07;

public class Atividade7_investimentos {
    public static void main(String[] args){
        double invest = 5000.00;
        double juros = 0.02;
        double novoinvest = invest;

        for (int mes= 1; mes<=24; mes++) {

            novoinvest = invest += invest * juros;
            System.out.printf("\n O Mês de investimento é %d com o valor acumulado %.2f", mes, novoinvest);

        }
    }
}
