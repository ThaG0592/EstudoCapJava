package P2;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int numeroPag;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setTitulo(String tirulo) {
        this.titulo = tirulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }
    public int getNumeroPag() {
        return numeroPag;
    }
}
