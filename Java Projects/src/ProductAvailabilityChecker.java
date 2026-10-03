import java.util.Optional;

/**
 * Java Learning Journey
 * Stage: Optional
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Optional
 * - Optional.of()
 * - Optional.empty()
 * - ifPresent()
 * - orElse()
 * - Method References
 *
 * Learning Goal:
 * Learn how to safely handle missing values
 * without using null directly.
 */
public class ProductAvailabilityChecker {

    public static void main(String[] args) {

        // Product available
        Optional<String> product =
                Optional.of("Laptop");

        System.out.println("========================");
        System.out.println("AVAILABLE PRODUCT");
        System.out.println("========================");
        System.out.println();

        product.ifPresent(System.out::println);

        System.out.println();

        // Product unavailable
        Optional<String> unavailableProduct =
                Optional.empty();

        System.out.println("========================");
        System.out.println("UNAVAILABLE PRODUCT");
        System.out.println("========================");
        System.out.println();

        System.out.println(
                unavailableProduct.orElse("Product Not Found")
        );

        System.out.println();
        System.out.println("========================");
    }
}