package aula2.decisao.exemplo;

import javax.swing.*;

public class Main {
    static void main() {

        String nome = JOptionPane.showInputDialog("Informe o Nome do Aluno: ");
        double media = Double.parseDouble(JOptionPane.showInputDialog("Informe a Média do Aluno: "));

        Aluno aluno1 = new Aluno(nome,media);
        String situacao = aluno1.verificarSituacao();

        JOptionPane.showMessageDialog(null, "Dados do Aluno \n\n" +
                "Nome do Aluno: " +  aluno1.nome + "\n" +
                "Média do Aluno: " + aluno1.media  + "\n\n" +

                "Situação: " + situacao
        );
    }
}
