import java.util.Scanner;

public class FavoriteNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favNum1 = 0;
        Double favNum2 = 0.0;

        favNum1 = SafeInput.getInt(in, "Enter your favorite number");
        favNum2 = SafeInput.getDouble(in, "Enter your second favorite number");
        System.out.println("\nYour two favorite numbers are " + favNum1 + " and " + favNum2+ ".");
    }
}
