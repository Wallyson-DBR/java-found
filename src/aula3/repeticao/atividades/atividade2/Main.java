package aula3.repeticao.atividades.atividade2;

import javax.swing.*;

public class Main {

    static void main() {
        Oficina oficina1 = new Oficina(0);

        for (int i = 0; i < 5; i++) {
            int quantidadePecas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de peças registradas: "));
            oficina1.registrarPecas(quantidadePecas);

            JOptionPane.showMessageDialog(null,
                    "Dia: " + (i + 1) + "\n" +
                            "Peças registradas hoje: " + quantidadePecas + "\n" +
                            "Total de peças acumuladas: " + oficina1.getTotalPecas()
            );
        }

        JOptionPane.showMessageDialog(null,"Total de peças da semana: " + oficina1.getTotalPecas());

    }
}
