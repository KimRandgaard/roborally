import java.text.NumberFormat;
import java.util.Scanner;

public class Vind_procent {

    public static void main(String[] args) {
        {
            final int NUM_KAMPE = 12;
            int vundet;
            double ratio;

            Scanner scan = new Scanner(System.in);

            System.out.print("Indtast mængden af vundet kampe (0 til " + NUM_KAMPE + "): ");
            vundet = scan.nextInt();

            while (vundet < 0 || vundet > NUM_KAMPE) {
                System.out.print("Invalid nummer. Nyt nummer tak:");
                vundet = scan.nextInt();
            }

            ratio = (double) vundet / NUM_KAMPE;

            NumberFormat fmt = NumberFormat.getPercentInstance();

            System.out.println();
            System.out.println("Vindingsprocent" + fmt.format(ratio));
        }
    }
}
