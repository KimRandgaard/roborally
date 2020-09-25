package Java;

import java.text.NumberFormat;
import java.util.Scanner;

public class Løn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double RATE = 135.0; //Den almindelige løn
        final int STANDART = 40; //Standart timer på en uge

        double overbetaling = 0.0;

        System.out.print("Indtast den mængde timer du har arbejdet: ");
        int timer = scan.nextInt();

        System.out.println();

        //Over arbejde en halv gange igen

        if (timer > STANDART)
            overbetaling = STANDART * RATE +  (timer - STANDART) * (RATE * 1.5);

        else
            overbetaling = timer * RATE;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Indtægt: " + fmt.format(overbetaling));
    }
}
