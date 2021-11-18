package Atividades.ATP27.controllers;

import java.util.ArrayList;

public class ControllerBase <T>{
    private ArrayList<T> dados;
    
    public ControllerBase(){
        this.dados = new ArrayList<T>();
    }

    public void creat (T obj){
        this.dados.add(obj);
    }

    public ArrayList<T> read(){
        return this.dados;
    }
    public void update(T obj){
        if(contem(obj)){
            this.delete(obj);
            this.creat(obj);
        }
    }
    public void delete(T obj){
        this.dados.remove(obj);
    }

    public boolean contem(T obj){
        return this.dados.contains(obj);
    }
    
}
