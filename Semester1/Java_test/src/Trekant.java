import java.util.Scanner;

public class Trekant {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast sidelængden a: ");
        a = sc.nextInt();
        System.out.println("Indtast sidelængden b: ");
        b = sc.nextInt();
        System.out.println("Indtast sidelængden c: ");
        c = sc.nextInt();
        sc.close();


        if (a<=0 || b<=0 || c<=0){
            System.out.println("Noget er galt!");
        }
        else if (a == b && b == c){
            System.out.println("Din trekant er ligesiddet");
        }

        else if (a == b || b == c || a == c){
            System.out.println("Trekanten er ligebenet");
        }

        else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a)){
            System.out.println("Din trekant er retvinklet");
        }


      //  else if (){
      //      System.out.println("Trekanten er spids");
        }

     //   else if (){
        //    System.out.println("Trekanten er stump");
        }

//    }

//}
