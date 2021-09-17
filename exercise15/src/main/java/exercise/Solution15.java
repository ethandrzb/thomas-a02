/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution15
{
    private static final Scanner sc = new Scanner(System.in);

    private static final String PASSWORD = "abc$123";

    public static void main(String[] args)
    {
        Solution15 sol = new Solution15();

        // Prompt user for password
        System.out.print("What is the password? ");
        String inputPassword = sc.nextLine();

        // Check if password matches correct password
        boolean match = sol.checkPassword(inputPassword);

        // Print response
        sol.printResponse(match);

        System.exit(0);
    }
    private boolean checkPassword(String inputPassword)
    {
        return inputPassword.equals(PASSWORD);
    }
    private void printResponse(boolean match)
    {
        if(match)
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
