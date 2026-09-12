/**
 * Java Learning Journey
 * Stage: Constructors
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Creating a class
 * - Creating objects
 * - Using constructors
 * - Initializing object data during creation
 * - Using the 'this' keyword
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
 * 13. Constructors
 */
public class BankAccountRegistrationSystem {

    // Blueprint for a bank account
    static class BankAccount {

        String accountHolderName;
        String accountNumber;
        double balance;

        // Constructor used to initialize account data
        BankAccount(String accountHolderName,
                    String accountNumber,
                    double balance) {

            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {

        // Create bank account objects using the constructor
        BankAccount acc1 =
                new BankAccount("Bernard", "08478383", 240.67);

        BankAccount acc2 =
                new BankAccount("Lydia", "36373888", 453.47);

        // Display account information
        System.out.println("=========================");
        System.out.println("ACCOUNT INFORMATION");
        System.out.println("=========================");

        System.out.println("Account One");

        System.out.println("Name: " + acc1.accountHolderName);
        System.out.println("Account Number: " + acc1.accountNumber);
        System.out.println("Account Balance: " + acc1.balance);

        System.out.println();

        System.out.println("Account Two");

        System.out.println("Name: " + acc2.accountHolderName);
        System.out.println("Account Number: " + acc2.accountNumber);
        System.out.println("Account Balance: " + acc2.balance);

        System.out.println("=========================");
    }
}
