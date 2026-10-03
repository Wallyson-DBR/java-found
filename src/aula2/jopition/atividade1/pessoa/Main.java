package aula2.jopition.atividade1.pessoa;

import javax.swing.*;

public class Main {

    static void main() {

        String nome = JOptionPane.showInputDialog("Informe o Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a Altura (Em cm): "));

        Pessoa pessoa1 = new Pessoa(nome, idade, altura);

        JOptionPane.showMessageDialog(null, "Pessoa cadastrada \n" +
                "Nome: " + pessoa1.nome + "\n" +
                "Idade: " + pessoa1.idade  + " anos\n" +
                "Altura: " + pessoa1.altura + "cm"
        );
    }

}
