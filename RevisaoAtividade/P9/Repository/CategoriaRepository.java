package P9.Repository;

import java.util.ArrayList;


import src.ATP.P9.Domain.Categorias;

public class CategoriaRepository {
    private ArrayList<Categorias> categorias;

    public CategoriaRepository(){
        this.categorias = new ArrayList<Categorias>();
    }

    //CRUD
    // create - salvar
    public void create(Categorias categoria){
        this.categorias.add(categoria);
    }

    // read - ler
    public ArrayList<Categorias> read(){
        return this.categorias;
    }
    // update - alterar
    public void update(Categorias categoria){
        int tamanho = this.categorias.size();

        for (int i=0; i < tamanho; i++) {
            Categorias c = this.categorias.get(i);
            if(c.getId() == categoria.getId()){
                this.delete(c);
                this.create(categoria);
            }
        }
    }
     // update - alterar
    public void update2(Categorias categoria){
        
        if(this.categorias.contains(categoria))
        {
            this.delete(categoria);
            this.create(categoria);
        }
    }

    // delete - excluir
    public void delete(Categorias categoria){
        this.categorias.remove(categoria);
    }
}