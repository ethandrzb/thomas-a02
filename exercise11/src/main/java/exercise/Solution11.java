/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution11
{
    private static final Scanner sc = new Scanner(System.in);

    private double euros;
    private double exchangeRate;

    public static void main(String[] args)
    {
        Solution11 sol = new Solution11();

        // Prompt user for euro amount
        sol.euros = sol.getDoubleFromUser("How many euros are you exchanging?");

        // Prompt user for exchange rate
        sol.exchangeRate = sol.getDoubleFromUser("What is the exchange rate?");

        // Display currency in USD
        System.out.printf("%.2f euros at an exchange rate of %.4f is%n" +
                "%.2f U.S. dollars.%n",sol.euros, sol.exchangeRate , sol.getUSDFromEuros());

        System.exit(0);
    }

    private double getDoubleFromUser(String prompt)
    {
        System.out.print(prompt + " ");

        return sc.nextDouble();
    }

    // Convert euros to USD
    private double getUSDFromEuros()
    {
        double usd = euros * exchangeRate;

        // Round up to next penny
        usd *= 1000;
        usd = Math.ceil(usd);
        usd /= 10;
        usd = Math.ceil(usd);
        usd /= 100;

        return usd;
    }
}
