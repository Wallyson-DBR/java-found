package aula5.listas.atividades;

import javax.swing.*;
import java.util.ArrayList;

public class Atividade2 {

    static void main() {


        ArrayList<String> nameList = new ArrayList<>();

        while (true) {

            String resposta = JOptionPane.showInputDialog("Informe um número ou S para sair: ");

            if (resposta.equalsIgnoreCase("S")) {
                break;
            }

            if (nameList.contains(resposta)){
                JOptionPane.showMessageDialog(null, "Nome já cadastrado.");
            }
            else {
                nameList.add(resposta);
            }

        }

        JOptionPane.showMessageDialog(null, "Lista Final: \n" + nameList);

    }
}