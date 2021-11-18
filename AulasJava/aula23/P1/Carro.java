package aula23.P1;

public class Carro {
    public String marca;
    public String modelo;

    @Override
    public boolean equals(Object obj) {
        Carro outCarro = (Carro) obj;
        if(this.marca.equals(outCarro.marca) && this.modelo.equals(outCarro.modelo)){
            return true;
        }
        return false;
    }
    
    
}
