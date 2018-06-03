import java.util.Scanner;

public class ShapeArea
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int choice;
    double area = 0;

    System.out.print("Shape Area Calculator Version 0.1\n");
    System.out.println(" (c) 2018 LJtHW Sample Output, Inc.");

    do {
      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
      System.out.println("1) Triangle");
      System.out.println("2) Circle");
      System.out.println("3) Rectangle");
      System.out.println("4) Square");
      System.out.println("5) Quit");
      System.out.print("> ");
      choice = input.nextInt();

      if (choice == 1)
      {
        System.out.print("\nBase: ");
        int b = input.nextInt();
        System.out.print("Height: ");
        int h = input.nextInt();
        area = computeTriangleArea(b, h);
        System.out.println("The area is " + area);
      }
      else if (choice == 2)
      {
        System.out.print("\nRadius: ");
        int radius = input.nextInt();
        area = computeCircleArea(radius);
        System.out.println("The area is " + area);
      }
      else if (choice == 3)
      {
        System.out.print("\nLength: ");
        int q = input.nextInt();
        System.out.print("Width: ");
        int w = input.nextInt();
        System.out.println("The area is " + computeRectangleArea(q, w));
      }
      else if (choice == 4)
      {
        System.out.print("\nSide: ");
        int s = input.nextInt();
        System.out.println("The area is " + computeSquareArea(s));
      }
      else if (choice != 5)
      {
        System.out.println("ERROR.");
      }
    } while (choice != 5);
  }

  public static double computeTriangleArea(int base, int height)
  {
    double A = (0.5 * base * height);
    return A;
  }

  public static double computeCircleArea(int radius)
  {
    double A = (Math.PI * radius * radius);
    return A;
  }

  public static int computeRectangleArea(int length, int width)
  {
    return (length * width);
  }
  public static double computeSquareArea(int s)
  {
    return (s * s);
  }
}
