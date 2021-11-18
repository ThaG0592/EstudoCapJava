package Atividades.ATP27.models;


public class Filmes {
    public int id;
    public String titulo;
    public String diretor;
    public int ano;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filmes){
            Filmes outro = (Filmes)obj;
            if(this.id == outro.id){
                return true;
            }
        } return false;
    }
    @Override
    public String toString() {
        String imprime =    "\nTitulo: " + this.titulo +
                            "\nDiretor: " + this.diretor +
                            "\nAno: " + this.ano;
        return imprime; 
    }

    
}
