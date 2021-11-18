package Atividades.ATP20;

public class Funcionario extends Pessoa {
    private double salário; 
    private String departamento;

    public void setSalário(double salário) {
        this.salário = salário;
    }
    public double getSalário() {
        return salário;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
}
