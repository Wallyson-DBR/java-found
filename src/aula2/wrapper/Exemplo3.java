package aula2.wrapper;

import javax.swing.*;

public class Exemplo3 {

    static void main() {

        String nome = JOptionPane.showInputDialog("Informe o nome: ");
        JOptionPane.showMessageDialog(null, nome.toUpperCase());

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        JOptionPane.showMessageDialog(null, idade);

        String messagem;

        if (idade >= 18){
            messagem = "É maior de idade";
        }
        else {
            messagem = "É menor de idade";
        }

        JOptionPane.showMessageDialog(null, messagem);

    }




}
