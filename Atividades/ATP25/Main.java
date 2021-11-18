package Atividades.ATP25;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.marca = "Acer";
        computador.memoriaRam = 64;
        computador.processador = "i7";
        computador.discoRigido = "2T";

        Notebook notebook = new Notebook();
        notebook.marca  = "Acer";
        notebook.memoriaRam = 128;
        notebook.processador = "i7";
        notebook.discoRigido = "4T";
        notebook.bateria = "4 Celulas li-ion 57 Wh";
        notebook.velocidadeWifi = "5 ghtz";
        notebook.versaoBluetooth = 5.0;

        Desktop desktop = new Desktop();
        desktop.marca = "Acer";
        desktop.memoriaRam = 256;
        desktop.processador= "i7";
        desktop.discoRigido = "6T";
        desktop.tamanhoGabinete = "40 x 23 x 42 cm";
        desktop.monitorExterno  = 40;
        desktop.fonte = "650 W";

        // impressão normal do computador
        System.out.println(computador);
        // impressão normal do notebook
        System.out.println(notebook);
        // impressão normal do desktop
        System.err.println(desktop);

        //Criando Object para imprimir computador; notebook e desktop
        Object obj1 = computador;
        Object obj2 = notebook;
        Object obj3 = desktop;
        imprimir(obj1);
        imprimir(obj2);
        imprimir(obj3);
    
    }
    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }
    
}
