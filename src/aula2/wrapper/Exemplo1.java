package aula2.wrapper;

public class Exemplo1 {

    static void main() {

        //Tipos der variaveis primitivos

        int numInt = 10; //Numero inteiro
        double numDecimal = 10.2; //Numero decimal
        float numDeimail2 = 10.2f;
        char caracter = 'w';
        boolean boleano = true;

        //Tipo String
        String texto = "Olá mundo!";
        String texto2 = "olá mundo!";
        String texto3 = texto.toLowerCase();

        System.out.println(texto.length());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.charAt(2));
        System.out.println(texto.contains("mundo"));
        System.out.println(texto.equals(texto2));
        System.out.println(texto3.equals(texto2));
        System.out.println(texto3 == texto2);
        texto2 = texto3;
        System.out.println(texto3 == texto2);
    }





}
