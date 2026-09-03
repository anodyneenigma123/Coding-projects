import java.util.Scanner;

/**
 * Fuel Station Bill Calculator
 * Author: Bernard Nana Kwarteng
 * Concept: Operators
 */
public class FuelStationBillCalculator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Collect customer information
        System.out.println("What is your name:");
        String customerName = input.nextLine();

        // Collect fuel price per litre
        System.out.println("Enter fuel price per litre:");
        double fuelPrice = input.nextDouble();

        // Collect litres purchased
        System.out.println("How many litres of fuel did you purchase:");
        double litresPurchased = input.nextDouble();

        // Calculate total bill amount
        double totalCost = fuelPrice * litresPurchased;

        // Display receipt header
        System.out.println("=========================");
        System.out.println("FUEL STATION BILL");
        System.out.println("=========================");

        // Display customer and purchase details
        System.out.println("Customer Name: " + customerName);
        System.out.println("Fuel Price: " + fuelPrice);
        System.out.println("Litres Purchased: " + litresPurchased);
        System.out.println("Total Amount: " + totalCost);

        // Display receipt footer
        System.out.println("=========================");

        // Close scanner
        input.close();
    }
}