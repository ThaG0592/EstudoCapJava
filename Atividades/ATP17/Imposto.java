package Atividades.ATP17;

public class Imposto {

    Calculo imptaxa = new Calculo();
        public static void main(String[] args) {
            Calculo imptaxa = new Calculo();
            double taxISS = imptaxa.calculaTaxaISS(1000);
            double taxIOF = imptaxa.calculaTaxaIOF(1000);
            double taxIR = imptaxa.calculaTaxaIR(1000);

            System.out.printf("O valor do ISS foi  %.2f \n", taxISS);
            System.out.printf("O valor do IOF foi  %.2f \n", taxIOF);
            System.out.printf("O valor do IR foi  %.2f \n", taxIR);

    }    
}
