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

        sol.getDimensionsFromUser();
        sol.getCeilingArea();

        int numPaintCansNeeded = (int) Math.ceil(sol.getCeilingArea() / SQ_FEET_PER_CAN);

        System.out.printf("You will need to purchase %d gallons of paint to cover %.3f square feet.%n",
                numPaintCansNeeded, sol.getCeilingArea());

        System.exit(0);
    }
    public void getDimensionsFromUser()
    {
        System.out.println("What is the length of the ceiling?");
        length = sc.nextDouble();

        System.out.println("What is the width of the ceiling?");
        width = sc.nextDouble();
    }
    public double getCeilingArea()
    {
        return length * width;
    }
}
