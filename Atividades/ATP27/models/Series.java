package Atividades.ATP27.models;

public class Series extends Filmes {
    public int temporada;
    public String tempo;

    @Override
    public String toString() {
        String imprime =    super.toString() +
                            "\nTemporada: " + this.temporada +
                            "\nDuração em minutos: " + this.tempo;
        return imprime;
    }
    
}
