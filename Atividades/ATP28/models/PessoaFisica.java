package ATP28.models;

public class PessoaFisica extends Base{
    public String nomeCompleto;
    public String cpf;
    public Endereco enderecoFisica;

    @Override
    public String toString() {
        String retorno =    "Nome Completo: " + this.nomeCompleto + 
                            "CPF: " + this.cpf +
                            "Endereço: " + this.enderecoFisica;
        return retorno;
    };
    
}
