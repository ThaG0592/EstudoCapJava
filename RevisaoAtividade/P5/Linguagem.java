package P5;

public class Linguagem {
    private String dataCriacao;
    private String oob;
    private String tipoTipagem;

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setOob(String oob) {
        this.oob = oob;
    }
    public String getOob() {
        return oob;
    }

    public void setTipoTipagem(String tipoTipagem) {
        this.tipoTipagem = tipoTipagem;
    }
    public String getTipoTipagem() {
        return tipoTipagem;
    }
    @Override
    public String toString() {
        String retorno = "\nCriação: " + this.dataCriacao + 
        "\nOrentada a Objeto: " + this.oob + 
        "\nTipagem: " +this.tipoTipagem;
        return retorno;
    }
    
}
