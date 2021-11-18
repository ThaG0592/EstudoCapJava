package P7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        int [] inteiro = new int [10];
        for (int i = 0; i < inteiro.length; i++ ){
          System.out.println(i);
        }

        List<Integer> in =  new ArrayList<Integer>();
        in.add(10);
        in.add(11);
        in.add(12);
        in.add(13);
        in.add(14);
        in.add(15);
        for(int cont : in){
            System.out.println(cont);
        }

    
    }

}
