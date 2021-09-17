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

        sol.getShoppingCartFromUser();

        System.out.println(sol.selfCheckout());

        System.exit(0);
    }
    public void getShoppingCartFromUser()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Enter the price of item " + (i + 1) + " : ");
            price[i] = sc.nextDouble();

            System.out.print("Enter the quantity of item " + (i + 1) + " : ");
            quantity[i] = sc.nextDouble();
        }
    }
    public double getSubtotal()
    {
        double subtotal = 0;

        for(int i = 0; i < 3; i++)
        {
            subtotal += price[i] * quantity[i];
        }

        return subtotal;
    }
    public double getTaxAmount()
    {
        return getSubtotal() * SALES_TAX_RATE;
    }
    public double getTotal()
    {
        return getSubtotal() * (1.0 + SALES_TAX_RATE);
    }
    public String selfCheckout()
    {
        return String.format("Subtotal: $%.2f%n" +
                "Tax: $%.2f%n" +
                "Total: $%.2f", getSubtotal(), getTaxAmount(), getTotal());
    }
}
