package P2;

public class Main {
    public static void main(String[] args) {
        Livro lv = new Livro();
        lv.setCodigo(978);
        lv.setTitulo("O Vendedor de Armas");
        lv.setAutor("Hugh Laurie");
        lv.setNumeroPag(287);

        System.out.printf("\n Codigo:   %d", lv.getCodigo());
        System.out.printf("\n Titulo:   %s", lv.getTitulo());
        System.out.printf("\n Autor:    %s", lv.getAutor());
        System.out.printf("\n Paginas:  %d", lv.getNumeroPag());
        
    }
}
