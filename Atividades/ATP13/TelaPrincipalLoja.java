package Atividades.ATP13;

public class TelaPrincipalLoja {
    public static void main(String[] args) {
        Produto prod1 = new Produto();

        prod1.setCodigo(123);
        int cod = prod1.getCodigo();
        System.out.println(cod);

        prod1.setNome("Camiseta");
        String nm = prod1.getNome();
        System.out.println(nm);

        prod1.setDescricao("Laranja da marca Xo");
        String des = prod1.getDescricao();
        System.out.println(des);

        
        prod1.setValor(35.00);
        Double val = prod1.getValor();
        System.out.println(val);
    }
}
