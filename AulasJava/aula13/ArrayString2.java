package aula13;

public class ArrayString2 {
    public static void main(String[] args) {
        
    String[] nomes = new String[5];
        
        //valor null da String
        System.out.println(nomes[0]);

        nomes[0] = "Thais";
        nomes[1] = "Jose";
        nomes[2] = "Robson";
        nomes[3] = "Silvio";
        nomes[4] = "Ronaldo";

        //percorre o array via laço for
        for(String n : nomes){
            System.out.println(n);
        }
    }
}
