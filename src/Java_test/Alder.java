package Java_test;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Alder {

    public static void main(String[] args) {

        final int ÅR = 21;

        Scanner scan = new Scanner(System.in);

        System.out.print("Indtast din alder: ");
        int alder = scan.nextInt();

        System.out.println("Du indtastede: " + alder + " år");

        if (alder < ÅR)
            System.out.println("Du er stadig ung");

        else
        System.out.println("Alder er bare et tal!");

    }
}