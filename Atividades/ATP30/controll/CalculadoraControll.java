package Atividades.Atividade22.ATP30.controll;

import Atividades.Atividade22.ATP30.model.Calculadora;

public class CalculadoraControll extends Calculadora{
        
    public static void validacao(){
        
    try{
        n1 = Integer.valueOf(Calculadora.n1);
    }catch(ArithmeticException ex){
        System.out.println("Informar um numero inteiro");
    }
    try{
        n2 = Integer.valueOf(Calculadora.n2);
    }catch(ArithmeticException ex){
        System.out.println("Informar um numero inteiro");
    }
    
    }
    
}
