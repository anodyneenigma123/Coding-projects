/**
 * Student Report Card Program
 * Author: Bernard Nana Kwarteng
 * Concept: Java Data Types
 */
public class StudentReportCardProgram {

    public static void main(String[] args) {

        // Store the student's name
        String name = "Bernard";

        // Store the student's age
        int age = 18;

        // Store the student's average score
        double avgScore = 91.4;

        // Store the student's grade
        char grade = 'A';

        // Store the student's pass status
        boolean passStatus = true;

        // Display report card header
        System.out.println("==================");
        System.out.println(" STUDENT REPORT CARD");
        System.out.println("==================");

        // Display student information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average score: " + avgScore);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passStatus);

        // Display report card footer
        System.out.println("==================");
    }
}