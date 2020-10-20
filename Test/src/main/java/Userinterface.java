import java.util.Scanner;

public class Userinterface {

    public static void main(String[] args) {
        CalculateCylinder calculator = new CalculateCylinder(); // make instance of CalculateCylinder
        Scanner input = new Scanner(System.in);                 // make instance of Scanner
        System.out.println("This program calculates the volume of a cylinder.");
        System.out.println("Please enter radius and height in centimeters:");
        double radius, height, volume;                          // declare variables
        radius = input.nextDouble();                            // read input from keyboard
        height = input.nextDouble();
        volume = calculator.getVolume(radius, height);          // call method getVolume in class CalculateCylinder
        System.out.printf("The volume is %6.4f cubic centimeters.\n", volume); // print number with 4 decimals using 6 characters in all
        input.close();                                          // close the scanner

    }
}