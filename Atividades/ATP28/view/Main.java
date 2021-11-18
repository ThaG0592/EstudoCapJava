package Atividades.ATP28.view;

import Atividades.ATP28.controller.PessoaFisicaController;
import Atividades.ATP28.controller.PessoaJuridicaController;
import Atividades.ATP28.models.PessoaFisica;
import Atividades.ATP28.models.PessoaJuridica;


public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pf = new PessoaFisicaController();
        PessoaFisica pf1 = new PessoaFisica();
        pf1.id = 165;
        pf1.nomeCompleto = "Jojo Moies";
        pf1.cpf = "234.543.789-87";
        pf1.enderecoFisica.lugadouro = "Rua dos Bobos";
        pf1.enderecoFisica.numero = "12A";
        pf1.enderecoFisica.complemento = "10 Andar";
        pf1.enderecoFisica.bairro = "Sem nome";
        pf1.enderecoFisica.cidade = "Só Deus sabe";
        pf1.enderecoFisica.estado = "SP";
        pf1.enderecoFisica.cep = "08234-456";

        PessoaJuridicaController pj = new PessoaJuridicaController();
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.id = 234;
        pj1.nomeFantasia = "Só o que faltava";
        pj1.razaoSocial = "Falta mais um pouco";
        pj1.cnpj = "21.345.456/0001-18";
        pj1.enderecoPessoaJuridica.lugadouro = "Rua dos Bons Bobos";
        pj1.enderecoPessoaJuridica.numero = "0";
        pj1.enderecoPessoaJuridica.complemento = "1 Andar";
        pj1.enderecoPessoaJuridica.bairro = "Sem chão";
        pj1.enderecoPessoaJuridica.cidade = "Sem teto";
        pj1.enderecoPessoaJuridica.estado = "SP";
        pj1.enderecoPessoaJuridica.cep = "08134-476";

        System.out.println(pf1);
        System.out.println(pj1);

        pf.create(pf1);
        pj.create(pj1);

        pf.existe(pf1)
        pf.existe(pf1)

        pf.delete(pf1);

        pj.update(pf1);
        pf1.enderecoFisica.bairro = "Com chão"


    }
    
}
