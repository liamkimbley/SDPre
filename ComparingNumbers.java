import java.util.Scanner;

public class ComparingNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double first, second;
        System.out.print("Please give me two numbers. \nFirst:");
        first = input.nextDouble();
        System.out.print("Second:");
        second = input.nextDouble();

        if (first < second)
        {
            System.out.println(first + " is LESS THAN " + second);
        }
        if (first <= second)
        {
            System.out.println(first + " is LESS THAN/EQUAL TO " + second);
        }
        if (first == second)
        {
            System.out.println(first + " is EQUAL TO " + second);
        }
        if (first >= second)
        {
            System.out.println(first + " is GREATER THAN/EQUAL TO " + second);
        }
        if (first > second)
        {
            System.out.println(first + " is GREATER THAN " + second);
        }
        if (first != second)
        {
            System.out.println(first + " is NOT EQUAL TO " + second);
            System.out.println("Hey.");
        }
    }
}