package aula26;

import java.io.File;
import java.io.IOException;

public class ErrosTipoChecked {
    public static void main(String[] args) {
        File arquivo = new Fiel("teste.txt");
        try{
            arquivo.createNewFile();
        }catch(IOException e){
            System.out.println("Deu ruim");
        }

        
    }
    
}
