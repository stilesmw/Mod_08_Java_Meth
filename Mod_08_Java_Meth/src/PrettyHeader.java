import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String header = SafeInput.prettyHeader(in, "Sample Header");
        System.out.println();
    }
}
