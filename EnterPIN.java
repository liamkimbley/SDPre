import java.util.Scanner;

public class EnterPIN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pin, entry;

        pin = 12345;

        System.out.println("WELCOME TO THE BANK OF JAVA!");
        System.out.print("ENTER YOUR PIN:\t");
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
