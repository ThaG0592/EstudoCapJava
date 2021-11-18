package Aula3;

public class a3 {
    public static void main(String[] args) {
        //byte = *bites 0-255 - 11111111
        byte idade = 127;
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        //Shote 2 bytes - 16 bits 0-65535 -111111111111
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        //int 4Bytes - 32bits 0-65535 -111111111111
        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        //Long 8Bytes - 64bits 0-65535 -111111111111
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;

        System.out.println(minL);
        System.out.println(maxL);

//       Conversão implicita
//       long n1 = minI;
//       Conversão explicita
//       byte n2 = (byte)minL; == não converte corretamente 
//       long n3 = (long)"Thais"; == não funciona
    }
    
}
