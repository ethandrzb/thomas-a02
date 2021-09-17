/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution10
{
    private static final Scanner sc = new Scanner(System.in);

    private static final double SALES_TAX_RATE = 0.055;

    private final double[] price = new double[3];
    private final double[] quantity = new double[3];

    public static void main(String[] args)
    {
        Solution10 sol = new Solution10();

        // Prompt user for their shopping cart
        sol.getShoppingCartFromUser();

        // Display subtotal, sales tax amount, and total after tax
        System.out.println(sol.selfCheckout());

        System.exit(0);
    }
    private void getShoppingCartFromUser()
    {
        // Get 3 items from user
        for(int i = 0; i < 3; i++)
        {
            // Prompt user for price of current item
            System.out.print("Enter the price of item " + (i + 1) + " : ");
            price[i] = sc.nextDouble();

            // Prompt user for quantity of current item
            System.out.print("Enter the quantity of item " + (i + 1) + " : ");
            quantity[i] = sc.nextDouble();
        }
    }
    private double getSubtotal()
    {
        double subtotal = 0;

        // Sum costs for each item
        for(int i = 0; i < 3; i++)
        {
            // Calculate cost of each item
            subtotal += price[i] * quantity[i];
        }

        return subtotal;
    }
    // Calculate sales tax
    private double getTaxAmount()
    {
        return getSubtotal() * SALES_TAX_RATE;
    }

    // Apply sales tax to subtotal
    private double getTotal()
    {
        return getSubtotal() * (1.0 + SALES_TAX_RATE);
    }

    // Generate output message
    private String selfCheckout()
    {
        return String.format("Subtotal: $%.2f%n" +
                "Tax: $%.2f%n" +
                "Total: $%.2f", getSubtotal(), getTaxAmount(), getTotal());
    }
}
