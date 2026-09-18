import java.util.ArrayList;

/**
 * Java Learning Journey
 * Stage: Polymorphism
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Inheritance
 * - Method overriding
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
 */
public class FoodDeliveryRoles {

    // Parent class
    static class User {

        public void displayRole() {
            System.out.println("User");
        }
    }

    // Customer role
    static class Customer extends User {

        @Override
        public void displayRole() {
            System.out.println("Customer User");
        }
    }

    // Vendor role
    static class Vendor extends User {

        @Override
        public void displayRole() {
            System.out.println("Vendor User");
        }
    }

    // Admin role
    static class Admin extends User {

        @Override
        public void displayRole() {
            System.out.println("Administrator User");
        }
    }

    public static void main(String[] args) {

        // Create objects using polymorphism
        User user1 = new Customer();
        User user2 = new Vendor();
        User user3 = new Admin();

        // Store all users in one ArrayList
        ArrayList<User> foodRoles = new ArrayList<>();

        foodRoles.add(user1);
        foodRoles.add(user2);
        foodRoles.add(user3);

        // Display all roles
        System.out.println("=========================");
        System.out.println("FOOD DELIVERY ROLES");
        System.out.println("=========================");

        for (User role : foodRoles) {
            role.displayRole();
        }

        System.out.println("=========================");
    }
}