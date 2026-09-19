import java.util.Scanner;

public class Driver {

    static void main(String[] args) {

        //output
        System.out.println("Hello World!");

        //input
        //Para usar os Scanner devemos importar a classe Scanner.
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        System.out.println("Mensagem recebida: " + message);

    }

}