package aula5.listas.exemplos;

import java.util.ArrayList;

public class Exemplo2 {

    static void main() {

        //Listas não podem ter tipos de dados PRIMITIVOS (int, char, double, boolean etc...)

        //Lista de numeros:
        ArrayList<Integer> numerosSorteados = new ArrayList<>();

        numerosSorteados.add(60);
        numerosSorteados.add(40);
        numerosSorteados.add(3);

        System.out.println("Numeros sorteados: " + numerosSorteados);

    }

}
