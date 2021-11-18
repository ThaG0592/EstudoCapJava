package aula21.P2;

public class PessoaFisica extends Pessoa {
    public String cpf;

    @Override
    public void imprimir(){
        System.out.println("Imprimir Pessoa Fisica");
        super.imprimir();
    }
    public void Ler(){
        System.out.println("Lendo");
    }
    
}
