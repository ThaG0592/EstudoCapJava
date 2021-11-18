package aula28.view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Escrita {
    public static void main(String[] args) {
        
        try {
            FileOutputStream fos = new FileOutputStream("dados/molhos.txt");  
            OutputStreamWriter ow = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(ow); 
            
            bw.write("Sugo\n");
            bw.write("Branco\n");
            bw.close();
       
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não encontrado");

        }catch (IOException e) {
            System.out.println("arquivo não encontrado");
        
        }
    }
}
