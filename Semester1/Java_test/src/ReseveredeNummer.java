import java.util.Scanner;

public class ReseveredeNummer {

    public static void main(String[] args) {
        int nummer, sidsteTal, omvendt = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Indtast et positivt tal: ");
        nummer = scan.nextInt();

        do{
            sidsteTal = nummer % 10;
            omvendt = (omvendt * 10) + sidsteTal;
            nummer = nummer/10;
        }
        while (nummer > 0);

        System.out.println("Dette nummer omvendt er " + omvendt);
    }

}


