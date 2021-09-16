/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 6
 *  Copyright 2021 Ethan Thomas
 */

package exercise;

import java.util.Scanner;

public class Solution06
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentAge;
        int retireAge;

        System.out.print("What is your current age? ");

        currentAge = sc.nextInt();

        System.out.print("At what age would you like to retire? ");

        retireAge = sc.nextInt();

        Retirement r = new Retirement(currentAge, retireAge);
        r.printRetirement();

        System.exit(0);
    }
}
