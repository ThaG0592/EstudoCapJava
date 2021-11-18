package aula26;

import java.util.ArrayList;

public class MaisAlgunsErros {
    public static void main(String[] args) {
       // int[] numeros = new int [5];
       // System.out.println(numeros[6]);

        ArrayList<String> nome = new ArrayList<String>();
        nome.add("Maykon");
        nome.add("Jojo");
        nome.add("Inês");
        System.out.println(nome.get(5));
    }
    
}
