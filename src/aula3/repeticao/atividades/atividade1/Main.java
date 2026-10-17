package aula3.repeticao.atividades.atividade1;

import javax.swing.*;

public class Main {

    static void main() {

        int destino = Integer.parseInt(JOptionPane.showInputDialog("Informe o destino:"));
        Robo robo1 = new Robo();
        Object[] botaoAvancar = { "Avançar" };

        while (robo1.posicao < destino) {

            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "O robô está em movimento. Deseja avançar?",
                    "Controle do Robô",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botaoAvancar,
                    botaoAvancar[0]
            );
            robo1.avancar();
            JOptionPane.showMessageDialog(null, "Possição atual: " + robo1.getPosicao());

            if (escolha != 0) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

        }

        if (robo1.posicao == destino) {
            JOptionPane.showMessageDialog(null, "O robô chegou ao destino!");
        }
    }

}
