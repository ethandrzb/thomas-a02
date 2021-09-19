/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution22
{
    private static final Scanner sc = new Scanner(System.in);

    // Can easily be expanded to support more numbers
    private static final String[] ordinals = {"first", "second", "third"};

    private final int[] numbers = new int[3];

    public static void main(String[] args)
    {
        Solution22 sol = new Solution22();

        // Prompt user for 3 numbers
        for(int i = 0; i < sol.numbers.length; i++)
        {
            sol.numbers[i] = sol.getIntFromUser("Enter the " + ordinals[i] + " number");
        }

        // Check numbers for uniqueness
        // Skip finding the maximum value if non-unique numbers exist.
        if(sol.allUnique())
        {
            System.out.printf("The largest number is %d.%n", sol.getMax());
        }

        System.exit(0);
    }

    private int getIntFromUser(String prompt)
    {
        System.out.print(prompt + ": ");
        return sc.nextInt();
    }

    // Compare numbers to each other to make sure they're all unique values
    private boolean allUnique()
    {
        return (numbers[0] != numbers[1]) && (numbers[1] != numbers[2]) && (numbers[2] != numbers[0]);
    }

    private int getMax()
    {
        int runningMax = Integer.MIN_VALUE;

        for (int number : numbers)
        {
            //noinspection ManualMinMaxCalculation
            runningMax = number > runningMax ? number : runningMax;
        }

        return runningMax;
    }
}
