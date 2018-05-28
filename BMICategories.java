import java.util.Scanner;

public class BMICategories
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double m, kg, bmi, ft, in, lbs, ht;

        System.out.print("Your height (feet only): ");
        ft = input.nextDouble();
        System.out.print("Your height (inches): ");
        in = input.nextDouble();
        System.out.print("Your weight in pounds: ");
        lbs = input.nextDouble();

        ht = (ft*12)+ in;
        m = ht*.0254;
        kg = lbs*.453592;
        bmi = kg/(m*m);
        System.out.println("Your BMI is " + bmi);

        System.out.print("BMI Category: ");
        if (bmi < 15.0)
        {
            System.out.println("very severely underweight");
        }
        else if (bmi <= 16.0)
        {
            System.out.println("severely underweight");
        }
        else if (bmi < 18.5)
        {
            System.out.println("underweight");
        }
        else if (bmi < 25.0)
        {
            System.out.println("normal weight");
        }
        else if (bmi < 30.0)
        {
            System.out.println("overweight");
        }
        else if (bmi < 35.0)
        {
            System.out.println("moderately overweight");
        }
        else if (bmi < 40)
        {
            System.out.println("severely obese");
        }
        else
        {
            System.out.println("very severely/\"morbidly\" obese");
        }
    }
}
