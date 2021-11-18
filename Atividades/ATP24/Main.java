package Atividades.ATP24;

public class Main {
    public static void main(String[] args) {

       Veiculo veiculo = new Veiculo();
       veiculo.marca = "Toyota";
       veiculo.modelo = "SW4";
       veiculo.placa = "SPG0345";

       Carro carro = new Carro();
       carro.marca = "Mitsubish";
       carro.modelo = "Outlander";
       carro.placa = "DRP0678";
       carro.portas = 4;
       carro.portaMalas = 128;

       Object obj1 = veiculo;
       Object obj2 = carro;

        //impressão da classe veiculo sem alteração
       System.out.println(veiculo);
       //impressão da classe carro sem alteração
       System.out.println(carro);

       //impressão da Object veiculo
       imprimir(obj1);
       //impressão da Object carro
       imprimir(obj2);

       //conversão e impreção de veiculo para carro.
       Veiculo veiculo2 = carro;
       imprimir(veiculo2);
       //conversão e impreção de object para carro.
       Object obj3 = carro;
       imprimir(obj3);   
            
    }
    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }
    
}
