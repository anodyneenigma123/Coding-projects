import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: Lambda Expressions
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Enhanced For Loop
 * - Lambda Expressions
 * - Collections
 *
 * Learning Goal:
 * Compare the traditional loop approach
 * with the modern lambda approach.
 */
public class ProductDisplaySystem {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Store product names
        ArrayList<String> products = new ArrayList<>();

        // Ask user how many products to enter
        System.out.println("How many products do you want to enter?");
        int numberOfProducts = input.nextInt();

        // Clear input buffer
        input.nextLine();

        // Collect products
        for (int i = 0; i < numberOfProducts; i++) {

            System.out.println(
                    "Enter Product " + (i + 1) + " Name:"
            );

            String productName = input.nextLine();

            products.add(productName);
        }

        // Display using traditional loop
        System.out.println();
        System.out.println("==============================");
        System.out.println("NORMAL LOOP");
        System.out.println("==============================");

        for (String product : products) {
            System.out.println(product);
        }

        // Display using lambda expression
        System.out.println();
        System.out.println("==============================");
        System.out.println("LAMBDA LOOP");
        System.out.println("==============================");

        products.forEach(product ->
                System.out.println(product));

        System.out.println("==============================");

        // Close Scanner
        input.close();
    }
}