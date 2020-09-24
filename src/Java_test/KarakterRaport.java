package Java_test;

import java.util.Scanner;

public class KarakterRaport {
    public static void main(String[] args) {
        int karater, katagori;

        Scanner scan = new Scanner(System.in);

        System.out.print("Indtast en numerisk karakter fra 0 til 100: ");
        karater = scan.nextInt();

        katagori = karater/10;

        System.out.print("Denne karakter er ");

        switch (katagori)
        {
            case 10:
                System.out.println("en perfekt score. Godt klaret");
                break;
            case 9:
                System.out.println("langt over gennemsnittet. Flot");
                break;
            case 8:
                System.out.println("over gennemsnittet");
                break;
            case 7:
                System.out.println("gennemsnit");
                break;
            case 6:
                System.out.println("under gennemsnittet. Du bør se");
                System.out.println("Instruktøren til at se materialet, som er blevet fremvist i klassen");
                break;

            default:
                System.out.println("Ikke bestået");
        }

    }
}
