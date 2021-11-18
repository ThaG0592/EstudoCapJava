package Atividades.ATP23.Model;


public class Livro {
    public String titulo;
    public String autor;
    public String editora;
    public int id;
    public double valor;

    public Livro (int id){
        this.id = id;
    }
    
    public Livro() {
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }
   
    public int getId() {
        return id;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    @Override
    public boolean equals(Object obj) {
        Livro outro = (Livro)obj;
        if(this.id == outro.id){
            return true;
        }else{
            return false;
        }
    }
 
  
}
