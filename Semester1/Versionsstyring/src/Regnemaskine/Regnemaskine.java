package Regnemaskine;

import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {

        System.out.println("Indsæt dine 2 tal");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String operation;

        System.out.println("Vælg + eller *");

        Scanner op = new Scanner(System.in);

        operation = op.next();

        if (operation == "+") ;
        {
            System.out.println("Resultat " + (a + b));


            if (operation == "*") {
                System.out.println("Resultat " + (a * b));
            }

        }

    }
}








//    Scanner input = new Scanner(System.in);
//    int a = input.nextInt();
//   float f = input.nextFloat();
//    String username = input.nextLine();
//input.close();

//        System.out.print(...);
//        System.out.println(...);
