package Atividades.ATP22.P2;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1500, 1234);

        cc.saque(100);      
        cc.deposito(30);

        System.out.println(cc);

     
    }
    
}
