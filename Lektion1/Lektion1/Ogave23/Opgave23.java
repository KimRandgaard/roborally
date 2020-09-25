package Ogave23;

import java.util.Scanner;

public class Opgave23 {

    public static void main(String [] args) {

Scanner sc = new Scanner(System.in);


                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                double Mindste;

        if (a > b)
            Mindste = b;

        else
            Mindste = a;

        if (c < Mindste)
            Mindste = c;

        System.out.println(Mindste);
    }

    }


