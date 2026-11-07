package aula5.listas.exemplos;

import java.util.ArrayList;

public class Exemplo1 {

    static void main() {

        //ARRAY
        String[] alunos = {"Nicolas", "Otavio", "Beatriz"};

        //Arraylists
        ArrayList<String> listaAlunos = new ArrayList<>();


        //Adicionar item ao final da lista
        listaAlunos.add("Wallyson");
        listaAlunos.add("Eduarda");
        listaAlunos.add("Debora");
        listaAlunos.add("Otavio");

        System.out.println(listaAlunos);

        //Adicionar item em uma posição da lista
        listaAlunos.add(2,"Matheus");

        System.out.println(listaAlunos);

        //Acessar item especifico da lista
        System.out.println("Primeiro item da lista: " + listaAlunos.get(0));
        System.out.println("Primeiro item da lista: " + listaAlunos.getFirst());
        System.out.println("Último item da lista: " + listaAlunos.getLast());

        //Verificar onde está um item da lista
        System.out.println("Onde está a Débora: " + listaAlunos.indexOf("Debora"));
        System.out.println("Onde está o Daniel: " + listaAlunos.indexOf("Daniel"));

        //Remover itens da lista
        listaAlunos.remove(2);
        System.out.println("Lista sem o indice 2: " + listaAlunos);
        listaAlunos.remove("Otavio");
        System.out.println("Lista sem o Otávio: " + listaAlunos);

        listaAlunos.add(0, "Daniel");
        System.out.println("Lista com novo integrante: " + listaAlunos);

        //Remover item da lista baseado em uma condição
        listaAlunos.removeIf(item -> item.charAt(0) == 'D');
        System.out.println("Lista sem pessoas com D: " + listaAlunos);

        //Alterar um item da lista
        listaAlunos.set(0, "Beatriz");
        System.out.println("Substituindo item da lista: " + listaAlunos);

        listaAlunos.set(listaAlunos.indexOf("Eduarda"),"Nicolas");
        System.out.println("Subtituindo Eduarda por Nicolas: " + listaAlunos);

    }

}
