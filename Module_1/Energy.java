// Sean Dudley
// CSD-402 Module 1
// 9/14/2025

import java.util.Scanner;


public class Energy {
    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // User Input

        System.out.print("Please enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Please enter the initial Temperature:");
        double initialTemp = input.nextDouble();

        System.out.print("Please enter the final Temperature:");
        double finalTemp = input.nextDouble();


        // Formula to find Energy needed

        double joules =  (waterMass * (finalTemp - initialTemp) * 4184); // Answer shown in joules

        // Display the result

        System.out.println("User entered" + waterMass + "kg of water.");
        System.out.println("User entered inital Temperature of:" + initialTemp);
        System.out.println("User entered final Temperature of:"+ finalTemp);
        System.out.println("The energy needed to heat " + waterMass + "kg of water from" + initialTemp + "to " + finalTemp + "is " + joules + "joules");


    }
    
}
