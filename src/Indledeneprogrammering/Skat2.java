package Indledeneprogrammering;
public class Skat2{
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public static void main(String[] args){
        int indkomst = 120000;
        double ambi, pension, Bundskat;
        int Personfradrag = 33400;

        final double AMBI = 8.0;
        final double SP = 1.0;
        final double BUNDSKAT = 7.0;
        final double PERSONFRADRAG = 33400;


        ambi = indkomst * AMBI/ 100.0;
        pension = indkomst * SP / 100.0;
        Bundskat = (indkomst-(ambi + pension + PERSONFRADRAG)) * BUNDSKAT/100.0;



        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.print("Bundskat: ");
        System.out.println(round(Bundskat,1));

    }
}
