package Atividades.ATP17;

public class Calculo {
    private double taxaIR = 0.14;
    private double taxaISS = 0.05;
    private double taxaIOF = 0.06;
  
    
    public double calculaTaxaIR(double valor){
        double valorTaxa = valor * taxaIR;
        return valorTaxa;
    }

    public double calculaTaxaISS(double valor){
        double valorTaxa = valor * taxaISS;
        return valorTaxa;
    }

    public double calculaTaxaIOF(double valor){
        double valorTaxa = valor * taxaIOF;
        return valorTaxa;
    }


}
    

