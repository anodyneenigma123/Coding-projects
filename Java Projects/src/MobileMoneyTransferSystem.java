import java.util.Scanner;

/**
 * Mobile Money Transfer System
 * Author: Bernard Nana Kwarteng
 * Concept: User Input (Scanner)
 */
public class MobileMoneyTransferSystem {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Get sender's name
        System.out.println("Enter sender's name:");
        String senName = input.nextLine();

        // Get recipient's name
        System.out.println("Enter recipient's name:");
        String recName = input.nextLine();

        // Get recipient's phone number
        System.out.println("Enter recipient phone number:");
        int p_number = input.nextInt();

        // Get transfer amount
        System.out.println("Enter amount:");
        double amount = input.nextDouble();

        // Get transaction approval status
        System.out.println("Proceed with transaction? (true/false)");
        boolean option = input.nextBoolean();

        // Display receipt header
        System.out.println("===========================");
        System.out.println("MOBILE MONEY RECEIPT");
        System.out.println("===========================");

        // Display transaction details
        System.out.println("Sender: " + senName);
        System.out.println("Recipient: " + recName);
        System.out.println("Phone: " + p_number);
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Approved: " + option);

        // Display receipt footer
        System.out.println("===========================");

        // Close the scanner
        input.close();
    }
}