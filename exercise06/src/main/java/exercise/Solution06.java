/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 6
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;
import java.util.Calendar;

public class Solution06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int currentAge;
        int retireAge;

        System.out.print("What is your current age? ");

        currentAge = sc.nextInt();

        System.out.print("At what age would you like to retire? ");

        retireAge = sc.nextInt();

        System.out.printf("You have %d years left until you can retire.%n", (retireAge - currentAge));

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.printf("It's %d, so you can retire in %d.%n", currentYear, currentYear + (retireAge - currentAge));

        System.exit(0);
    }
}
