import java.util.Scanner;

public class GenderTitles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String title;

        System.out.print("First name: ");
        String first = input.next();
        System.out.print("Last Name: ");
        String last = input.next();
        System.out.print("Gender (M/F): ");
        String gender = input.next();
        System.out.print("Age: ");
        int age = input.nextInt();

        if (age < 20)
        {
            title = first;
        }
        else
        {
            if (gender.equals("F"))
            {
                System.out.print("Are you married, " +first+ "? (Y/N)");
                String married = input.next();
                    if (married.equals("Y"))
                    {
                        title = "Mrs.";
                    }
                    else
                    {
                        title = "Ms.";
                    }
            }
            else
            {
                title = "Mr.";
            }
        System.out.println("\n" +title+ " " +last);
        }

    /*responses typed in are case sensitive. it must be M/F, not m/f.
    or Y/N, not y/n.*/
    }
}
