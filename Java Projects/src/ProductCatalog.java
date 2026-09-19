import java.util.HashMap;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: HashMap
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - HashMap
 * - Key-Value Pairs
 * - Scanner
 * - Loops
 * - Collections Framework
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
 * 14. Classes and Objects
 * 15. Constructors
 * 16. Encapsulation
 * 17. Inheritance
 * 18. Polymorphism
 * 19. Abstraction
 * 20. Interfaces
 */
public class ProductCatalog {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Store product ID and product name
        HashMap<Integer, String> productCatalog = new HashMap<>();

        // Ask how many products will be entered
        System.out.println("How many products do you want to enter?");
        int numberOfProducts = input.nextInt();

        // Collect product information
        for (int i = 0; i < numberOfProducts; i++) {

            System.out.println("Enter the ID of product " + (i + 1) + ":");
            int productID = input.nextInt();

            // Clear the input buffer
            input.nextLine();

            System.out.println("Enter the name of product " + (i + 1) + ":");
            String productName = input.nextLine();

            // Store product in the HashMap
            productCatalog.put(productID, productName);
        }

        // Display product catalog
        System.out.println("===========================");
        System.out.println("PRODUCT CATALOG");
        System.out.println("===========================");

        for (Integer productID : productCatalog.keySet()) {

            System.out.println(
                    productID + " ---> " +
                            productCatalog.get(productID)
            );
        }

        // Display total number of products
        System.out.println();
        System.out.println(
                "Total Number of Products: "
                        + productCatalog.size()
        );

        System.out.println("===========================");

        // Close Scanner
        input.close();
    }
}