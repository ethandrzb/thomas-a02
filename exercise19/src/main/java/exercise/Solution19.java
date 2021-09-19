/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution19
{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution19 sol = new Solution19();

        // Prompt user for height in inches
        double height = sol.getDoubleFromUser("Enter your height in inches");

        // Prompt user for weight in pounds
        double weight = sol.getDoubleFromUser("Enter your weight in pounds");

        // Calculate BMI
        double bmi = sol.getBMI(height, weight);

        // Display BMI
        System.out.printf("Your BMI is %.1f.%n", bmi);

        // Display appropriate response
        sol.classifyBMI(bmi);

        System.exit(0);
    }

    private double getDoubleFromUser(String prompt)
    {
        String userInput;
        double value;
        while(true)
        {
            System.out.print(prompt + ": ");
            userInput = sc.nextLine();

            try
            {
                value = Double.parseDouble(userInput);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Error: Input must be numeric");
            }
        }

        return value;
    }
    private double getBMI(double height, double weight)
    {
        return (weight / (height * height)) * 703;
    }

    private void classifyBMI(double bmi)
    {
        if(bmi < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi >= 18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
