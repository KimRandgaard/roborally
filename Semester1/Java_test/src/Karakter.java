import java.util.Scanner;

public class Karakter {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String out;

        System.out.println("indtast karakter: ");

        int karakter = keyb.nextInt();

        switch (karakter) {
            case 12: out = "Den fremragende præstation";
                break;
            case 10: out = "Den fortrinlige præstation";
                break;
            case 7: out = "Den gode præstation";
                break;
            case 4: out = "Den jævne præstation";
                break;
            case 2: out = "Den tilstrækkelige præstation";
                break;
            case 0: out = "Den utilstrækkelige præstation";
                break;
            case -3: out = "Den ringe præstation";
                break;
            // udføres hvis ingen værdier matcher
            default: out = "Kender ikke denne karakter";
        }

        // udskriv resultat
        System.out.println(out);

        // luk scanner
        keyb.close();
    }

}
