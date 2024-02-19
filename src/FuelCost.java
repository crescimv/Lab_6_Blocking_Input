import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank =0;
        double fuelEfficiency =0;
        double pricePerGallon = 0;
        boolean done = false;
        String trash;

        System.out.println("Enter amount of gallons in tank");
        do {
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid number, enter a positive value");
            }

        }
        while (!done);

        System.out.println("Enter your fuel efficiency in miles per gallon");
        do {
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid number, enter a positive value");
            }


        } while (!done);

        System.out.println("Enter the price per gallon");
        do
        {
            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid number, enter a positive value");
            }
        }while (!done);

        double costPer100miles = (100/fuelEfficiency)*pricePerGallon;
        double carDistance = gallonsInTank*fuelEfficiency;

        System.out.println("The cost every 100 miles is " + costPer100miles + " and the distance your car will go is " + carDistance);
    }
}