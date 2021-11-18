package Atividades.ATP22.P3;

public class Tela {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int c1 = c.somaI(10, 20);
        double c2 = c.somaD(12.5,13.30);
        float c3 = c.somaF(15.5f,14.6f,18.4f);
        long c4 = c.somaL(12,11,17);

        System.out.println("Soma dos valores:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
