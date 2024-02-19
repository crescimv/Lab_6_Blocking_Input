import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        boolean done = false;
        String trash;

        do
        {
            System.out.println("Provide the width of the rectangle");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();

            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input, please try again");
            }
        }
        while (!done);

    }
}
