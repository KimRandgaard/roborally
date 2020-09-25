import java.util.Scanner;

public class password {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            while (true) {

                String password = sc.nextLine();


                if (password.length() < 5) {
                    System.out.println("Password for kort");

                } else if (password.length() > 8) {
                    System.out.println("Password for langt");

                } else {
                    System.out.println("Password tilpas");
                    break;
                }
            }
        }
    }


