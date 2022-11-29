import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);


        /*
            sayHello();

            sayHello(13);

            sayMsg("Damn Matt!", 35);

            int favNum = 7;

            int doubleInt = doubleIt(favNum);

            System.out.println("Doubled is: " + doubleInt);


        int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1, 100);


        int year = SafeInput.getInt(console, "Enter an year of birth");
        System.out.println("You said the year is: " + year);


        double salary = SafeInput.getDouble(console, "Enter your salary");
        System.out.println("Your salary is " + salary);


        String fname = SafeInput.getNonZeroLengthString(console, "Enter a non zero length string like your name");
        System.out.println("Hello " + fname);

        String ssn = SafeInput.getNonZeroLengthString(console, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn is " + ssn);

        boolean isRaining = getYNConfirm(in, "Is it raining");
        System.out.println("You said it was raining");
        */

        String ssn = SafeInput.getRegExString(console,"Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn: " + ssn);
    }

    // User define static methods go here - after the main
    public static void sayHello()
    {
        System.out.println("Hello!");
    }
    public static void sayHello(int times)
    {
        for(int i = 0; i <= times; i++)
            System.out.println("Hello!");
    }
    public static void sayMsg(String msg, int times)
    {
        for(int i = 0; i <= times; i++)
            System.out.println(msg);
    }

    public static int doubleIt(int num)
    {
        int retVal = 0;

        retVal = num * 2;

        return retVal;
    }

}