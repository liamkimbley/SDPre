import java.util.Scanner;

public class EnterPIN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pin, entry;
        String password = "JavaTHW", attempt;

        pin = 12345;

        System.out.println("WELCOME TO THE BANK OF JAVA!");
        System.out.print("PLEASE ENTER YOUR PASSWORD:\t");
        attempt = input.next();

        while (! attempt.equals(password))
        {
          System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
          System.out.print("ENTER YOUR PASSWORD:\t");
          attempt = input.next();

        }

        System.out.print("THANK YOU. \nPLEASE ENTER YOUR PIN:\t");
        entry = input.nextInt();

        while (entry != pin)
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN:\t");
            entry = input.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. \nYOUR ACCOUNT BALANCE IS $425.17");
    }
}
