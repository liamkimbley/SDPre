import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x, y;
        String guess, glass = "Yes!", cup = "Yes", fork = "yes", ready = "YES!", hat = "yes!";

        System.out.println("Are you ready?!?");
        guess = input.next();

        while ( !(guess.equals(glass) || guess.equals(cup) || guess.equals(fork) || guess.equals(ready) || guess.equals(hat)))
        {
            System.out.println("Aww, come on! Are you ready for this?!?");
            guess = input.next();
        }

        System.out.println("Give me a number, and I'll find it's square root.\nNo negatives, please.");
        x = input.nextDouble();

        while (x < 0)
        {
            System.out.println("I won't take the square root of a negative. \nNew number:");
            x = input.nextDouble();
        }

        y = Math.sqrt(x);
        System.out.println("The square root of " + x + " is " + y);
    }
}
