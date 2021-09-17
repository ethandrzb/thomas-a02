/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 7
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution07
{
    private static final Scanner sc = new Scanner(System.in);
    private double length;
    private double width;
    private static final double SQ_FEET_TO_SQ_METERS_CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args)
    {
        Solution07 sol = new Solution07();

        // Prompt user for room length
        System.out.println("What is the length of the room in feet?");
        sol.length = sc.nextDouble();

        // Prompt user for room width
        System.out.println("What is the width of the room in feet?");
        sol.width = sc.nextDouble();

        // Display dimensions entered by user
        System.out.println("You entered " + sol.length + " feet by " + sol.width + " feet.");

        // Print area of room in square feet and square meters
        sol.printAreas();

        System.exit(0);
    }
    // Calculate room area
    private double calculateArea()
    {
        return length * width;
    }
    private double sqFeetToSqMeters(double sqFeet)
    {
        return sqFeet * SQ_FEET_TO_SQ_METERS_CONVERSION_FACTOR;
    }
    private void printAreas()
    {
        System.out.println("The area is");
        System.out.printf("%d square feet%n", (int)calculateArea());

        System.out.printf("%.3f square meters%n", sqFeetToSqMeters(calculateArea()));
    }
}
