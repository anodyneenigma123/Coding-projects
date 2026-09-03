/**
 * Variables Project
 * Learning Stage: Variables
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates how to:
 * 1. Declare variables
 * 2. Store information in variables
 * 3. Display variable values using concatenation
 *
 * Concepts Learned:
 * - String variables
 * - Variable naming conventions
 * - Printing variable values
 * - Basic code documentation
 */

public class StudentRegistrationSystem {

    public static void main(String[] args) {

        // Store student registration details
        String studentName = "Bernard";
        String course = "Java Programming";
        String studentId = "ST001";
        String school = "Java Academy";

        // Display registration header
        System.out.println("===========================");
        System.out.println("   STUDENT REGISTRATION");
        System.out.println("===========================");

        // Display student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentId);
        System.out.println("School: " + school);

        // Display registration status
        System.out.println("===========================");
        System.out.println("Registration Successful");
        System.out.println("===========================");
    }
}