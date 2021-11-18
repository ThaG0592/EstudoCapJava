package aula14.P1;

public class TelaPrincipal {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Maria Fofoqueira");
        System.out.print(pf.getNome());

        Cariopse c = new Cariopse();
        c.folhas = "as";

        Moto m = new Moto();
        m.marca = "honda";

        Carro car = new Carro();
        car.marca = "fiat";

    }
    
}
