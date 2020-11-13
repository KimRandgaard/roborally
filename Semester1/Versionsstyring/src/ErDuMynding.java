public class ErDuMynding {

    public static void main(String[] args) {
        int alder;
        java.util.Scanner brugerinput = new java.util.Scanner(System.in);
        alder = brugerinput.nextInt();

        if (alder > 70) {
            System.out.println("Du er meget gammel");
        } else{
            System.out.println("Du er ikke spor gammel");

        }


    }

}
