package aula21.P1;

public class Filha extends Mae {
    public String carro;
    // esse processo chama pilha de chamada quando chamamos elementos de mais classes que são extends
    @Override
    public void falar(){
        //super.falar();
        System.out.println("carro");
        
    }
}
