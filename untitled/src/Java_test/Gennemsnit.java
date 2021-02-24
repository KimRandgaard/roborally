package Java_test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gennemsnit {
    public static void main(String[] args) {

        int sum = 0, værdi, count = 0;
        double gennemsnit;

        Scanner scan = new Scanner(System.in);

        System.out.print("Indtast et tal (og 0 for at afslutte): ");
        værdi = scan.nextInt();

        while (værdi != 0)
        {
            count++;

            sum += værdi;
            System.out.println("Summen en indtil videre: " + sum);

            System.out.print("Indtast et tal (og 0 for at afslutte): ");
            værdi = scan.nextInt();
        }

        System.out.println();

        if (count == 0)
            System.out.println("Ingen værdi var indtastet");
        else
        {
            gennemsnit = (double)sum/count;

            DecimalFormat fmt = new DecimalFormat("0.###");
            System.out.println("Gennemsnittet er: " + fmt.format(gennemsnit));
        }
    }
}
