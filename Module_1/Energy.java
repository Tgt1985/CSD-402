/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.energy;
import java.util.Scanner;

/**
 *Sean Dudley
 * CSD 402 - Module 1 Assignment
 * 6/8/2025
 * 
 * Program to calculate energy needed to heat water from an initial temp to a
 * final temp. Program should prompt user to enter the amount of water in kg
 * and the initial and final temp of the water
 * 
 * Use Q = waterMass(finalTemperature - initialTemperature) * 4184
 * waterMass is water weight in kg
 * finalTemperature and initial Temperature are temps in Celsius
 * Q is result in Joules
 */
public class Energy {

    public static void main(String[] args) {
        
        // Declare Variables
        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double energy;
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Promt user to enter in kg of water used
        System.out.print("How many Kilograms of water will be used");
        waterMass = input.nextDouble();
        
        // Promt user to enter initial temp of water in Celsius
        System.out.print("What is the initial temperature of water, in Celsius");
        initialTemperature = input.nextDouble();
        
        // Promt user to enter the final temp of water in Celsius
        System.out.print("What is the final temperature of water, in Celsius?");
        finalTemperature = input.nextDouble();
        
        // Compute Energy needed
        
        energy = waterMass * (finalTemperature - initialTemperature) * 4184;
        
        // Display results
        System.out.println("The Energy needed to heat " + waterMass + "kg of water from"+ initialTemperature + " to " + finalTemperature + " is " + energy);
                
        
         
        
    }
}
