public class Lommeregner {

    public static void main(String[] args) {

        System.out.println("Sæt to tal ind");
        java.util.Scanner lommeregner = new java.util.Scanner(System.in);

        int a = lommeregner.nextInt();

        int b = lommeregner.nextInt();

        System.out.println("1 = Plus, 2 = Gange, 3 = Minus, 4 = Divider");

        int valg;

        valg = lommeregner.nextInt();

        switch (valg) {
            case 1:
                System.out.println("Resultat");
                System.out.println(a + b);
                break;


            case 2:
                System.out.println("Resultat");
                System.out.println(a * b);
                break;


            case 3:
                System.out.println("Resultat");
                System.out.println(a - b);
                break;

            case 4:
                System.out.println("Resultat");
                System.out.println(a / b);
                break;

        }

    }

}
