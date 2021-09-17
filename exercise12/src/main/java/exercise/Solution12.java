/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution12
{
    private static final Scanner sc = new Scanner(System.in);

    private double principal;
    private double interestRate;
    private int numYears;
    private double investmentValue;

    public static void main(String[] args)
    {
        Solution12 sol = new Solution12();

        // Prompt user for principal amount
        sol.principal = sol.getDoubleFromUser("Enter the principal:");

        // Prompt user for interest rate
        sol.interestRate = sol.getDoubleFromUser("Enter the interest rate:");

        // Prompt user for length of investment in years
        sol.numYears = (int)sol.getDoubleFromUser("Enter the number of years:");

        // Calculate simple interest on principal
        sol.investmentValue = sol.calculateSimpleInterest();

        // Display investment with interest
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.%n", sol.numYears, sol.interestRate, sol.investmentValue);

        System.exit(0);
    }
    private double getDoubleFromUser(String prompt)
    {
        System.out.print(prompt + " ");

        return sc.nextDouble();
    }
    private double calculateSimpleInterest()
    {
        double interest;

        // Calculate simple interest
        // Interest rate is divided by 100 to convert from a percentage to a decimal value
        interest = principal * (1 + ((interestRate / 100) * numYears));

        // Round up to next penny
        interest *= 100;
        interest = Math.ceil(interest);
        interest /= 100;

        return interest;
    }
}
