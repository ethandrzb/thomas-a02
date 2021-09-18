/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution16
{
    private static final Scanner sc = new Scanner(System.in);

    private static final int LEGAL_DRIVING_AGE = 16;

    public static void main(String[] args)
    {
        Solution16 sol = new Solution16();
        // Prompt user for age
        System.out.print("What is your age? ");
        int userAge = sc.nextInt();

        // Display appropriate response based on comparison of user input with legal driving age
        sol.printResponse(userAge);

        System.exit(0);
    }
    private void printResponse(int age)
    {
        System.out.printf("%s%n", (age >= LEGAL_DRIVING_AGE) ? "You are old enough to legally drive." :
                "You are not old enough to legally drive.");
    }
}
