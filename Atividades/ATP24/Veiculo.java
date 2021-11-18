package Atividades.ATP24;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;
    
    @Override
    public String toString() {
        return "\nVeiculo"+"\nMarca: " + this.marca +"\nModelo: "+ this.modelo+"\nPlaca: "+ this.placa;
    }
}
