package aula3.repeticao.exemplos.exemplo1;

import javax.swing.*;

public class Main {

    static void main() {

        String nome = JOptionPane.showInputDialog("Informe o nome do cofrinho: ");
        double meta = Double.parseDouble(JOptionPane.showInputDialog("Informe a meta"));

        Cofrinho cofrinho1 = new Cofrinho(0, meta, nome);

        while (cofrinho1.getSaldo() < cofrinho1.getMeta()){

            double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Inoforme o valor para depoito: "));
            cofrinho1.depositar(valorDeposito);

        }

        JOptionPane.showMessageDialog(null, "Meta atingida! \n" +
                "Saldo do cofrinho: " + cofrinho1.getSaldo());

    }
}
