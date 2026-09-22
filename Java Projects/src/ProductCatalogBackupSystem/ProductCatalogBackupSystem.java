package ProductCatalogBackupSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: File Handling
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - HashMap
 * - File Handling
 * - Scanner
 * - Loops
 * - Exception Handling
 * - Collections Framework
 */
public class ProductCatalogBackupSystem {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Store Product ID -> Product Name
        HashMap<Integer, String> productCatalog = new HashMap<>();

        // Ask user how many products to enter
        System.out.println("How many products do you want to enter?");
        int numberOfProducts = input.nextInt();

        // Collect product information
        for (int i = 0; i < numberOfProducts; i++) {

            System.out.println("Enter Product " + (i + 1) + " ID:");
            int productId = input.nextInt();

            input.nextLine(); // Clear buffer

            System.out.println("Enter Product " + (i + 1) + " Name:");
            String productName = input.nextLine();

            productCatalog.put(productId, productName);
        }

        // File location
        File file = new File(
                "src/ProductCatalogBackupSystem/products.txt"
        );

        // Write products to file
        try {

            FileWriter writer = new FileWriter(file);

            for (Integer productId : productCatalog.keySet()) {

                writer.write(
                        productId + "," +
                                productCatalog.get(productId) +
                                "\n"
                );
            }

            writer.close();

            System.out.println("Products saved successfully.");

        } catch (IOException e) {

            System.out.println("Error writing file.");
        }

        // Read products from file
        try {

            Scanner reader = new Scanner(file);

            System.out.println();
            System.out.println("============================");
            System.out.println("PRODUCT CATALOG BACKUP");
            System.out.println("============================");

            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                System.out.println(line);
            }

            System.out.println("============================");
            System.out.println(
                    "Total Products Saved: "
                            + productCatalog.size()
            );
            System.out.println("============================");

            reader.close();

        } catch (IOException e) {

            System.out.println("Error reading file.");
        }

        // Close keyboard scanner
        input.close();
    }
}