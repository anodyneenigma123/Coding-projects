import java.util.Scanner;

/**
 * ATM Withdrawal Eligibility Checker
 * Author: Bernard Nana Kwarteng
 * Concept: Conditional Statements
 */
public class ATMWithdrawalEligibilityChecker {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Collect account holder information
        System.out.println("What is your name:");
        String name = input.nextLine();

        // Collect account balance
        System.out.println("What is your account balance:");
        double balance = input.nextDouble();

        // Collect withdrawal amount
        System.out.println("How much would you like to withdraw:");
        double withdrawalAmount = input.nextDouble();

        // Determine withdrawal status
        String decision;

        if (withdrawalAmount <= balance) {
            decision = "Withdrawal Approved";
        } else {
            decision = "Insufficient Funds";
        }

        // Display transaction receipt
        System.out.println("============================");
        System.out.println("ATM WITHDRAWAL RECEIPT");
        System.out.println("============================");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawalAmount);
        System.out.println("Decision: " + decision);
        System.out.println("============================");

        // Close scanner
        input.close();
    }
}