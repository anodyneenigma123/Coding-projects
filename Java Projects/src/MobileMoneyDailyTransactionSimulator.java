import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: Loops
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Using a for loop
 * - Repeating user input operations
 * - Accumulating values using +=
 * - Generating a transaction report
 *
 * Concepts Learned So Far:
 * 1. Output
 * 2. Comments
 * 3. Variables
 * 4. Data Types
 * 5. User Input (Scanner)
 * 6. Operators
 * 7. Conditional Statements
 * 8. Loops
 */
public class MobileMoneyDailyTransactionSimulator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Store the total transaction amount
        double totalAmount = 0;

        // Ask the user how many transactions will be entered
        System.out.println("How many transactions do you want to enter?");
        int numberOfTransactions = input.nextInt();

        // Collect transaction amounts and add them to the running total
        for (int i = 1; i <= numberOfTransactions; i++) {
            System.out.println("Enter amount for transaction " + i + ":");
            double transactionAmount = input.nextDouble();

            totalAmount += transactionAmount;
        }

        // Display daily transaction report
        System.out.println("==============================");
        System.out.println("DAILY TRANSACTION REPORT");
        System.out.println("==============================");
        System.out.println("Number of Transactions: " + numberOfTransactions);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("==============================");

        // Close the Scanner
        input.close();
    }
}