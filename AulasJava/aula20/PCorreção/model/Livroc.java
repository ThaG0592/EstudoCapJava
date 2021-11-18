package aula20.PCorreção.model;

public class Livroc {
    
    private int id;
    private String titulo;
    private String autor;

    public Livroc (int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
   
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public boolean equals(Object obj) {
        Livroc outro = (Livroc)obj;
        if(this.id == outro.id){
            return true;
        }else{
            return false;
        }
    }
}
