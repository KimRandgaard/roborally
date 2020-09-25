package Java;
import java.util.*;

public class Guessing {
    public static void main(String[] args) {
        final int MAX = 10;
        int answer, guess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        answer = generator.nextInt(MAX) +1;

        System.out.print("Jeg tænker på et tal mellem 1 og " + MAX + ". Gæt hvad det er: ");

        guess = scan.nextInt();

        if (guess == answer)
            System.out.println("Du gættede rigtigt!");
        else {
            System.out.println("Bedre held næste gang");
            System.out.println("Svaret var: " + answer);
        }
    }
}
