import java.util.Scanner;

public class RudeQuestions
{
    public static void main(String[] args)
    {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        name = keyboard.next();

        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's not very old!");
        System.out.print("How much do you weigh, " + name + "?");
        weight = keyboard.nextDouble();

        System.out.println(weight + "lbs! Nice!! Get those gainz, bro!");
        System.out.print("Finally, what's your income, " + name + "?");
        income = keyboard.nextDouble();

        System.out.println("Hopefully, that is " + income + " per hour!");
        System.out.println("Well, " + name + ", thanks for answering my rude questions!");

/* The code crashes anytime I type a word where it is expecting an integer or a double.
In the first question, it will let me input anything as my name, including puncuation marks.
It also crashes if I type any answer combined with numbers and letters, ie 180lbs or $50. */

    }
}
