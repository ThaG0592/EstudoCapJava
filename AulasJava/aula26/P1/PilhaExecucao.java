package aula26;
//pilha de execução é quando ele chama de um metodo para o outro e depois ele vai concluindo o processo
//Entrando na main....
//Entrando na metodo1....
//Entrando na metodo2....
//Saindo na metodo2....
//Saindo na metodo1....
//Saindo na main....

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Entrando na main....");
            metodo1();
        System.out.println("Saindo na main....");
        
    }
    public static void metodo1(){
        System.out.println("Entrando na metodo1....");
            metodo2();        
        System.out.println("Saindo na metodo1....");

    }
    public static void metodo2(){
        System.out.println("Entrando na metodo2....");
        String nome = null;
        try{
            nome.length();
            int idade = Integer.parseInt("45as");
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
            System.out.println("Deu ruim geral");
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
            System.out.println("Deu ruim String");
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
            System.out.println("Deu ruim no inteiro");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Deu ruim no tudão");
        }
             
        System.out.println("Saindo na metodo2....");
        
    }
    
}
