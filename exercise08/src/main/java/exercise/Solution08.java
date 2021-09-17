package exercise;

import java.util.Scanner;

public class Solution08
{
    private static final Scanner sc = new Scanner(System.in);

    private int numPeople;
    private int numPizzas;
    private int slicesPerPizza;

    public static void main(String[] args)
    {
        Solution08 sol = new Solution08();

        sol.getAllValuesFromUser();

        System.out.printf("%d people with %d pizzas (%d slices)%n", sol.numPeople, sol.numPizzas, sol.calculateTotalSlices());
        System.out.printf("Each person gets %d slices%n", sol.slicesPerPerson());
        System.out.printf("There are %d leftover slices%n", sol.leftoverSlices());

        System.exit(0);
    }

    public void getAllValuesFromUser()
    {
        numPeople = getIntFromUser("How many people?");
        numPizzas = getIntFromUser("How many pizzas do you have?");
        slicesPerPizza = getIntFromUser("How many slices per pizza?");
    }

    private int getIntFromUser(String prompt)
    {
        System.out.println(prompt);
        return sc.nextInt();
    }
    private int calculateTotalSlices()
    {
        return numPizzas * slicesPerPizza;
    }
    private int slicesPerPerson()
    {
        return calculateTotalSlices() / numPeople;
    }
    private int leftoverSlices()
    {
        return calculateTotalSlices() % numPeople;
    }
}
