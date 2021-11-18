package P4;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private String chassi;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getChassi() {
        return chassi;
    }
    
}
