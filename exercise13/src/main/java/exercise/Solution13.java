/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution13
{
    private static final Scanner sc = new Scanner(System.in);

    private double principal;
    private double interestRate;
    private int numYears;
    private int compoundsPerYear;
    private double investmentValue;

    public static void main(String[] args)
    {
        Solution13 sol = new Solution13();

        // Prompt user for principal amount
        sol.principal = sol.getDoubleFromUser("What is the principal amount?");

        // Prompt user for interest rate
        sol.interestRate = sol.getDoubleFromUser("What is the rate?");

        // Prompt user for length of investment in years
        sol.numYears = (int)sol.getDoubleFromUser("What is the number of years?");

        sol.compoundsPerYear = (int)sol.getDoubleFromUser("What is the number of times the interest is compounded per year?");

        // Calculate simple interest on principal
        sol.investmentValue = sol.calculateCompoundInterest();

        // Display investment with interest
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f.%n",
                sol.principal, sol.interestRate, sol.numYears, sol.compoundsPerYear, sol.investmentValue);

        System.exit(0);
    }
    private double getDoubleFromUser(String prompt)
    {
        System.out.print(prompt + " ");

        return sc.nextDouble();
    }
    private double calculateCompoundInterest()
    {
        double interest;

        // Calculate compound interest
        // Interest rate is divided by 100 to convert from a percentage to a decimal value
        interest = principal * Math.pow(1 + ((interestRate / 100) / compoundsPerYear),
                (double)compoundsPerYear * numYears);

        // Round up to next penny
        interest *= 100;
        interest = Math.ceil(interest);
        interest /= 100;

        return interest;
    }
}
