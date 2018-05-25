import java.util.Scanner;

public class BMICalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, ft, in, lbs, ht;

        System.out.print("Your height (feet only): ");
        ft = keyboard.nextDouble();
        System.out.print("Your height (inches): ");
        in = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        lbs = keyboard.nextDouble();

        ht = (ft*12)+ in;
        m = ht*.0254;
        kg = lbs*.453592;
        bmi = kg/(m*m);
        System.out.println("Your BMI is " + bmi);
    }
}
