import java.util.Scanner;

public class Opgave3_2 {
    private static final int Tdag = 86400;
    private static final int Timer = 3600;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dage, timer, minutter, sekunder;

       // System.out.print("Indtast antal sekunder: ");

        sekunder = sc.nextInt();
        dage = sekunder/(Tdag);
        timer = sekunder%Tdag/Timer;
        minutter = (sekunder%Timer/60);

        int sekunderind = sekunder%60;

        System.out.println(sekunder + " seconds equals " + dage + " days, " + timer + " hours, " + minutter + " minutes and " + sekunderind + " seconds.");

    }
}




     //    Lav et program, der (1) læser et antal sekunder ind og (2) skriver hvor mange dage, timer, minutter og sekunder det angivne antal sekunder svarer til, for eksempel:
       // Enter an amount of seconds: 238577
        //238577 seconds equals 2 days, 18 hours, 16 minutes and 17 seconds.
        //Hints:
        //1. Definer konstanter, der angiver hvor mange sekunder, der er i en time og i et helt døgn.
        //2. Lav en variabel totalSeconds af typen int til at holde den indtastede værdi.
        //3. Lav variable til at gemme de beregnede værdier af antal dage, timer, minutter og
        //sekunder i det angivne antal sekunder. Så bliver det nemmere at skrive ud. /*


     //   int sekPåendag=60*60*24;


   //     brug modules - % altså hvad der er tilbage

