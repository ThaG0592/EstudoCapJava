package Atividades.Atividade13.ATP19.PessoaFisica;

public class CadastroDePessoas {
    public static void main(String[] args) {
        Pessoafisica[] ps = new Pessoafisica[5];

        Pessoafisica ps1 = new Pessoafisica();
        ps1.setNome("Ana");
        ps1.setSobrenome("Silva");
        ps1.setIdade(30);
       
        Pessoafisica ps2 = new Pessoafisica();
        ps2.setNome("Joaquina");
        ps2.setSobrenome("Barbosa");
        ps2.setIdade(48);
        
        Pessoafisica ps3 = new Pessoafisica();
        ps3.setNome("Pedro");
        ps3.setSobrenome("Chaves");
        ps3.setIdade(12);
        
        Pessoafisica ps4 = new Pessoafisica();
        ps4.setNome("Raquel");
        ps4.setSobrenome("Araujo");
        ps4.setIdade(19);

        Pessoafisica ps5 = new Pessoafisica();
        ps5.setNome("Sueli");
        ps5.setSobrenome("Gomes");
        ps5.setIdade(14);

        ps[0] = ps1;
        ps[1] = ps2;
        ps[2] = ps3;
        ps[3] = ps4;
        ps[4] = ps5;

        
        for (Pessoafisica pf : ps){
            System.out.printf("%s - %s - %d \n", pf.getNome(), pf.getSobrenome(), pf.getIdade());
        }


    }
    
}
