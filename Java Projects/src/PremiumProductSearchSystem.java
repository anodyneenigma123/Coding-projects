import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java Learning Journey
 * Stage: Streams - Stream Chaining
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Streams
 * - filter()
 * - map()
 * - sorted()
 * - collect()
 * - Lambda Expressions
 *
 * Learning Goal:
 * Learn how to chain multiple Stream operations
 * together in a single pipeline.
 */
public class PremiumProductSearchSystem {

    public static void main(String[] args) {

        // Create product list
        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Phone");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Microphone");
        products.add("Keyboard");

        // Display all products
        System.out.println("======================");
        System.out.println("ALL PRODUCTS");
        System.out.println("======================");

        products.forEach(product ->
                System.out.println(product));

        System.out.println();

        // Stream chain
        List<String> premiumSearchResults = products.stream()
                .filter(product ->
                        product.startsWith("M"))
                .map(product ->
                        product.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        // Display results
        System.out.println("=========================");
        System.out.println("PREMIUM SEARCH RESULTS");
        System.out.println("=========================");

        premiumSearchResults.forEach(product ->
                System.out.println(product));

        System.out.println();
        System.out.println("=========================");
    }
}