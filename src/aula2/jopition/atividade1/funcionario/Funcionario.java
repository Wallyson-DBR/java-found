package aula2.jopition.atividade1.funcionario;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    public Funcionario() {}

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double aplicarReajuste(double percentual) {

        this.salario += this.salario * (percentual / 100);
        return this.salario;
    }
}
