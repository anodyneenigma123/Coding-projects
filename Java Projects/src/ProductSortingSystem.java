import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Streams - sorted()
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Streams
 * - Lambda Expressions
 * - sorted()
 * - forEach()
 *
 * Learning Goal:
 * Learn how to sort collection data using Java Streams.
 */
public class ProductSortingSystem {

    public static void main(String[] args) {

        // Create product list
        ArrayList<String> products = new ArrayList<>();

        products.add("Mouse");
        products.add("Laptop");
        products.add("Keyboard");
        products.add("Phone");
        products.add("Monitor");

        // Display original products
        System.out.println("========================");
        System.out.println("ORIGINAL PRODUCTS");
        System.out.println("========================");

        products.forEach(product ->
                System.out.println(product));

        System.out.println();

        // Display sorted products
        System.out.println("========================");
        System.out.println("SORTED PRODUCTS");
        System.out.println("========================");

        products.stream()
                .sorted()
                .forEach(product ->
                        System.out.println(product));

        System.out.println();
        System.out.println("========================");
    }
}