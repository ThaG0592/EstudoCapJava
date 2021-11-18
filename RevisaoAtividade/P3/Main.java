package P3;

public class Main {
    public static void main(String[] args) {
        Usuario us = new Usuario();
        us.setCodigo(345);
        us.setNomeCompleto("Joana d'Arc");
        us.setEmail("joanaalouca@ghym.com");
        us.setSenha("576895");

        System.out.printf("\nCodigo:          %d", us.getCodigo());
        System.out.printf("\nNome Completo:   %s", us.getNomeCompleto());
        System.out.printf("\nE-mail:          %s", us.getEmail());
        System.out.printf("\nSenha:           privada");
    }
}
