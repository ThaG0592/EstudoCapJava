package Atividades.ATP25;


public class Computador {
    public String marca;
    public int memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
            return  "\nComputador" + 
                    "\nMarca: " + this.marca +
                    "\nMemoria Ram: " + this.memoriaRam +
                    "\nProcessador: " + this.processador +
                    "\nDisco Rigido: " + this.discoRigido;
    }
}
