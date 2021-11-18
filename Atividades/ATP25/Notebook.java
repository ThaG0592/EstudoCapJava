package Atividades.ATP25;


public class Notebook extends Computador{
    public String bateria;
    public String velocidadeWifi;
    public double versaoBluetooth;

    @Override
    public String toString() {
        return  "\nNotebook" + 
                "\nMarca: " + this.marca +
                "\nMemoria Ram: " + this.memoriaRam +
                "\nProcessador: " + this.processador +
                "\nDisco Rigido: " + this.discoRigido +
                "\nBateria: " + this.bateria +
                "\nVelocidade Wifi: " + this.velocidadeWifi +
                "\nVersão Bluetooth: " + this.versaoBluetooth;
    }
}
