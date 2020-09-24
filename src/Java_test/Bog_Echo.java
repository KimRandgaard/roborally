package Java_test;

import java.util.Scanner;

public class Bog_Echo {
    public static void main(String[] args) {
        String message;
        Scanner bog = new Scanner(System.in);

        System.out.println("Skriv en linje med tekst: ");

        message = bog.nextLine();

        System.out.println("Du skrev : \"" + message +"\"");

    }
}
