import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;

        boolean validInput;

        do {
            System.out.print("Enter the number of gallons in your gas tank: ");
            if (scanner.hasNextDouble()) {
                gallonsInTank = scanner.nextDouble();

            }
            if (gallonsInTank > 0) {
                validInput = true;
            } else {
                System.out.println("Please enter a non negative number or an actual numeric value. ");
                validInput = false;
                scanner.next();

            }

        } while (!validInput);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a non negative or actual numeric value.");
                    validInput = false;
                    scanner.next();
                }
            }
        } while (!validInput);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a non negative or actual numeric value.");
                    validInput = false;
                    scanner.next();
                }
            }
        } while (!validInput);

        double costPerHundredMiles = (100 / fuelEfficiency) * pricePerGallon;

        double distanceWithCurrentGas = gallonsInTank * fuelEfficiency;

        System.out.println("The cost per 100 miles is: $" + costPerHundredMiles);
        System.out.println("With the current gas in the tank, the car can go: " + distanceWithCurrentGas + " miles.");


    }
}
