package P4;

public class Caminhao extends Veiculo {
    private int capCarga;
    private String antt;
    private String tracao;
    private String semirreboque;

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }
    public int getCapCarga() {
        return capCarga;
    }

    public void setAntt(String antt) {
        this.antt = antt;
    }
    public String getAntt() {
        return antt;
    }
    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
    public String getTracao() {
        return tracao;
    }
    public void setSemirreboque(String semirreboque) {
        this.semirreboque = semirreboque;
    }
    public String getSemirreboque() {
        return semirreboque;
    }


    
}
