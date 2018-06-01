import java.util.Scanner;

public class KeepGuessing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(Math.random()*10);

        System.out.println("I have chosen a random number between 1-10.\nTry to guess it.\nYour guess: ");
        guess = input.nextInt();

        while (secret != guess)
        {
              if (guess < secret)
              {
                System.out.print("That is incorrect.\nGuess again: ");
                guess = input.nextInt();
              }

              if (guess > secret)
              {
                System.out.print("That is incorrect.\nGuess again: ");
                guess = input.nextInt();
              }
        }
        
        System.out.println("You guessed it! You're a good guesser!");
    }
}
