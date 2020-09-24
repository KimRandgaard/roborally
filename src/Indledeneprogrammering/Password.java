package Indledeneprogrammering;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            String password = scan.nextLine();

            if (password.length() < 5) {
                System.out.println("Password for kort");
            } else if (password.length() > 8) {
                System.out.println("Password for langt");
            } else {
                System.out.println("Password tilpas");
                break;
            }
        }

    }
}