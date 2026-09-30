import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Streams - map()
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - ArrayList
 * - Lambda Expressions
 * - Streams
 * - map()
 * - forEach()
 *
 * Learning Goal:
 * Learn how to transform data using Java Streams.
 */
public class ProductNameTransformer {

    public static void main(String[] args) {

        // Create product list
        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Phone");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Keyboard");

        // Display original products
        System.out.println("======================");
        System.out.println("ORIGINAL PRODUCTS");
        System.out.println("======================");

        products.forEach(product ->
                System.out.println(product));

        System.out.println();

        // Transform and display products in uppercase
        System.out.println("======================");
        System.out.println("UPPERCASE PRODUCTS");
        System.out.println("======================");

        products.stream()
                .map(product -> product.toUpperCase())
                .forEach(product ->
                        System.out.println(product));

        System.out.println();

        System.out.println("======================");
    }
}