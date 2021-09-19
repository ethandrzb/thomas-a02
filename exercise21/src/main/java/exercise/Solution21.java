/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution21
{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution21 sol = new Solution21();

        // Prompt user for month number
        System.out.print("Please enter the number of the month: ");
        int monthNumber = sc.nextInt();

        // Convert number to month name
        // Display month
        System.out.println(sol.numberToMonth(monthNumber));

        System.exit(0);
    }

    private String numberToMonth(int num)
    {
        String retStr;

        if(num >= 1 && num <= 12)
        {
            retStr = "The name of the month is ";

            retStr = retStr + switch(num)
                    {
                        case 1 -> "January";
                        case 2 -> "February";
                        case 3 -> "March";
                        case 4 -> "April";
                        case 5 -> "May";
                        case 6 -> "June";
                        case 7 -> "July";
                        case 8 -> "August";
                        case 9 -> "September";
                        case 10 -> "October";
                        case 11 -> "November";
                        case 12 -> "December";

                        default -> null;
                    } + ".";
        }
        else
        {
            retStr = "Invalid month entered.";
        }

        return retStr;
    }
}
