package Atividades.ATP16;

public class Principal {
    
    public static void main(String [] args){
        CalculadoraTaxas calc = new CalculadoraTaxas();
        double taxasS1 = calc.calculaTaxaSaque(150.00);
        double taxasS2 = calc.calculaTaxaSaque(120.00);
        double taxasS3 = calc.calculaTaxaSaque(200.00);
        double taxasS4 = calc.calculaTaxaSaque(80.50);
        double taxasS5 = calc.calculaTaxaSaque(175.00);
        double taxasT1 = calc.calculaTaxaTransferencia(185.00);

        System.out.printf(" A taxa cobrada do saque foi  %.4f ,%.4f ,%.4f ,%.4f ,%.4f  \n", taxasS1,taxasS2,taxasS3,taxasS4,taxasS5);
        System.out.printf(" A taxa cobrada da transferencia foi  %.4f \n", taxasT1);    }   
}