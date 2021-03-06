package Lektion7;

//Design and implement an application that creates a histogram that allows you to visually inspect the frequency distribution
// of a set of values. The program should read in an arbitrary number of integers (on one line) that are in the range 1 to 100 inclusive;
// then produce a chart similar to the one below that indicates how many input values fell in the range 1 to 10, 11 to 20, and so on.
// Print one asterisk for each value entered.
//        1  - 10  | *****
//        11 - 20  | **
//        21 - 30  | *******************
//        31 - 40  |
//        41 - 50  | ***
//        51 - 60  | ********
//        61 - 70  | **
//        71 - 80  | *****
//        81 - 90  | *******
//        91 - 100 | *********

import java.util.Scanner;

public class Histogram {

        public static void main (String[] args) {
            Scanner scan = new Scanner (System.in);
            //There are in total (100-1+2) numbers between 1 and 100
            //including 1 and 100.
            //Let's make an array of 101 integers to keep track of how
            //times each number is typed (maybe never, once, twice, or more)
            int[] nums = new int[101];
            //Time to start reading in numbers
            System.out.println("Enter numbers between 1 and 100[-1 to quit]: ");
            int num = scan.nextInt();
            //We will be using this variable to help organize/count the number of
            //times numbers with a certain range (e.g., 1-10, 11-20) appeared
            //Hint: this variable represent the right-side number in 1-10, 11-20, etc.
            //which always has 0 in the one's digit place and let's just make it equal to
            //zero now to make coding easier later; you'll see why
            int base10 = 0;
            //Here we will make sure that each entered is accounted for in our array
            while (num != -1)
            {
                nums[num]++;
                num = scan.nextInt();
            }
            //Now it's time to loop over each range (e.g., 11-20) to check
            //how many elements they have, e.g., how many 11's, 12's, 13's, etc.
            //Hint: count represents the left-side number in 1-10, 11-20,
            //which always has 1 in the one's digit place so we just need
            //to increment the count by 10 each time till we reach 100
            for (int count = 1; count <=100;count+=10)
            {
                //Let's first do the easy thing: print out the range limits
                //Notice how we are increasing base10 by 10 during each loop
                //since the range right-limit always increases by 10
                //such as from 10 to 20 to 30
                //If we initialized base10 to 10 outside the loop then
                //we would've needed an if statement here just for count==1
                //to make sure we don't get 1-20
                System.out.print(count + " - " + (base10+=10) + "  | " );


                //Time to loop over each number between our left-limit
                //right limit, such as between 1 and 10, 11 and 20,etc.
                //by using a new variable that will represent each number
                for (int index = count ; index<=base10 ; index++)
                {
                    //We have to check if the numbers between our limits
                    //appeared at least once in our array/scan,
                    //make sure that we count each time a number appears,
                    //and visually represent each number with a *
                    while(nums[index] > 0) {
                        System.out.print("*");
                        nums[index]--;
                    }
                }
                System.out.println();
            }
        }

    }

