package Atividades.ATP04;

  import java.util.Scanner;

    public class Atividade4 {
        public static void main(String[] args) {    //psvm
            //Tipos
            int inteiro=10;
            byte byt=1;
            short sh=12;
            long grande=123;
            float comPonto=12.0f;
            double comPonto1=12.90;

            //leitura
            Scanner sc=new Scanner(System.in);
            String nome = sc.next();
            String nomeComlleto = sc.nextLine();

            //imprimir
            System.out.println("SOUT - Com ln pula linha");
            System.out.printf("SoutF - Com f usa formatação");

            //EXTRAS
            boolean verdadeira=true; //false
            int intdouble=(int)1.9000;  //não funciona para booleano

            //condição
            if(true){

            }else{}

            //switch and case
            switch (2){
                case 1:
                    break;
                default:
                    break;
            }

        }
        //Function - privado ou public, static, Tipo de retorno(void, int), nome
        private static int soma(int n1,int n2){
            return n1+n2;
        }

    }

