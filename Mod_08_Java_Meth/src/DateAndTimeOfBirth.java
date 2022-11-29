import java.util.Scanner;

public class DateAndTimeOfBirth
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int monthDays = 0;

        int year = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12);

        switch(month)
        {
            case 4,6,9,11:
                monthDays = 30;
                break;

            case 1,3,5,7,8,10,12:
                monthDays = 31;
                break;

            case 2:
                monthDays = 29;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day ", 1, monthDays);

        int hour = SafeInput.getRangedInt(in, "Enter your birth hour ", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute ", 1, 59);
        System.out.println("You were born on " + year + "/" + month + "/" + day + " at " + hour + ":" + minute);
    }
}
