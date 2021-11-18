package aula11;

public class Escola {
    public static void mais (String [] args){
            Boletim b= new Boletim();
            b.salvarMedia(1, 8, 6.5, 4.3);
            b.salvarMedia(3, 9, 8.5, 9.9);
            b.imprimirBoletim();

            double m3 = b.mediaBimestral(3);
            System.out.println(m3);
            

    }
    
    
}
