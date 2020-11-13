package Dice;

import java.util.Scanner;

class Dice {
    // roll the die and return the value (1-6)
    public int roll() {
        float d1 = (float) Math.random();    // 0.0-1.0
        float d2 = d1 * 5;                    // 0-5
        int d3 = Math.round(d2);            // 0-5 integer
        return d3 + 1;                    // 1-6
    }

    // roll the die n times and print the values
    public void rollMultiple(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(roll() + " ");
        }
    }

    public static class UseDice {

        public static void main(String[] args) {
            Dice cup = new Dice();   // Make an instance of Dice
            Scanner keyboard = new Scanner(System.in);   // Make an instance of keyboard Scanner
            System.out.println("Welcome to the diceroll program");
            System.out.println("How many times do you want to roll the dice?");
            int n = keyboard.nextInt();  // Read integer
            cup.rollMultiple(n);        // Roll the dice n times
            keyboard.close();            // Close the scanner
        }
    }
}