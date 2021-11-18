package Aula4;

public class a4 {
    
public static void main(String[] args) {
    //float 4 bytes 32 bits 1 sinal - 8 espoente 23 precisao
    float minF = Float.MIN_VALUE;
    float maxF = Float.MAX_VALUE;
    System.out.println(minF);
    System.out.println(maxF);

    //double 8 bytes 64 bits 1 sinal - 11 espoente 52 precisao
    double minD = Double.MIN_VALUE;
    double maxD = Double.MAX_VALUE;
    System.out.println(minD);
    System.out.println(maxD);

    float salario = 1998.89F;
    double salar = 1998.89;
    double valor1 = 88888.89f;
    double valor2 = 88888.89;

    System.out.println(salario);
    System.out.println(valor2);

}
}