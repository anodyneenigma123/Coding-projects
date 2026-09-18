import java.util.HashSet;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: HashSet
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - HashSet
 * - Collections Framework
 * - Loops
 * - Scanner
 * - Unique data storage
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
 * 12. OOP Concepts
 * 13. Interfaces
 * 14. HashSet
 */
public class UserRegistrationChecker {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Store unique usernames
        HashSet<String> usernames = new HashSet<>();

        // Ask how many usernames will be entered
        System.out.println("How many usernames do you want to enter?");
        int numberOfUsers = input.nextInt();

        // Clear the input buffer
        input.nextLine();

        // Collect usernames from the user
        for (int i = 0; i < numberOfUsers; i++) {

            System.out.println("Enter username " + (i + 1) + ":");

            String username = input.nextLine();

            usernames.add(username);
        }

        // Display registration report
        System.out.println("=============================");
        System.out.println("USER REGISTRATION CHECKER");
        System.out.println("=============================");

        System.out.println("Unique Usernames:");

        for (String username : usernames) {
            System.out.println(username);
        }

        System.out.println("=============================");
        System.out.println("Total Unique Usernames: " + usernames.size());
        System.out.println("=============================");

        // Close the Scanner
        input.close();
    }
}