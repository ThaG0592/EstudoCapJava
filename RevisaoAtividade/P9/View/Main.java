package P9.View;

import src.ATP.P9.Domain.Categorias;
import src.ATP.P9.Repository.CategoriaRepository;

public class Main {
        public static void main(String[] args) {
    
            CategoriaRepository repo = new CategoriaRepository();
            Categorias cat1 =  new Categorias(1);
            cat1.setNome("Smartphones");
            cat1.setDescricao("Telefones nutelinhas");
    
            Categorias cat2 =  new Categorias(2);
            cat2.setNome("SmartTvs");
            cat2.setDescricao("Televisores espertos");
    
            repo.create(cat1);
            repo.create(cat2);
            listar(repo);        
    
            cat1.setDescricao("Telefones espertoes");
            repo.update(cat1);
            listar(repo);   
    
            repo.delete(cat2);
            listar(repo);  
    
        }
        private static void listar(CategoriaRepository repo){
            for (Categorias c : repo.read()) {
                System.out.println(c);
            }
        }
    }
