/**
 * Java Learning Journey
 * Stage: Encapsulation
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Private fields
 * - Constructors
 * - Getters and setters
 * - Data validation
 * - Object creation
 *
 * Concepts Learned So Far:
 * 1. Output
 * 2. Comments
 * 3. Variables
 * 4. Data Types
 * 5. User Input
 * 6. Operators
 * 7. Conditional Statements
 * 8. Loops
 * 9. Methods
 * 10. Arrays
 * 11. ArrayList
 * 12. Classes & Objects
 * 13. Constructors
 * 14. Encapsulation
 */
public class UserRegistrationSystem {

    static class User {

        private String fullName;
        private String email;
        private String phoneNumber;
        private String password;

        // Constructor
        User(String fullName, String email, String phoneNumber, String password) {
            this.fullName = fullName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            setPassword(password);
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {

            if (password.length() >= 8) {
                this.password = password;
            } else {
                System.out.println("Password must be at least 8 characters.");
            }
        }
    }

    public static void main(String[] args) {

        // Create user accounts
        User user1 = new User(
                "Bernard Kwarteng",
                "bn@gmail.com",
                "0204141553",
                "C5renugma145.3");

        User user2 = new User(
                "Jared",
                "frionmic@gmail.com",
                "02273737373",
                ":WahkiVanHorst23.7");

        // Update password through setter
        user2.setPassword("RenugueVanHorst");

        // Display first user information
        System.out.println("=======================");
        System.out.println("USER ONE INFO");
        System.out.println("=======================");

        System.out.println("Full Name: " + user1.getFullName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Phone Number: " + user1.getPhoneNumber());

        // Display second user information
        System.out.println("=======================");
        System.out.println("USER TWO INFO");
        System.out.println("=======================");

        System.out.println("Full Name: " + user2.getFullName());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("Phone Number: " + user2.getPhoneNumber());

        System.out.println("=======================");
    }
}