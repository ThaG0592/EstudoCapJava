package Atividades.ATP21;

public class Teste {
    public static void main(String[] args) {
        double saldo = 10000;
        double tranf = 200;

        Conta c = new Conta();

        System.out.println("\n =============== Cliente tipo Conta ===============");
        c.setCodigoCliente(12345);
        System.out.printf("\n Codigo do cliente : %d" , c.getCodigoCliente());
        c.setSaldo(saldo);
        System.out.printf("\n Saldo Incial: R$ %.2f ", saldo);
        c.transferencia(tranf);
        System.out.printf("\n Saldo final : R$ %.2f \n",c.getSaldo());        
        System.out.println("\n ==================================================");

        ContaCorrente cc = new ContaCorrente();

        System.out.println("\n ========== Cliente tipo Conta Corrente ===========");
        cc.setSaldo(saldo);
        cc.setCodigoCliente(12346);
        System.out.printf("\n Codigo do cliente : %d \n Saldo Incial: R$ %.2f", cc.getCodigoCliente(), saldo);

        for (int i = 1; i <= 6; i++) {
            cc.transferencia(tranf);  
        }

        System.out.printf("\n Saldo Final: R$ " + cc.getSaldo());
        System.out.println("\n ==================================================");

        
    }
    
}
