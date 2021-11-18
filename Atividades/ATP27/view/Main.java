package Atividades.ATP27.view;

import Atividades.ATP27.controllers.ControllersFilmes;
import Atividades.ATP27.controllers.ControllersSeries;
import Atividades.ATP27.models.Filmes;
import Atividades.ATP27.models.Series;

public class Main {
    public static void main(String[] args) {
        ControllersFilmes filmesController = new ControllersFilmes();
        ControllersSeries seriesController = new ControllersSeries();

        Filmes f1 = new Filmes();
        f1.id = 123;
        f1.titulo = "Bastardos Inglórios";
        f1.diretor = "Quentin Tarantino";
        f1.ano = 2009;

        Series s1 = new Series();
        s1.id = 124;
        s1.titulo = "Um Drink no Inferno";
        s1.diretor = "Robert Rodrigues";
        s1.ano = 2014;
        s1.temporada = 1;
        s1.tempo = "1:30 h";

        filmesController.creat(f1);
        seriesController.creat(s1);
        System.out.println(f1);
        System.out.println(s1);

        boolean c1 =  filmesController.contem(f1);
        boolean c2 =  seriesController.contem(s1);
        System.out.println(c1);
        System.out.println(c2);

        filmesController.delete(f1);
        seriesController.delete(s1);
        boolean c3 =  filmesController.contem(f1);
        boolean c4 =  seriesController.contem(s1);
        System.out.println(c3);
        System.out.println(c4);

        filmesController.update(f1);
        f1.titulo = "Django Livre";
        f1.ano = 2012;
        System.out.println(f1);       
        
    }
    
}
