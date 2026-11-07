package aula5.listas.atividades.atividade8;

import java.util.ArrayList;

public class Main {

    static void main() {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("PS5", 4999));
        produtos.add(new Produto("Polo GTI", 80000));
        produtos.add(new Produto("Pão", 1.2));

        produtos.get(1).aplicarDesconto(18);

        double soma = 0;

        for(Produto produto: produtos){
            System.out.println(produto.toString());
            soma = soma + produto.getPreco();
        }

        System.out.printf("As somas dos valores é: " + soma);

    }

}
