/**
 * Java Learning Journey
 * Stage: Inheritance
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Encapsulation
 * - Constructors
 * - Getters and Setters
 * - Inheritance
 * - The super() keyword
 * - Classes and Objects
 *
 * Concepts Learned So Far:
 * 1. Output
 * 2. Comments
 * 3. Variables
 * 4. Data Types
 * 5. User Input (Scanner)
 * 6. Operators
 * 7. Conditional Statements
 * 8. Loops
 * 9. Methods
 * 10. Arrays
 * 11. ArrayList
 * 12. Classes and Objects
 * 13. Constructors
 * 14. Encapsulation
 * 15. Inheritance
 */
public class FoodDeliveryUserManagement {

    // Parent class
    static class User {

        private String fullName;
        private String email;
        private String phoneNumber;

        // Constructor for User
        User(String fullName, String email, String phoneNumber) {
            this.fullName = fullName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters
        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    // Customer class inherits from User
    static class Customer extends User {

        private String deliveryAddress;

        Customer(String fullName,
                 String email,
                 String phoneNumber,
                 String deliveryAddress) {

            super(fullName, email, phoneNumber);

            this.deliveryAddress = deliveryAddress;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }
    }

    // Vendor class inherits from User
    static class Vendor extends User {

        private String shopName;

        Vendor(String fullName,
               String email,
               String phoneNumber,
               String shopName) {

            super(fullName, email, phoneNumber);

            this.shopName = shopName;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }
    }

    public static void main(String[] args) {

        // Create customer object
        Customer customer1 = new Customer(
                "Bernard Kwarteng",
                "kwartengbernard25@gmail.com",
                "0204141553",
                "PJ 21 Beaton Street");

        // Create vendor object
        Vendor vendor1 = new Vendor(
                "Veronica Adanuty",
                "verob@gmail.com",
                "0203546758",
                "Yawa's Pizza");

        // Display customer information
        System.out.println("==========================");
        System.out.println("CUSTOMER PROFILE");
        System.out.println("==========================");

        System.out.println("Full Name: " + customer1.getFullName());
        System.out.println("Email: " + customer1.getEmail());
        System.out.println("Phone Number: " + customer1.getPhoneNumber());
        System.out.println("Delivery Address: " + customer1.getDeliveryAddress());

        System.out.println();

        // Display vendor information
        System.out.println("==========================");
        System.out.println("VENDOR PROFILE");
        System.out.println("==========================");

        System.out.println("Full Name: " + vendor1.getFullName());
        System.out.println("Email: " + vendor1.getEmail());
        System.out.println("Phone Number: " + vendor1.getPhoneNumber());
        System.out.println("Shop Name: " + vendor1.getShopName());

        System.out.println("==========================");
    }
}