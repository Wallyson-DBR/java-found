package aula2.jopition.exemplo1;

import javax.swing.*;

public class Main {

    static void main() {

        //Cadastrar um poduto
        //nome; preco; codigo; quantidade

        String nome = JOptionPane.showInputDialog("Informe o nomo do produto: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));

        Produto produto1 = new Produto(nome, preco, codigo, quantidade);

        JOptionPane.showMessageDialog(null, "Produto cadastrado \n" +
                "Nome: " + produto1.nome + "\n" +
                "Preço unitário: " + produto1.preco + "\n" +
                "Quantidade: " + produto1.quanidade + "\n" +
                "Código: " + produto1.codigo + "\n\n" +
                "Valor de Estoque: " + produto1.calcularValorEstoque() + "\n"
                );
    }
}
