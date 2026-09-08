import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: Arrays
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Creating arrays
 * - Storing values in arrays
 * - Using loops with arrays
 * - Displaying array contents
 */
public class FuelPriceTracker {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Store fuel prices for 7 days
        double[] fuelPrices = new double[7];

        // Collect fuel prices
        for (int i = 0; i < fuelPrices.length; i++) {

            System.out.println("Enter fuel price for Day " + (i + 1) + ":");

            fuelPrices[i] = input.nextDouble();
        }

        // Display all fuel prices
        System.out.println("===========================");
        System.out.println("FUEL PRICE REPORT");
        System.out.println("===========================");

        for (double price : fuelPrices) {
            System.out.println(price);
        }

        System.out.println("===========================");
        System.out.println("Number of Prices Entered: " + fuelPrices.length);
        System.out.println("===========================");

        // Close Scanner
        input.close();
    }
}