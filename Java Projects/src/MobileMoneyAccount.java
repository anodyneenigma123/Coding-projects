/**
 * Java Learning Journey
 * Stage: Classes and Objects
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Creating a class
 * - Creating objects from a class
 * - Storing data in object fields
 * - Accessing object data using dot notation
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
 * 12. Classes and Objects
 */
public class MobileMoneyAccount {

    // Blueprint for a mobile money account
    static class Account {

        String name;
        String phoneNumber;
        double balance;

    }

    public static void main(String[] args) {

        // Create two account objects
        Account account1 = new Account();
        Account account2 = new Account();

        // Set details for the first account
        account1.name = "Bernard";
        account1.phoneNumber = "0204141553";
        account1.balance = 120.45;

        // Set details for the second account
        account2.name = "Sandra";
        account2.phoneNumber = "0203445674";
        account2.balance = 234.47;

        // Display account information
        System.out.println("============================");
        System.out.println("ACCOUNT INFORMATION");
        System.out.println("============================");

        System.out.println();
        System.out.println("Account 1");

        System.out.println("Name: " + account1.name);
        System.out.println("Phone Number: " + account1.phoneNumber);
        System.out.println("Balance: " + account1.balance);

        System.out.println();
        System.out.println("Account 2");

        System.out.println("Name: " + account2.name);
        System.out.println("Phone Number: " + account2.phoneNumber);
        System.out.println("Balance: " + account2.balance);

        System.out.println("============================");
    }
}