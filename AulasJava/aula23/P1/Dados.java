package aula23.P1;

public class Dados {
    int posicaoAtual = 0;
    int tamanhoAtual = 4;
    Object [] dados;
    
    public Dados(){
        this.dados = new Object[tamanhoAtual];
    }

    public int size(){
        return posicaoAtual +1;
    }

    public String add(Object obj){
        String mensagem;
        if(posicaoAtual < dados.length){

        dados[posicaoAtual] = obj;
        posicaoAtual ++;
        
        }else{
            tamanhoAtual = tamanhoAtual * 2;
            Object [] dados2 = new Object[tamanhoAtual];
           
            for(int i = 0; i <dados.length; i++){
                dados2[i] = dados[i];
            }
        }
        mensagem = "Salvo com sucesso";
        return mensagem;
    }

    public boolean contains(Object obj){
        for(int i = 0; i <posicaoAtual; i++){
            if (dados[i].equals(obj)){
                return true;
            }
        }
        return false;
    }

    public String remove(Object obj){
        for(int i = 0; i <dados.length; i++){
            if(dados[i].equals(obj)){
               reorganiza(i);
                posicaoAtual --;
                return "Removido com sucesso" ;
            }
        }return "Não encontrado";
    }
    public void reorganiza(int posicao){
        for(int i = 0; i <dados.length-1; i++){
            this.dados[i] = this.dados[i+1];
        } 
    }
}

