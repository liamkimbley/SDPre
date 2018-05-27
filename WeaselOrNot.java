import java.util.Scanner;

public class WeaselOrNot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println("Please type the word \"weasel\".");
        word = input.next();
        yep = word.equals("weasel");
        nope = ! word.equals("weasel");
        System.out.println("You typed what was requested: " + yep);
        System.out.println("You ignored polite instrustions: " + nope);

    }
}
