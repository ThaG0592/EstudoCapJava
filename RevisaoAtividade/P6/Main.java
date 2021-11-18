package P6;

public class Main {
    public static void main(String[] args) {
        Localizacao lc = new Localizacao(90, 80);
        System.out.println(lc);

       
        lc.setLatitude(120);
        lc.setLongitude(130);
        System.out.printf("Latitude:  %d", lc.getLatitude());
        System.out.printf("\nLongitude: %d", lc.getLongitude());
      
    }
    
}
