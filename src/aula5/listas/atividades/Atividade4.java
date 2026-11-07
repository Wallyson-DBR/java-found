package aula5.listas.atividades;

import javax.swing.*;
import java.util.ArrayList;

public class Atividade4 {

    static void main() {

        ArrayList<String> nomes = new ArrayList<>();

        while (true){

            String nome = JOptionPane.showInputDialog("Informe um número: ");

            if (nome != null)
                nomes.add(nome);
            else if (nomes.size() < 5)
                JOptionPane.showMessageDialog(null, "Mínimo de 5 nomes.");
            else
                break;

        }

        JOptionPane.showMessageDialog(null, "Tamanho da Lista: " + nomes.size() + "\n" + "Lista de nomes: " + nomes + "\n");
        JOptionPane.showMessageDialog(null, "Primeiro nome: " + nomes.getFirst() + "Ultimo nome: " + nomes.getLast());

        String editNome = JOptionPane.showInputDialog("Digite um Novo nome para o Segundo da Lista: ");
        nomes.set(1, editNome);

        JOptionPane.showMessageDialog(null, nomes);
        String removeNome = JOptionPane.showInputDialog("Remova um nome: ");

        if (nomes.contains(removeNome))
            nomes.remove(removeNome);
        else
            JOptionPane.showMessageDialog(null, "Não encontrado.");

        JOptionPane.showMessageDialog(null, "Lista Final: " + nomes.toString());


    }

}
