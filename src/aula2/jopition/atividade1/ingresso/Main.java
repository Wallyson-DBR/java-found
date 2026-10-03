package aula2.jopition.atividade1.ingresso;

import javax.swing.*;

public class Main {
    static void main() {

        String evento = JOptionPane.showInputDialog("Informe o Nome do Evento: ");
        double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Ingresso: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de Ingressos:"));

        Ingresso ingresso1 = new Ingresso(evento, valorUnitario, quantidade);

        JOptionPane.showMessageDialog(null, "Ingresso Comprado \n\n" +
                "Nome do Evento: " +  ingresso1.evento + "\n" +
                "Valor Unitário: " + ingresso1.valorUnitario  + "\n" +
                "Quantidade: " + ingresso1.quantidade + "\n\n" +

                "Valor Total: " + ingresso1.calcularValorTotal()
        );
    }
}
