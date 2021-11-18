package Atividades.ATP20;

public class Universidade {
    public static void main(String[] args) {
    Funcionario fun = new Funcionario();
    
    fun.setMatrícula(12345);
    fun.setNome("João");
    fun.setSobrenome("José");
    fun.setDepartamento("Secretaria");
    fun.setSalário(12000.00);

    System.out.println("=============== Dados Funcionario ===============");
    System.out.printf("Matricula: %d \n" , fun.getMatrícula());
    System.out.printf("Nome: %s %s \n", fun.getNome(), fun.getSobrenome());
    System.out.printf("Departamento: %s \n", fun.getDepartamento());
    System.out.printf("Salario: R$ %.2f \n", fun.getSalário());
    System.out.println("=================================================");

    Coordenador cod = new Coordenador();

    cod.setMatrícula(12346);
    cod.setNome("Maria");
    cod.setSobrenome("Joana");
    cod.setDepartamento("Educação Inicial");
    cod.setCursoCoordenado("Matemtica");
    cod.setBonus(200.00);
    cod.setSalário(5000.00);

    System.out.println("=============== Dados Coordenador ===============");
    System.out.printf("Matricula: %d \n" , cod.getMatrícula());
    System.out.printf("Nome: %s %s \n", cod.getNome(), cod.getSobrenome());
    System.out.printf("Departamento: %s \n", cod.getDepartamento());
    System.out.printf("Curso Coordenado: %s \n", cod.getCursoCoordenado());
    System.out.printf("Bonus: R$ %.2f \n", cod.getBonus());
    System.out.printf("Salario: R$ %.2f \n", cod.getSalário());
    System.out.println("=================================================");

    Aluno alu = new Aluno();

    alu.setMatrícula(12347);
    alu.setNome("Zezinho");
    alu.setSobrenome("Silva");
    alu.setCurso("Matematica");
    alu.setTurma("2B");

    System.out.println("================== Dados Aluno ==================");
    System.out.printf("Matricula: %d \n" , alu.getMatrícula());
    System.out.printf("Nome: %s %s \n", alu.getNome(), alu.getSobrenome());
    System.out.printf("Curso: %s \n", alu.getCurso());
    System.out.printf("Turma: %s \n", alu.getTurma());
    System.out.println("=================================================");

    }
}
