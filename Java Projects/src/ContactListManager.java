import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: ArrayList
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Creating an ArrayList
 * - Storing multiple values dynamically
 * - Using loops with ArrayLists
 * - Collecting user input using Scanner
 * - Displaying stored data
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
 */
public class ContactListManager {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask how many contacts the user wants to save
        System.out.println("How many contacts do you want to save?");
        int numberOfContacts = input.nextInt();

        // Clear the leftover Enter key from the input buffer
        input.nextLine();

        // Create an ArrayList to store contact names
        ArrayList<String> contactList = new ArrayList<>();

        // Collect contact names
        for (int i = 0; i < numberOfContacts; i++) {

            System.out.println("Enter contact " + (i + 1) + ":");

            String contactName = input.nextLine();

            contactList.add(contactName);
        }

        // Display report header
        System.out.println("===========================");
        System.out.println("CONTACT LIST MANAGER");
        System.out.println("===========================");

        // Display all saved contacts
        System.out.println("Saved Contacts:");

        for (String contact : contactList) {
            System.out.println(contact);
        }

        // Display total number of contacts
        System.out.println("===========================");
        System.out.println("Total Contacts: " + contactList.size());
        System.out.println("===========================");

        // Close Scanner
        input.close();
    }
}