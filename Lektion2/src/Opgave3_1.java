import java.util.Scanner;

public class Opgave3_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
      //  System.out.print("Indtast a: ");

        float a = sc.nextFloat();

     //   System.out.print("Indtast b: ");

        float b = sc.nextFloat();

     //   System.out.print("Indtast x: ");

        float x = sc.nextFloat();

     //   System.out.print("Indtast y: ");

        float y = sc.nextFloat();

        double distance = Math.abs(a*x-y+b)/Math.sqrt(1+Math.pow(a,2));

        System.out.print(distance);
    }
}



     //   Lav et program, som (1) læser ligningen for en ret linje (a og b) ind samt koordinaterne for et punkt og (2) beregner og udskriver afstanden mellem linjen og punktet.
       // Linjen angives på den gængse form l: y = a ∙x + b, punktet som P: (x0 , y0) hvorefter
        // afstanden mellem linjen og punktet er givet ved følgende formel:
        // Alle de nødvendige matematiske funktioner findes i Math klassen. Hint:​ Brug Scanner-klassen til at indlæse værdierne. /



           //  Math.abs(-1);
      //  Math.sqrt();
      //  Math.pow();

