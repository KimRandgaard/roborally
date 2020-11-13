package Lektion4;

import java.util.Scanner;

public class Dyrelyde {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dyrelyde;
        String out;


        while (sc.hasNextLine())
        {

            dyrelyde = sc.nextLine();

            dyrelyde = dyrelyde.toLowerCase();

            switch (dyrelyde) {
                case "dog":
                    out = "Woof";
                    break;
                case "cat":
                    out = "Meow";
                    break;
                case "fish":
                    out = "Blob";
                    break;
                case "cow":
                    out = "Muh";
                    break;
                case "lion":
                    out = "Roar";
                    break;
                case "sheep":
                    out = "Bah";
                    break;
                case "duck":
                    out = "Quack";
                    break;


                default:
                    out = "?";
            }

            System.out.println(out);

        }
    }

}
