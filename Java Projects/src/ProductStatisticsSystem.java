import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Streams - count()
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Streams
 * - Lambda Expressions
 * - filter()
 * - count()
 *
 * Learning Goal:
 * Learn how to count matching items in a collection using Java Streams.
 */
public class ProductStatisticsSystem {

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
        System.out.println("=======================");
        System.out.println("PRODUCT STATISTICS");
        System.out.println("=======================");

        System.out.println("ALL PRODUCTS");
        System.out.println("-----------------------");

        products.forEach(product ->
                System.out.println(product));

        System.out.println();

        // Count products starting with M
        long totalProductsStartingWithM = products.stream()
                .filter(product ->
                        product.startsWith("M"))
                .count();

        // Display statistics
        System.out.println("==============================");
        System.out.println("PRODUCTS STARTING WITH M");
        System.out.println("==============================");

        System.out.println(
                "Products Starting With M: "
                        + totalProductsStartingWithM
        );

        System.out.println("==============================");
    }
}