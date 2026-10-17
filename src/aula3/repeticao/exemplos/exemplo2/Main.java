package aula3.repeticao.exemplos.exemplo2;

import javax.swing.*;

public class Main {

    static void main() {
        String nome = JOptionPane.showInputDialog("Nome do corredor: ");
        int numVolas = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de voltas?"));

        Corredor corredor1 = new Corredor(nome, 0, 0);

        for (int i=0; i<numVolas ; i++){
            corredor1.completarVoltas();
            double tempoVolta = Double.parseDouble(JOptionPane.showInputDialog("Tempo de volta"));
            corredor1.atualizarTempo(tempoVolta);
            JOptionPane.showMessageDialog(null, corredor1.getVoltas() + " volta(s) completa(s)\n"
                    + "Tempo da volta: " + tempoVolta + " segundos \n"
                    + "Tempo total: " + corredor1.getTempo());
        }
    }

}
