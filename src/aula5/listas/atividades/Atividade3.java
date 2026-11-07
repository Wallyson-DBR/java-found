package aula5.listas.atividades;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Atividade3 {

    static void main() {

        ArrayList<String> frutas = new ArrayList<>(List.of("Banana", "Maça", "Kiwi", "Melancia"));

        frutas.add("Abacaxi");

        try{
            int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe um indice da lista para alterar: \n" + frutas));
            if(indice > 0 && indice<frutas.size()-1){
                String novaFruta = JOptionPane.showInputDialog("Informe uma nova fruta");
                frutas.set(indice, novaFruta);
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O índice deve ser um numero INTEIRO entre 0 e " + (frutas.size()-1));
        }


        JOptionPane.showMessageDialog(null, "Lista atualizada: \n" + frutas);

    }


}
