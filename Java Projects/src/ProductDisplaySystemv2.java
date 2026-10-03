import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Method References
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Streams
 * - map()
 * - Method References
 * - Lambda Expressions
 *
 * Learning Goal:
 * Learn how to replace simple lambda expressions
 * with cleaner method references.
 */
class ProductDisplaySystemV2 {

    public static void main(String[] args) {

        // Create product list
        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Phone");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Keyboard");

        // Display original products
        System.out.println("=========================");
        System.out.println("ALL PRODUCTS");
        System.out.println("=========================");

        products.forEach(System.out::println);

        System.out.println();

        // Display uppercase products
        System.out.println("=========================");
        System.out.println("UPPERCASE PRODUCTS");
        System.out.println("=========================");

        products.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("=========================");
    }
}