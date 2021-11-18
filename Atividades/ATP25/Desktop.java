package Atividades.ATP25;

public class Desktop extends Computador {
    public String tamanhoGabinete;
    public int monitorExterno;
    public String fonte;

    @Override
    public String toString() {
       return   "\nDesktop" + 
                "\nMarca: " + this.marca +
                "\nMemoria Ram: " + this.memoriaRam +
                "\nProcessador: " + this.processador +
                "\nDisco Rigido: " + this.discoRigido +
                "\nTamanho Gabinete: " + this.tamanhoGabinete +
                "\nMonitor Externo: " + this.monitorExterno +
                "\nFonte: " + this.fonte;
    }
    
}
