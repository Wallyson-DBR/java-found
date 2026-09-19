import javax.swing.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        /*
        //output
        System.out.println("Hello World!");

        //input
        //Para usar o Scanner devemos importar a classe Scanner.
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        System.out.println("Mensagem recebida: " + message);
        */

        //JOption

        //output
        JOptionPane.showMessageDialog(null, "Olá mundo... Abrindo uma janela");

        //input
        String message = JOptionPane.showInputDialog(null, "Escreva algo:");
        JOptionPane.showMessageDialog(null, message);


    }

}