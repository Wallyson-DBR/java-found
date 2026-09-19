package aula1.atividades;

public class Funcionario {

    public String nome;
    public String cargo;
    public double salario;
    public String departamento;

    public Funcionario(){

    }

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String exibirFicha(){
        return "";
    }

    public void alterarCargo(String novoCargo){

    }

    public void almentarSalario(int percentual){

    }

    public double consultarSalarioAnual(){
        return 00.00;
    }

}
