package Atividades.ATP21;

public class Conta {
    private double saldo;
    private int codigoCliente;
 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void transferencia (double valorTranf){
        saldo -= valorTranf;
        System.out.printf("\n O valor tranferido: R$ %.2f",valorTranf );
    }

}
