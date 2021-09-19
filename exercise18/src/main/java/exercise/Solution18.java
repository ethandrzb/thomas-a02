/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution18
{
    private static final Scanner sc = new Scanner(System.in);

    private String startingUnitSelector;
    private String targetUnitSelector;

    public static void main(String[] args)
    {
        Solution18 sol = new Solution18();

        // Prompt user for conversion type
        sol.getStartingUnitFromUser();

        // Prompt user for input temperature in specified units
        double startingTemperature = sol.promptForTemperature();

        // Convert input temperature to target units
        double convertedTemperature = sol.convertTemperature(startingTemperature);

        // Display temperature in target units
        System.out.printf("The temperature in %s is %f.", sol.getUnitName(sol.targetUnitSelector), convertedTemperature);

        System.exit(0);
    }

    private void getStartingUnitFromUser()
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        targetUnitSelector =  sc.next().toUpperCase();

        // Set startingUnitSelector to appropriate unit
        if(targetUnitSelector.equals("C"))
        {
            startingUnitSelector = "F";
        }
        else if (targetUnitSelector.equals("F"))
        {
            startingUnitSelector = "C";
        }
    }

    private double promptForTemperature()
    {
        System.out.printf("Please enter the temperature in %s: ", getUnitName(startingUnitSelector));

        return sc.nextDouble();
    }

    private String getUnitName(String unitSelector)
    {
        return switch(unitSelector)
        {
            case "C" -> "Celsius";
            case "F" -> "Fahrenheit";
            default -> "Unsupported temperature";
        };
    }

    private double convertTemperature(double startingTemp)
    {
        return switch(targetUnitSelector)
        {
            // Fahrenheit to Celsius
            case "C" -> (startingTemp - 32) * 5 / 9.0;

            // Celsius to Fahrenheit
            case "F" -> (startingTemp * 9) / 5.0 + 32;

            // Error case
            default -> 0;
        };
    }
}
