import java.util.Scanner;

public class Opgave3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();


        if (password.length()<5){
            System.out.println("Password for kort");

        }

        else if (password.length()>8){
            System.out.println("Password for langt");

        }


       else {
           System.out.println("Password tilpas");
        }

    }
}


    // Lav et program der:
//  1. Indlæser et password fra konsollen.
  //      2. Checker, at længden af passwordet er større end 4 og mindre end 9.
    //    3. Udskriver "Password for kort" hvis under 5, "Password for langt" hvis over 8 eller
      //  "Password tilpas".
        //Hint: Brug en betinget sætning (se kapitel 5.1- 5.4) og konstanter.