/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 9
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution09
{
    private static final Scanner sc = new Scanner(System.in);

    private static final int SQ_FEET_PER_CAN = 350;
    private double length;
    private double width;

    public static void main(String[] args)
    {
        Solution09 sol = new Solution09();

        // Get ceiling dimensions from user
        sol.getDimensionsFromUser();

        // Calculate ceiling area
        sol.getCeilingArea();

        // Calculate number of paint cans needed to paint the ceiling
        int numPaintCansNeeded = (int) Math.ceil(sol.getCeilingArea() / SQ_FEET_PER_CAN);

        // Display number of paint cans need
        System.out.printf("You will need to purchase %d gallons of paint to cover %.3f square feet.%n",
                numPaintCansNeeded, sol.getCeilingArea());

        System.exit(0);
    }
    private void getDimensionsFromUser()
    {
        // Prompt user for ceiling length
        System.out.println("What is the length of the ceiling?");
        length = sc.nextDouble();

        // Prompt user for ceiling width
        System.out.println("What is the width of the ceiling?");
        width = sc.nextDouble();
    }
    // Calculate area of rectangular ceiling
    private double getCeilingArea()
    {
        return length * width;
    }
}
