package Atividades.ATP26;


public class Dados {
    private Object [] dados;
    int posicao = 0;
    int tamanho = 5;


    public Dados(){
        this.dados = new Object[tamanho];
    }

    public int size(){
        return posicao + posicao;
    }

    public String add(Object obj){
        String mensagem;

        if(posicao<dados.length){
            dados[posicao] = obj;
            posicao++;
        }else{
            tamanho = tamanho + 5;
            Object [] dados1 = new Object[tamanho];
            for(int i = 0; i <dados.length; i++){
                dados1[i] = dados[i];
            }
        }
        mensagem = "Salvo";
        return mensagem;
    }
    public boolean contains(Object obj){
        for(int i = 0; i < posicao; i++){
            if(dados[i].equals(obj)){
                return true;
            }
        }
        return false;
    }
    public String remove(Object obj){
        for(int i = 0; i <dados.length; i++){
            if(dados[i].equals(obj)){
                reorganiza(i);
                posicao --;
                return "Removido";
            }
        }return "Não encontrado";
    }

    private void reorganiza(int posicao1) {
        for(int i = 0; i <dados.length -1; i++){
            this.dados[i] = this.dados[i+1];
        }
    }
}
