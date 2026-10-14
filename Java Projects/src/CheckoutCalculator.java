import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Java Learning Journey
 * Stage: BigDecimal and Custom Exception Throwing
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Precise financial calculations with BigDecimal
 * - Immediate input validation
 * - Manually throwing exceptions
 * - Handling different exception types
 * - Scanner input
 * - Conditional statements
 *
 * Learning Goal:
 * Learn how to calculate monetary values accurately
 * and stop program execution when invalid data is entered.
 */
public class CheckoutCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Collect customer name
            System.out.println("Enter your name:");
            String customerName = input.nextLine();

            // Collect product name
            System.out.println("Enter the product name:");
            String productName = input.nextLine();

            // Collect and immediately validate the product price
            System.out.println("Enter the product price:");
            BigDecimal productPrice = input.nextBigDecimal();

            if (productPrice.compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException(
                        "Product price cannot be negative."
                );
            }

            // Collect and immediately validate the quantity
            System.out.println("Enter the quantity being purchased:");
            int quantity = input.nextInt();

            if (quantity < 1) {
                throw new IllegalArgumentException(
                        "Quantity must be at least 1."
                );
            }

            // Collect and immediately validate the discount percentage
            System.out.println("Enter the discount percentage:");
            BigDecimal discountPercentage =
                    input.nextBigDecimal();

            BigDecimal maximumDiscount =
                    new BigDecimal("100");

            if (discountPercentage.compareTo(BigDecimal.ZERO) < 0
                    || discountPercentage.compareTo(maximumDiscount) > 0) {

                throw new IllegalArgumentException(
                        "Discount percentage must be between 0 and 100."
                );
            }

            // Calculate the subtotal
            BigDecimal subtotal =
                    productPrice.multiply(
                            BigDecimal.valueOf(quantity)
                    );

            // Calculate the discount amount
            BigDecimal discountAmount =
                    subtotal.multiply(discountPercentage)
                            .divide(
                                    maximumDiscount,
                                    2,
                                    RoundingMode.HALF_UP
                            );

            // Calculate the final amount
            BigDecimal finalAmount =
                    subtotal.subtract(discountAmount);

            // Format all monetary values to two decimal places
            BigDecimal formattedProductPrice =
                    productPrice.setScale(
                            2,
                            RoundingMode.HALF_UP
                    );

            BigDecimal formattedSubtotal =
                    subtotal.setScale(
                            2,
                            RoundingMode.HALF_UP
                    );

            BigDecimal formattedDiscountAmount =
                    discountAmount.setScale(
                            2,
                            RoundingMode.HALF_UP
                    );

            BigDecimal formattedFinalAmount =
                    finalAmount.setScale(
                            2,
                            RoundingMode.HALF_UP
                    );

            // Display the checkout receipt
            System.out.println();
            System.out.println("=================================");
            System.out.println("        CHECKOUT RECEIPT");
            System.out.println("=================================");
            System.out.println();

            System.out.println("Customer Name: " + customerName);
            System.out.println("Product Name: " + productName);
            System.out.println("Unit Price: " + formattedProductPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("Subtotal: " + formattedSubtotal);

            System.out.println(
                    "Discount Percentage: "
                            + discountPercentage + "%"
            );

            System.out.println(
                    "Discount Amount: "
                            + formattedDiscountAmount
            );

            System.out.println(
                    "Final Amount: "
                            + formattedFinalAmount
            );

            System.out.println();
            System.out.println("=================================");

        } catch (InputMismatchException e) {

            // Handles text entered where a number was expected
            System.out.println();
            System.out.println(
                    "Error: Please enter a valid numerical value."
            );

        } catch (IllegalArgumentException e) {

            // Handles values that break the program's rules
            System.out.println();
            System.out.println(
                    "Error: " + e.getMessage()
            );

        } finally {

            // Always runs whether the program succeeds or fails
            input.close();

            System.out.println();
            System.out.println("Program finished.");
        }
    }
}