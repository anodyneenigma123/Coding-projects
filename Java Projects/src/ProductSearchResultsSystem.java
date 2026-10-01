import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java Learning Journey
 * Stage: Streams - collect()
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Streams
 * - Lambda Expressions
 * - filter()
 * - collect()
 *
 * Learning Goal:
 * Learn how to store filtered Stream results
 * in a new collection.
 */
public class ProductSearchResultsSystem {

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
        System.out.println("=========================");
        System.out.println("ALL PRODUCTS");
        System.out.println("=========================");

        products.forEach(product ->
                System.out.println(product));

        System.out.println();

        // Filter and collect products starting with M
        List<String> searchResults = products.stream()
                .filter(product ->
                        product.startsWith("M"))
                .collect(Collectors.toList());

        // Display search results
        System.out.println("=========================");
        System.out.println("SEARCH RESULTS");
        System.out.println("=========================");

        searchResults.forEach(product ->
                System.out.println(product));

        System.out.println();

        System.out.println("=========================");
        System.out.println("Products Found: "
                + searchResults.size());
        System.out.println("=========================");
    }
}