import java.util.Scanner;

public class Ugedag {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String out;

        System.out.println("indtast ugedag: ");

        String ugeDag = keyb.next();

        // konverter til små bogstaver
        ugeDag = ugeDag.toLowerCase();

        switch (ugeDag) {
            case "mandag":
            case "tirsdag":
            case "onsdag":
            case "torsdag":
            case "fredag":
                out = "Det er arbejdsdag";
                break;
            case "lørdag":
            case "søndag":
                out = "Det er weekend";
                break;
            default: out = "Kender ikke denne dag";
        }

        // udskriv resultat
        System.out.println(out);

        // luk scanner
        keyb.close();
    }

}
