package Java_test;

import java.util.Scanner;

//Beregner benzin effektivitet efter hvad man taster ind.


public class Gas_bogside116 {
    public static void main(String[] args) {
        int kilomter;
        double benzin, Kilometerpåliteren;

        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast kilometer tallet: ");
        kilomter = scan.nextInt();

        System.out.println("indtast mængden at benzin brugt: ");
        benzin = scan.nextDouble();

        Kilometerpåliteren = kilomter/benzin;

        System.out.println("Kilometer per liter: " + Kilometerpåliteren);
    }
}
