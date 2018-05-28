import java.util.Scanner;

public class Objective4Lab4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num;

        System.out.println("Please enter a number: ");
        num = input.nextDouble();

        if (num % 2 == 0)
        {
            System.out.println("The number " + num + " is even.");
        }
        else
        {
            System.out.println("The number " + num + " is odd.");
        }
    }
}
