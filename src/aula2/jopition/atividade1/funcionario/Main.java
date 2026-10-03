package aula2.jopition.atividade1.funcionario;

import javax.swing.*;

public class Main {

    static void main() {

        String nome = JOptionPane.showInputDialog("Informe o Nome do Funcionário: ");
        String cargo = JOptionPane.showInputDialog("Informe o Cargo do Funcionário: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salário do Funcionário: "));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Informe o Percentual do Reajuste: "));

        Funcionario funcionario1 = new Funcionario(nome, cargo, salario);

        JOptionPane.showMessageDialog(null, "Salário Reajustado \n\n" +
                "Nome: " + funcionario1.nome + "\n" +
                "Cargo: " + funcionario1.cargo  + "\n" +
                "Salário: " + funcionario1.salario + "\n\n" +

                "Salario Reajustado: " + funcionario1.aplicarReajuste(percentual)
        );

    }

}
