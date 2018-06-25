import java.util.Scanner;

public class TriangleShapes
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double a, b, c, d, e;

    System.out.print("This will tell you what to classify your triangle as.\n");
    System.out.print("Please enter the length of each side of the triangle, one at a time.\n");
    System.out.print("What is the length of the first side? ");
    a = input.nextDouble();

    System.out.print("What is the length of the second side? ");
    b = input.nextDouble();

    System.out.print("What is the length of the third side? ");
    c = input.nextDouble();

    d = (a + b + c)/2;
    e = Math.sqrt((d*(d-a)*(d-b)*(d-c)));

    if ((a == b) && (b == c))
    {
      System.out.print("This triangle is an equilateral triangle.");
      System.out.println("The area of this triangle is " + e);
    }

    else if ((a == b) || (a == c) || (b == c))
    {
      System.out.println("This triangle is an isosceles triangle.");
      System.out.println("The area of this triangle is " + e);
    }
    else if ((c*c) == ((a*a)+(b*b)))
    {
      System.out.println("This triangle is a right triangle.");
      System.out.println("The area of this triangle is " + e);
    }
    else
    {
      System.out.println("This triangle is a scalene triangle.");
      System.out.println("The area of this triangle is " + e);
    }
  }
}
