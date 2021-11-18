package aula21.P1;

public class Main {
    public static void main(String[] args) {
        Mae mae = new Mae();
        Filha filha = new Filha();
        Neta neta = new Neta();

        Mae mae2 = new Filha();
        // não é possivel converter a Neta ou filha em mãe mas é possivel da Mãe para 
        //filha e para Neta, pois os dados que contam na mãe contam na neta mas o contrario não ocorre.
        Mae mae3 = new Neta();
        Filha filha2  = new Neta();
       // mae.falar(); imprime só a mãe
        //filha.falar(); imprime mãe filha
        // neta.falar(); imprime mãe filha e neta
        Mae mae4 = filha;
        mae4.falar();
    }
    
}
