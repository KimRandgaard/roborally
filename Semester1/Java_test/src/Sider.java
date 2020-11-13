import java.util.Scanner;

public class Sider {

    public static void main(String[] args) {
        int sider = 7;
        System.out.println("Her er har du så mange sider: " + sider + " sider.");

        sider = 10;
        System.out.println("Her er har du så mange sider: " + sider + " sider.");

        sider = 12;
        System.out.println("Her er har du så mange sider: " + sider + " sider.");

        Scanner sides = new Scanner(System.in);

        String Sider = sides.nextLine();

        if (sider < 8) {
            System.out.println("Du har få sider");
        } else if (sider > 8) {
            System.out.println("Du har mange sider");
        }
    }


}


// skal lige tjekkes, virker ikke optimalt !!
