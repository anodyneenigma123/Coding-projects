import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Polymorphism & Interfaces
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Interfaces
 * - Method overriding
 * - Polymorphism
 * - ArrayList of interface types
 * - Dynamic method dispatch
 */
public class PaymentGatewaySystem {

    // Payment contract
    interface PaymentMethod {

        void processPayment();
    }

    // Mobile Money Payment
    static class MobileMoneyPayment implements PaymentMethod {

        @Override
        public void processPayment() {
            System.out.println("Processing Mobile Money Payment");
        }
    }

    // Card Payment
    static class CardPayment implements PaymentMethod {

        @Override
        public void processPayment() {
            System.out.println("Processing Card Payment");
        }
    }

    // Cash Payment
    static class CashPayment implements PaymentMethod {

        @Override
        public void processPayment() {
            System.out.println("Processing Cash Payment");
        }
    }

    public static void main(String[] args) {

        // Create payment objects
        PaymentMethod momo = new MobileMoneyPayment();
        PaymentMethod card = new CardPayment();
        PaymentMethod cash = new CashPayment();

        // Store different payment types in one list
        ArrayList<PaymentMethod> paymentMethods = new ArrayList<>();

        paymentMethods.add(momo);
        paymentMethods.add(card);
        paymentMethods.add(cash);

        System.out.println("============================");
        System.out.println("PAYMENT GATEWAY SYSTEM");
        System.out.println("============================");

        // Process all payments
        for (PaymentMethod method : paymentMethods) {
            method.processPayment();
        }

        System.out.println("============================");
    }
}