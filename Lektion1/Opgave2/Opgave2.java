package Opgave2;

public class Opgave2 {
    public static void main(String[] args){
        int indkomst = 120000;
        double ambi, pension, Bundskat, personfradrag;

        ambi = indkomst * 8.0 / 100.0;
        pension = indkomst * 1.0 / 100.0;
        personfradrag =  33400;

        //bundskat = (indkomst - (arbejdsmarkedsbidrag + pension + perforfradrag))*0.07

        Bundskat = (int) ((indkomst - (ambi + pension + personfradrag)) * 0.07);



        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.println("Bundskat: ");
                System.out.println(Bundskat);
    }
}





