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

        System.out.println("What is the length of the room in feet?");
        sol.length = sc.nextDouble();

        System.out.println("What is the width of the room in feet?");
        sol.width = sc.nextDouble();

        System.out.println("You entered " + sol.length + " feet by " + sol.width + " feet.");

        sol.printAreas();

        System.exit(0);
    }

    public double calculateArea()
    {
        return length * width;
    }
    public double sqFeetToSqMeters(double sqFeet)
    {
        return sqFeet * SQ_FEET_TO_SQ_METERS_CONVERSION_FACTOR;
    }
    public void printAreas()
    {
        System.out.println("The area is");
        System.out.printf("%d square feet%n", (int)calculateArea());

        System.out.printf("%.3f square meters%n", sqFeetToSqMeters(calculateArea()));
    }
}
