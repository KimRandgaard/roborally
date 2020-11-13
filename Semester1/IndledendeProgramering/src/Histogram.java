import java.util.Scanner;

public class Histogram {

    //De vi forventer kommer: 1 10 20 30
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String data = scan.nextLine();
//        String data = "1 10 20 30";
//
//        String[] stringarray = data.split(" ");
//
//        int[] array = new int[stringarray.length];
//
//        for (int i = 0; i < stringarray.length; i++)
//        {
//            array[i] = Integer.parseInt(stringarray[i]);
//        }

        Scanner scan = new Scanner(System.in);

        String Data = scan.nextLine();

        String[] stringArray = Data.split(" ");

        int[] aRray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            aRray[i] = Integer.parseInt(stringArray[i]);
        }



    }

}
