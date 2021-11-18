package Atividades.ATP31.model;

public class Produto {
    public String tipo;
    public double valor;
    
    @Override
    public String toString() {
        return "Tipo: " + this.tipo +  "Valor: " + this.valor;
    };
}
