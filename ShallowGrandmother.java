import java.util.Scanner;

public class ShallowGrandmother
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age;
        double income, cute, happy;
        boolean allowed, allowed2;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your yearly income: ");
        income = input.nextDouble();
        System.out.print("How cute are you, on a scale of 0.0 to 10.0?");
        cute = input.nextDouble();
        allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));
        System.out.println("Allowed to date my grandchild? " + allowed);
        System.out.println("But, how happy do you make my grandchild, on a scale of 0.0 to 10.0?");
        happy = input.nextDouble();
        allowed2 = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5) && happy >= 8.5);
        System.out.println("Allowed to date my grandchild? " + allowed2);
        input.close();
    }
}
