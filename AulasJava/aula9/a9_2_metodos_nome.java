package aula9;

public class a9_2_metodos_nome {
    public static void main(String[] args){
    //Chamando o metodo imprime_nome e passando dois argumentos
    imprimir_nome("Thais", "Gaiardo");
    String nc = retorna_nome_completo("Thais", "Gaiardo");
    }
    //Metodo imprime_nome - que recebe dois parametros String e tem retorno void
    static void imprimir_nome(String nome, String sobrenome){

        System.out.printf("%s %s", nome, sobrenome);

    }
    static String retorna_nome_completo(String nome, String sobrenome){
        String nome_completo = nome + " "+ sobrenome;
        return nome_completo;
    }
}
