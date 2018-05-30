import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(100*Math.random());

        System.out.println("I'm thinking of a number between 1-100.\nTry to guess it!\n>");
        guess = input.nextInt();

        while (secret != guess)
        {
            if (guess < secret)
            {
                System.out.print("Sorry, your guess is too low.\nTry again.\n>");
                guess = input.nextInt();

            }
            if (guess > secret)
            {
                System.out.print("Sorry, your guess is too high.\nTry again.\n>");
                guess = input.nextInt();

            }
        }

          System.out.println("You guessed it! What are the odds?!?");
    }
}
