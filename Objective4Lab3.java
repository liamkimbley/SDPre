import java.util.Scanner;

public class Objective4Lab3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double userNum;

        System.out.println("Please enter a number:");
        userNum = input.nextDouble();

        if (userNum < 0.0)
        {
            System.out.println("The number " + userNum + " is negative.");
        }
        else if (userNum == 0.0)
        {
            System.out.println("The number " + userNum + " is equal to 0.0.");
        }
        else
            System.out.println("The number " + userNum + " is positive.");

        input.close();

    }
}
