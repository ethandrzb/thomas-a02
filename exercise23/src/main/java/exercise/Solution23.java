/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution23
{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution23 sol = new Solution23();

        // Run troubleshooter
        sol.troubleshooter();

        System.exit(0);
    }

    // Car troubleshooter
    private void troubleshooter()
    {
        // Ask user if the car is silent when they turn the key
        if(getYesOrNoFromUser("Is the car silent when you turn the key?"))
        {
            // If so, ask user if battery terminals are corroded
            if(getYesOrNoFromUser("Are the battery terminals corroded?"))
            {
                // If so, tell user to clean terminals
                System.out.println("Clean terminals and try again.");
            }
            else
            {
                // If not, tell user to replace the cables and try again.
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            // Go to slicking noise troubleshooter
            slickingNoiseTroubleshooter();
        }
    }

    // Sub-function for troubleshoot()
    private void slickingNoiseTroubleshooter()
    {
        // If not, ask user if car makes a slicking noise
        if(getYesOrNoFromUser("Does the car make a slicking noise?"))
        {
            // If so, tell user to replace the battery.
            System.out.println("Replace the battery.");
        }
        else
        {
            // If not, ask user if the car cranks up, but fails to start
            if(getYesOrNoFromUser("Does the car crank up, but fail to start?"))
            {
                // If so, tell user to check spark plug connections
                System.out.println("Check spark plug connections.");
            }
            else
            {
                // If not, ask user if engine starts, but dies
                if(getYesOrNoFromUser("Does the engine start and then die?"))
                {
                    // If so, ask user if their car has fuel injection
                    if(getYesOrNoFromUser("Does your car have fuel injection?"))
                    {
                        // If so, tell the user to get their car in for service
                        System.out.println("Get it in for service.");
                    }
                    else
                    {
                        // If not, tell the user to ensure the choke is opening and closing
                        System.out.println("Check to ensure the choke is opening and closing.");
                    }
                }
                else
                {
                    // If not, tell the user this should not be possible
                    System.out.println("This should not be possible.");
                }
            }
        }
    }

    private boolean getYesOrNoFromUser(String prompt)
    {
        String userInput;

        // Display prompt
        System.out.print(prompt + " ");

        userInput = sc.nextLine().toUpperCase();

        // Convert Y or y to true, and everything else (including N or n), to false
        return userInput.equals("Y");
    }
}
