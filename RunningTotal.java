import java.util.Scanner;

public class RunningTotal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int current, total = 0;

        System.out.print("Type in a bunch of numbers one at a time and I'll add them up!\nI'll stop when you type a zero.\n");

        do
        {
          System.out.print("Value: ");
          current = input.nextInt();
          total += current;
          if (current != 0)
          {
            System.out.println("The total so far is: " + total);
          }
        } while (current != 0);

        System.out.println("The final total is: " + total);
    }
}
