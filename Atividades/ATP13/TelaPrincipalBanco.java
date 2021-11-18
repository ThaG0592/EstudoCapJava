package Atividades.ATP13;

public class TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente banco = new ContaCorrente();

        banco.setAgencia(234);
        int ag = banco.getAgencia();
        System.out.println(ag);

        banco.setCodigoCliente(3);
        int cc = banco.getCodigoCliente();
        System.out.println(cc);

        banco.setNumero(45679);
        int nn = banco.getNumero();
        System.out.println(nn);

        banco.setSaldo(1250.40);
        double sd = banco.getSaldo();
        System.out.println(sd);
    }
}
