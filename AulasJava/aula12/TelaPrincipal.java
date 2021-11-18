package aula12;

public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
       
        p1.setNome("Thais");
        String n = p1.getNome();
        System.out.println(n);

        p1.setSobrenome("Gaiardo");
        p1.getSobrenome();
        String s = p1.getSobrenome();
        System.out.println(s);

        p1.setIdade(29);
        int i = p1.getIdade();
        System.out.println(i);
        

        p1.setCpf("333.333.333.33");
        String c = p1.getCpf();;
        System.out.println(c);

    }
    
}
