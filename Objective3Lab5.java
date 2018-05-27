import java.util.Scanner;

public class Objective3Lab5
{
    public static void main(String[] args)
    {
        double firstNum, secondNum, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        firstNum = input.nextDouble();
        System.out.println("Please enter another number:");
        secondNum = input.nextDouble();

        result = firstNum + secondNum;
        System.out.println("The sum of " + firstNum + " + " + secondNum + " = " + result);
        input.close();
    }
}
