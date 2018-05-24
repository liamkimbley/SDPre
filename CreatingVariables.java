public class CreatingVariables
{
    public static void main( String[] args)
    {
        int x, y, age, days;
        double seconds, e, checking, cost;
        String firstName, lastName, title, wifeName, place;

        x = 10;
        y = 400;
        age = 39;
        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        days = 6;
        cost = 5336;
        wifeName = "Sarah";
        place = "Paris, France";

        System.out.println("The variable \"x\" contains " + x);
        System.out.println("The value " + y + " is stored in the variable \"y\"");
        System.out.println("The experiment took " + seconds + " seconds.");
        System.out.println("A favorite irrational number is Euler's number: " + e);
        System.out.println("Hopefully, you have more than $" + checking + "!");
        System.out.println("My name is " + title + " " + firstName + " " + lastName + ".");
        System.out.println(title + " " + firstName + " " + lastName + " is traveling with his wife, " + wifeName + ", in " + days + " days to " + place + ". The entire trip cost them $" + cost + ".");

    }
}
