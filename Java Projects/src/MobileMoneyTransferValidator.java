import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: Exception Handling
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Exception Handling
 * - try-catch blocks
 * - Scanner
 * - Input validation
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
 * 9. Methods
 * 10. Arrays
 * 11. ArrayList
 * 12. HashSet
 * 13. HashMap
 * 14. Classes & Objects
 * 15. Constructors
 * 16. Encapsulation
 * 17. Inheritance
 * 18. Polymorphism
 * 19. Abstraction
 * 20. Interfaces
 * 21. Exception Handling
 */
public class MobileMoneyTransferValidator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        try {

            // Collect sender information
            System.out.println("Enter sender name:");
            String senderName = input.nextLine();

            // Collect transfer amount
            System.out.println("Enter transfer amount:");
            double transferAmount = input.nextDouble();

            // Display receipt
            System.out.println("============================");
            System.out.println("MOBILE MONEY RECEIPT");
            System.out.println("============================");
            System.out.println("Sender: " + senderName);
            System.out.println("Amount: " + transferAmount);
            System.out.println("Status: Transfer Ready");
            System.out.println("============================");

        }
        catch (InputMismatchException e) {

            System.out.println("Invalid input entered.");
            System.out.println("Enter a valid input ");

        }
        finally {

            // Close Scanner
            input.close();

            System.out.println("Program finished.");

        }
    }
}