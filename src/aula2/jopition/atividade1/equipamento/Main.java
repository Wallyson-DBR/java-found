package aula2.jopition.atividade1.equipamento;

import javax.swing.*;

public class Main {
    static void main() {

        String nome = JOptionPane.showInputDialog("Informe o Nome do Equipamento: ");
        int potenciaWatts = Integer.parseInt(JOptionPane.showInputDialog("Informe a Potência:"));
        int horasUso = Integer.parseInt(JOptionPane.showInputDialog("Informe a(s) Horas de Uso:"));

        Equipamento equipamento1 = new Equipamento(nome, potenciaWatts, horasUso);

        JOptionPane.showMessageDialog(null, equipamento1.exibirDados());
    }
}
