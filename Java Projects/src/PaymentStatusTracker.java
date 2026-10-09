/**
 * Java Learning Journey
 * Stage: Enums
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Enums
 * - Switch Statements
 * - Type Safety
 * - Constants
 *
 * Learning Goal:
 * Learn how to use enums to represent
 * a fixed set of values safely.
 */
public class PaymentStatusTracker {

    // Enum declaration
    enum PaymentStatus {
        PENDING,
        SUCCESSFUL,
        FAILED
    }

    public static void main(String[] args) {

        // Create payment status
        PaymentStatus status = PaymentStatus.SUCCESSFUL;

        System.out.println("========================");
        System.out.println("PAYMENT STATUS TRACKER");
        System.out.println("========================");
        System.out.println();

        System.out.println("Payment Status: " + status);

        System.out.println();

        switch (status) {

            case PENDING:
                System.out.println("Waiting for payment...");
                break;

            case SUCCESSFUL:
                System.out.println("Payment completed successfully.");
                break;

            case FAILED:
                System.out.println("Payment failed.");
                break;
        }

        System.out.println();
        System.out.println("========================");
    }
}