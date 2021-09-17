/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 8
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution08
{
    private static final Scanner sc = new Scanner(System.in);

    private int numPeople;
    private int numPizzas;
    private int slicesPerPizza;

    public static void main(String[] args)
    {
        Solution08 sol = new Solution08();

        // Get pizza party information from user
        sol.getAllValuesFromUser();

        // Display calculated pizza party attributes
        System.out.printf("%d people with %d pizzas (%d slices)%n", sol.numPeople, sol.numPizzas, sol.calculateTotalSlices());
        System.out.printf("Each person gets %d slices%n", sol.slicesPerPerson());
        System.out.printf("There are %d leftover slices%n", sol.leftoverSlices());

        System.exit(0);
    }

    private void getAllValuesFromUser()
    {
        // Prompt user for number of party attendees
        numPeople = getIntFromUser("How many people?");

        // Prompt user for number of pizzas ordered
        numPizzas = getIntFromUser("How many pizzas do you have?");

        // Prompt user for number of slices per pizza
        slicesPerPizza = getIntFromUser("How many slices per pizza?");
    }

    private int getIntFromUser(String prompt)
    {
        // Display prompt
        System.out.println(prompt);
        return sc.nextInt();
    }
    // Calculates total slices of pizza ordered
    private int calculateTotalSlices()
    {
        return numPizzas * slicesPerPizza;
    }

    // Calculates number of pizza slices each person can have, making sure that everyone gets the same number of slices
    private int slicesPerPerson()
    {
        return calculateTotalSlices() / numPeople;
    }

    // Calculates number of remaining pizza slices
    private int leftoverSlices()
    {
        return calculateTotalSlices() % numPeople;
    }
}
