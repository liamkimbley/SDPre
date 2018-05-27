import java.util.Scanner;

public class BooleanExpressions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean a, b, c, d, e, f;
        double x, y;

        System.out.print("Give me two numbers. \nFirst:");
        x = input.nextDouble();
        System.out.print("Second:");
        y = input.nextDouble();

        a = (x < y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x > y);
        f = (x >= y);

        System.out.println(x + " is LESS THAN " + y + ": " + a);
        System.out.println(x + " is LESS THAN/EQUAL TO " + y + ": " + b);
        System.out.println(x + " is EQUAL TO " + y + ": " + c);
        System.out.println(x + " is NOT EQUAL TO " + y + ": " + d);
        System.out.println(x + " is GREATER THAN " + y + ": " + e);
        System.out.println(x + " is GREATER THAN/EQUAL TO " + y + ": " + f + "\n");
        System.out.println(!(x < y) + " " + (x >= y));
        System.out.println(!(x <= y) + " " + (x > y));
        System.out.println(!(x == y) + " " + (x != y));
        System.out.println(!(x != y) + " " + (x == y));
        System.out.println(!(x > y) + " " + (x <= y));
        System.out.println(!(x >= y) + " " + (x < y));

        //less than is <
        //greater than is >
        //equal to is ==
        //less than/equal to is <=
        //greater than/equal to is >=
        //not equal to is !=
    }
}