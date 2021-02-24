package Indledeneprogrammering;

public class Pyramids {
    final static int pyrammisCount = 4;

    public static void main(String[] args) {
        for (int pyramid = 0; pyramid < pyrammisCount;pyramid++) {
            System.out.println("Pyramid " + (pyramid + 1));
            for (int line = 1; line <= pyramid + 1; line++) {
                String str = "";
                for (int i = 0; i < pyramid - line + 1; i++) {
                    str += " ";
                }
                for (int i = 0; i < 2 * line - 1; i++) {
                    str += "#";
                }
                System.out.println(str);
            }
            System.out.println();
        }
    }
}