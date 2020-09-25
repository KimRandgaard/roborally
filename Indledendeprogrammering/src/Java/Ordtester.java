package Java;

 import java.util.Scanner;

public class Ordtester {
    public static void main(String[] args)
    {
        String str, another = "y";
        int left, right;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) //Tillader store og små bogstaver
        {
            System.out.println("Indtast en potentiel palindrom: ");
            str = scan.nextLine();

            left = 0;
            right = str.length()-1;

            while (str.charAt(left) == str.charAt(right) && left < right)
            {
                left++;
                right--;
            }
            System.out.println();

            if (left < right)
                System.out.println("Dette er IKKE et palindrom.");
            else
                System.out.println("Dette er et palindrom");

            System.out.println();
            System.out.print("Test noget nyt (y/n)? ");
            another = scan.nextLine();
        }

    }
}
