import java.util.Scanner;

public class Objective6Lab5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int selection;

    while (true)
    {
      System.out.println("_______MENU______");
      System.out.println("1. Say Hello");
      System.out.println("2. List My Favorite Foods");
      System.out.println("3. Exit");
      System.out.println();

      selection = input.nextInt();

      if (selection == 1)
      {
        System.out.println("Hello, Human.");
      }
      else if (selection == 2)
      {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else
      {
        break;
      }
    }
    System.out.println("Goodbye");
  }
}
