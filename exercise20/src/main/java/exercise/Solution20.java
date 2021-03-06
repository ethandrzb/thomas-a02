/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution20
{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution20 sol = new Solution20();

        // Prompt user for order amount
        double orderAmount = Double.parseDouble(sol.getStringFromUser("What is the order amount?"));

        // Prompt user for state
        String userState = sol.getStringFromUser("What state do you live in?");

        // Prompt user for county
        String userCounty = sol.getStringFromUser("What county do you live in?");

        // Calculate sales tax
        double salesTax = sol.getSalesTax(orderAmount, userState, userCounty);

        // Calculate total
        double total = orderAmount + salesTax;

        // Display sales tax and total
        System.out.printf("The tax is $%.2f.%n" +
                "The total is $%.2f.%n", salesTax, total);

        System.exit(0);
    }

    private String getStringFromUser(String prompt)
    {
        System.out.print(prompt + " ");

        return sc.nextLine();
    }

    private double getSalesTax(double subtotal, String state, String county)
    {
        double taxMultiplier = 0.0;
        double taxAmount;

        // Add sales tax if state is Wisconsin
        if(state.equals("Wisconsin"))
        {
            taxMultiplier = 0.05;

            // Add additional sale tax if county is Eau Claire or Dunn
            if(county.equals("Eau Claire"))
            {
                taxMultiplier += 0.005;
            }
            else if(county.equals("Dunn"))
            {
                taxMultiplier += 0.004;
            }
        }
        // Add sales tax if state is Illinois
        else if(state.equals("Illinois"))
        {
            taxMultiplier = 0.08;
        }

        taxAmount = subtotal * taxMultiplier;

        // Round up to next penny
        taxAmount *= 1000;
        taxAmount = Math.ceil(taxAmount);
        taxAmount /= 10;
        taxAmount = Math.ceil(taxAmount);
        taxAmount /= 100;

        return taxAmount;
    }
}
