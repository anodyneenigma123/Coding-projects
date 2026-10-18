import java.util.List;

/**
 * Java Learning Journey
 * Stage: The static Keyword
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Static fields
 * - Static methods
 * - Static constants
 * - Instance fields
 * - Instance methods
 * - Object counting
 * - Encapsulation
 * - Constructors
 * - Lists and enhanced for loops
 *
 * Learning Goal:
 * Understand the difference between members that belong
 * to the entire class and members that belong to individual objects.
 */
public class UserRegistrationCounter {

    static class User {

        // This constant belongs to the entire User class
        public static final String APPLICATION_NAME =
                "CodeQuest Registration Platform";

        // This counter is shared by all User objects
        private static int numberOfUsers = 0;

        // These fields belong to each individual User object
        private String fullName;
        private String email;
        private String phoneNumber;

        /**
         * Creates a new user and increases the shared user counter.
         *
         * @param fullName    the user's full name
         * @param email       the user's email address
         * @param phoneNumber the user's phone number
         */
        User(
                String fullName,
                String email,
                String phoneNumber
        ) {
            this.fullName = fullName;
            this.email = email;
            this.phoneNumber = phoneNumber;

            numberOfUsers++;
        }

        // Instance getter for the user's full name
        public String getFullName() {
            return fullName;
        }

        // Instance getter for the user's email
        public String getEmail() {
            return email;
        }

        // Instance getter for the user's phone number
        public String getPhoneNumber() {
            return phoneNumber;
        }

        // Static method that returns the shared user count
        public static int getNumberOfUsers() {
            return numberOfUsers;
        }

        // Instance method that displays this particular user's details
        public void displayInformation(int userNumber) {

            System.out.println(
                    "User " + userNumber + "'s Full Name: "
                            + getFullName()
            );

            System.out.println(
                    "User " + userNumber + "'s Email: "
                            + getEmail()
            );

            System.out.println(
                    "User " + userNumber + "'s Phone Number: "
                            + getPhoneNumber()
            );

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create three User objects
        List<User> users = List.of(
                new User(
                        "Bernard",
                        "kwarteng@gmail.com",
                        "0204141553"
                ),
                new User(
                        "Eugene",
                        "eugene@gmail.com",
                        "0298382838"
                ),
                new User(
                        "Emma",
                        "emma@gmail.com",
                        "0348349383"
                )
        );

        // Access the static constant using the class name
        System.out.println("=================================");
        System.out.println(User.APPLICATION_NAME);
        System.out.println("=================================");
        System.out.println();

        // Call the instance method on each User object
        int userNumber = 1;

        for (User user : users) {
            user.displayInformation(userNumber);
            userNumber++;
        }

        // Access the static counter using the class name
        System.out.println("=================================");
        System.out.println(
                "Total Registered Users: "
                        + User.getNumberOfUsers()
        );
        System.out.println("=================================");
    }
}