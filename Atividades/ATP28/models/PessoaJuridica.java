package ATP28.models;

public class PessoaJuridica extends Base{
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;
    public Endereco enderecoPessoaJuridica;

    @Override
    public String toString() {
        String retorno =    "Razão Social: " + this.razaoSocial + 
                            "Nome Fantasia: " + this.nomeFantasia +
                            "CNPJ: " + this.cnpj+
                            "Endereço: " + this.nomeFantasia;
        return retorno;
    };
}
