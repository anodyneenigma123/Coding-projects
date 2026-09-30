import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Streams
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Lambda Expressions
 * - Streams
 * - filter()
 * - forEach()
 *
 * Learning Goal:
 * Learn how to process collections using Java Streams.
 */
public class ProductFilterSystem {

    public static void main(String[] args) {

        // Create product list
        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Phone");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Microphone");

        // Display all products
        System.out.println("=====================");
        System.out.println("ALL PRODUCTS");
        System.out.println("=====================");

        products.forEach(product ->
                System.out.println(product));

        System.out.println();

        // Display products starting with M
        System.out.println("==============================");
        System.out.println("PRODUCTS STARTING WITH M");
        System.out.println("==============================");

        products.stream()
                .filter(product ->
                        product.startsWith("M"))
                .forEach(product ->
                        System.out.println(product));

        System.out.println("==============================");
    }
}