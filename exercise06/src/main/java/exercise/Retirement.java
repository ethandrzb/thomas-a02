package exercise;

import java.util.Calendar;

public class Retirement
{
    private int currentAge;
    private int retireAge;

    public Retirement(int currentAge, int retireAge)
    {
        this.currentAge = currentAge;
        this.retireAge = retireAge;
    }

    public void printRetirement()
    {
        System.out.printf("You have %d years left until you can retire.%n", (retireAge - currentAge));

        System.out.printf("It's %d, so you can retire in %d.%n", getCurrentYear(), getCurrentYear() + (retireAge - currentAge));
    }
    private int getCurrentYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
