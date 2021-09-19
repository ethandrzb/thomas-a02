/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution17
{
    private static final Scanner sc = new Scanner(System.in);

    private static final double LEGAL_BAC_LIMIT = 0.08;
    private static final double MALE_ALCOHOL_DISTRIBUTION_RATIO = 0.73;
    private static final double FEMALE_ALCOHOL_DISTRIBUTION_RATIO = 0.66;

    public static void main(String[] args)
    {
        Solution17 sol = new Solution17();

        // Prompt user for gender (1 or male, 2 for female)
        int gender = sol.getIntFromUser("Enter a 1 is you are male or a 2 if you are female:");

        // Prompt user for alcohol consumption in ounces
        int amtOfAlcohol = sol.getIntFromUser("How many ounces of alcohol did you have?");

        // Prompt user for weight in pounds
        int weight = sol.getIntFromUser("What is your weight, in pounds?");

        // Prompt user for hours since last drink
        int hoursSinceLastDrink = sol.getIntFromUser("How many hours has it been since your last drink?");

        // Calculate BAC
        double bac = sol.calculateBAC(gender, amtOfAlcohol, weight, hoursSinceLastDrink);

        // Display calculated BAC
        System.out.printf("%nYour BAC is %.6f%n", bac);

        // Compare calculated BAC with legal limit
        boolean legal = sol.legalToDrive(bac);

        // Display appropriate response
        if(legal)
        {
            System.out.println("It is legal for you to drive.");
        }
        else
        {
            System.out.println("It is not legal for you to drive.");
        }

        System.exit(0);
    }

    private int getIntFromUser(String prompt)
    {
        String userInput;
        int num;

        // Prevent execution from continuing until user enters integer value
        while(true)
        {
            System.out.print(prompt + " ");
            userInput = sc.nextLine();
            try
            {
                num = Integer.parseInt(userInput);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Error: Input must be integer number.");
            }
        }

        return num;
    }

    private double calculateBAC(int gender, int amtOfAlcohol, int weight, int hoursSinceLastDrink)
    {
        double bac = 0;

        if(gender == 1)
        {
            // Male
            bac = (amtOfAlcohol * 5.14 / weight * MALE_ALCOHOL_DISTRIBUTION_RATIO) - .015 * hoursSinceLastDrink;
        }
        else if (gender == 2)
        {
            // Female
            bac = (amtOfAlcohol * 5.14 / weight * FEMALE_ALCOHOL_DISTRIBUTION_RATIO) - .015 * hoursSinceLastDrink;
        }

        return bac;
    }

    private boolean legalToDrive(double userBAC)
    {
        return userBAC < LEGAL_BAC_LIMIT;
    }
}
