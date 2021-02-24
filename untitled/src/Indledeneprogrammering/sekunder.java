package Indledeneprogrammering;

import java.util.Scanner;

public class sekunder {
    public static void main(String[] args) {
        int totalSekunder;
        final int DAGE = 60*60*24;
        final int TIMER = 60*60;
        final int MINUT = 60;

        Scanner sek = new Scanner(System.in);

        totalSekunder = sek.nextInt();
        sek.close();

        int dage = totalSekunder / DAGE;
        int timer = (totalSekunder%DAGE)/TIMER;
        int minutter = (totalSekunder%DAGE%TIMER)/MINUT;
        int sekunder = (totalSekunder%DAGE%TIMER%MINUT);

        System.out.println( totalSekunder + " seconds equals " + dage + " days, " + timer + " hours, " + minutter + " minutes and " + sekunder + " seconds.");

    }
}
