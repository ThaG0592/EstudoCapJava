package aula13;

public class ArrayInteiros {
    public static void main(String[] args) {
        int idade1 = 10;
        int idade2 = 15;
        int idade3 = 18;
        int idade4 = 20;

        int[] idades = new int[5];
        idades [0] = idade1;
        idades [1] = idade2;
        idades [2] = idade3;
        idades [3] = idade4;
        idades [4] = 85;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        System.out.println(idades[3]);
        System.out.println(idades[4]);

        //length contem o tamanho do array
        System.out.println(idades.length);
    }
}
