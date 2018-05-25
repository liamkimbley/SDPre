import java.util.Scanner;

public class ForgetfulMachine
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        kb.next();

        System.out.println("What is 6 multiplied by 7?");
        kb.nextInt();

        System.out.println("Enter a number between 0.0 and 1.0.");
        kb.nextDouble();

        System.out.println("Is there anything else you would like to say?");
        kb.next();

        //The second question blows up when I type in "forty-two"
        //The third quesion blows up when I don't use any numbers
    }
}
