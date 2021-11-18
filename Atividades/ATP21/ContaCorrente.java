package Atividades.ATP21;

public class ContaCorrente extends Conta{
    private double taxaTranferencia = 10.5;
    private double taxaManutencao = 2.5;
    private int numeroTranferenci;

    @Override
    public void transferencia(double valor){
        super.transferencia(valor);
        double novoSaldo = this.getSaldo() - taxaTranferencia;
        this.setSaldo(novoSaldo);
        numeroTranferenci++;

        if(numeroTranferenci  % 5 == 0 ){
            novoSaldo = this.getSaldo() - taxaManutencao;
            this.setSaldo(novoSaldo);            
        }
    }


    public void taxaManutencao(double valorManu){
        double novSaldo = this.getSaldo() - valorManu;
        this.setSaldo(novSaldo);
    }
    
}
