import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Abstraction
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Abstract classes
 * - Abstract methods
 * - Encapsulation
 * - Inheritance
 * - Polymorphism
 * - ArrayList
 * - Loops
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
 * 16. Polymorphism
 * 17. Abstraction
 */
public class DeliveryPlatform {

    // Abstract parent class
    static abstract class User {

        private String fullName;
        private String email;
        private String phoneNumber;

        // Constructor
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

        // Abstract method
        public abstract void displayRole();
    }

    // Customer role
    static class Customer extends User {

        Customer(String fullName, String email, String phoneNumber) {
            super(fullName, email, phoneNumber);
        }

        @Override
        public void displayRole() {
            System.out.println("Customer");
        }
    }

    // Vendor role
    static class Vendor extends User {

        Vendor(String fullName, String email, String phoneNumber) {
            super(fullName, email, phoneNumber);
        }

        @Override
        public void displayRole() {
            System.out.println("Vendor");
        }
    }

    // Admin role
    static class Admin extends User {

        Admin(String fullName, String email, String phoneNumber) {
            super(fullName, email, phoneNumber);
        }

        @Override
        public void displayRole() {
            System.out.println("Admin");
        }
    }

    public static void main(String[] args) {

        // Create users
        Customer customer1 = new Customer(
                "Bernard Kwarteng",
                "kwarteng24@gmail.com",
                "0204141553");

        Vendor vendor1 = new Vendor(
                "Ama",
                "amaburland23@gmail.com",
                "020356478");

        Admin admin1 = new Admin(
                "Kofi",
                "kofibabone@gmail.com",
                "01732772727");

        // Store users using polymorphism
        ArrayList<User> jobRoles = new ArrayList<>();

        jobRoles.add(customer1);
        jobRoles.add(vendor1);
        jobRoles.add(admin1);

        // Display user details
        System.out.println("========================");
        System.out.println("DELIVERY PLATFORM USERS");
        System.out.println("========================");

        for (User role : jobRoles) {

            role.displayRole();

            System.out.println("Name: " + role.getFullName());
            System.out.println("Email: " + role.getEmail());
            System.out.println("Phone: " + role.getPhoneNumber());

            System.out.println();
        }
    }
}