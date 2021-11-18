package Atividades.ATP24;

public class Carro extends Veiculo{
    public int portas;
    public int portaMalas;

    @Override
    public String toString() {
        return "\nCarro"+"\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPlaca: " + this.placa + "\nPortas: " + this.portas + "\nLitros do Posta-Malas:  " + this.portaMalas;
    }

}
