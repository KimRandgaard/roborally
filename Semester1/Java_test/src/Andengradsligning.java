import java.util.Scanner;

public class Andengradsligning {

    public static void main(String[] args) {
        int a, b, c; //ax^2 + bx +c
        double discriminant, x1, x2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Indtast en x-vædri som skal opløftes i anden: ");
        a = scan.nextInt();

        System.out.print("Indtast en x-værdi: ");
        b = scan.nextInt();

        System.out.print("Indtast en konstant : ");
        c = scan.nextInt();

        // Use the quadratic formula to compute the roots.

        discriminant = Math.pow(b, 2) - (4 * a * c);
        x1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        x2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Rod 1#: " + x1);
        System.out.println("Rod 2#: " + x2);
    }
}
