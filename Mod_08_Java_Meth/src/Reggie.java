import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in,"Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn is " + ssn);
        String ucid = SafeInput.getRegExString(in, "Enter your UC M number", "(M|m)\\d{5}");
        System.out.println("Your UC M number is " + ucid);
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");
        System.out.println("Your menu choice is " + menuChoice);
    }
}
