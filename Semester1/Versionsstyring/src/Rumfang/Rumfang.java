package Rumfang;

import java.util.Scanner;
import java.lang.Math;

public class Rumfang {

    public static void main(String[] args) {

//        Math.abs();
//        Math.sqrt();
//        Math.pow();

        double r = 0, h = 0;
        final double PI = 3.14;

        Scanner V = new Scanner(System.in);
        do {
            System.out.println("Indtast radius værdien: ");
            r = V.nextDouble();

            System.out.println("Indtast højden af din cylinder: ");
            h = V.nextDouble();

        } while (r < 0 || h < 0);
        double rumfang = Rumfangudregner(r,h);

        System.out.print("Rumfanget af cylinderen er: " + rumfang);
    }


    static double Rumfangudregner (double r,double h){

        return Math.PI * Math.pow(r, 2) * h;
    }
}
