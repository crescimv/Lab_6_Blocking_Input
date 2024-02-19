import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        String trash;
        boolean done = false;

        System.out.println("Enter degrees in celsius");

        do
        {
            if (in.hasNextDouble())
            {
                tempC = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input, please enter degrees in celsius");
            }
        }
        while (!done);
        tempF = (tempC * 9 / 5) + 32;
        System.out.println("Temperature in fahrenheit is " + tempF);

        if (tempC >= 100)
        {
            System.out.println("Temperature is at boiling point");
        }
        if (tempC <= 0)
            System.out.println("Temperature is at freezing point");
    }
}

