package Lektion2;

import java.util.Scanner;

public class MindsteTal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if (a>b) {
            if (b>c){
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else {
            if (a>c){
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        }
        scan.close();
    }
}
