package Atividades.ATP22.P2;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 2.50;
    private int codigoCliente;

   
public ContaCorrente(double saldo, int codigoCliente){
    this.saldo = saldo;
    this.codigoCliente = codigoCliente;
}
public void saque(double saque){
    this.saldo -= (saque + this.taxaSaque);
}

public void deposito(double deposito){
    this.saldo += deposito;
}
@Override
public String toString() {
   return " \n Codigo do Cliente: "+ this.codigoCliente + "\n Taxa: " + this.taxaSaque + "\n Saldo: " + this.saldo;
}
}
