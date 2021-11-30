package com.form.atp057;

import com.form.atp057.dao.ContaCorrenteDao;
import com.form.atp057.models.ContaCorrente;

public class AppConta {
    public static void main( String[] args )
    {
        ContaCorrenteDao dao = new ContaCorrenteDao();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");


        System.out.print(model.getNome());
    }
}
