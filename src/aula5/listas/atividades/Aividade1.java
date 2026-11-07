package aula5.listas.atividades;

import javax.swing.*;
import java.util.ArrayList;

public class Aividade1 {

    static void main() {

        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> parList = new ArrayList<>();
        ArrayList<Integer> imparList = new ArrayList<>();

        while (true){

            String respostaStr = JOptionPane.showInputDialog("Informe um número ou S para sair: ");

            if (respostaStr.equalsIgnoreCase("S")){
                break;
            }

            int respostaNum = Integer.parseInt(respostaStr);

            numList.add(respostaNum);

            if(respostaNum%2 == 0)
                parList.add(respostaNum);
            else
                imparList.add(respostaNum);

        }

        JOptionPane.showMessageDialog(null, "Lista de Números: \n"+
                "Todos: " + numList +"\n" +
                "Pares: " + parList +"\n" +
                "Impares: " + imparList);

    }


}
