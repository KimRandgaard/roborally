import java.util.Scanner;

public class Afstand_Linje_Punkt {

    public static void main(String[] args) {
        //Math.abs();
        //Math.sqrt();
        //Math.pow();

        double a;
        double b;
        double x0;
        double y0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();

        b = sc.nextDouble();

        x0 = sc.nextDouble();

        y0 = sc.nextDouble();


        double distance = (double) Math.abs((a*x0-y0+b)/Math.sqrt(1+Math.pow(a,2)));
        System.out.print("Distancen fra linjen til punktet er: " +distance);
    }
}
