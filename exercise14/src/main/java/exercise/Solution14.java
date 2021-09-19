/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution14
{
    private static final Scanner sc = new Scanner(System.in);

    private static final double WI_SALES_TAX_RATE = 0.055;
    private double subtotal;
    private String state;
    private double taxAmount;
    private double total;

    public static void main(String[] args)
    {
        Solution14 sol = new Solution14();

        // Prompt user for order amount (subtotal)
        System.out.print("What is the order amount? ");
        sol.subtotal = sc.nextDouble();
        sc.nextLine();

        // Prompt user for location (state)
        System.out.print("What is the state? ");
        sol.state = sc.nextLine();

        // If state entered is Wisconsin, apply sales tax
        if(sol.state.equals("WI"))
        {
            sol.taxAmount = sol.subtotal * WI_SALES_TAX_RATE;
        }

        sol.total = sol.getTotal();

        // Display subtotal, tax amount, and total
        System.out.printf("The subtotal is $%.2f.%n" +
                "The tax is $%.2f.%n" +
                "The total is $%.2f.%n", sol.subtotal, sol.taxAmount, sol.total);

        System.exit(0);
    }
    private double getTotal()
    {
        double tmp = subtotal + taxAmount;

        // Round up to next penny
        tmp *= 1000;
        tmp = Math.ceil(tmp);
        tmp /= 10;
        tmp = Math.ceil(tmp);
        tmp /= 100;

        return tmp;
    }
}
