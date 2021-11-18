package aula14.P1;

public class PessoaJuridica extends Pessoa{
     
    private String norme_fantasia;
    private String ie;
    private String cnpj;

    public void setNorme_fantasia(String norme_fantasia) {
        this.norme_fantasia = norme_fantasia;
    }
    public String getNorme_fantasia() {
        return norme_fantasia;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    public String getIe() {
        return ie;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    
}
