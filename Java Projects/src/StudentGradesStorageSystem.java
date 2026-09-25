/**
 * Java Learning Journey
 * Stage: Generics
 * Author: Bernard Nana Kwarteng
 *
 * This project demonstrates:
 * - Generic Classes
 * - Type Safety
 * - Encapsulation
 * - Classes & Objects
 * - Code Reusability
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
 * 12. HashSet
 * 13. HashMap
 * 14. Classes & Objects
 * 15. Constructors
 * 16. Encapsulation
 * 17. Inheritance
 * 18. Polymorphism
 * 19. Abstraction
 * 20. Interfaces
 * 21. Exception Handling
 * 22. File Handling
 * 23. Generics
 */
public class StudentGradesStorageSystem {

    // Generic Storage Class
    static class Storage<T> {

        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {

        // Create storage objects for different data types
        Storage<String> studentNameStorage = new Storage<>();
        Storage<Integer> studentGradeStorage = new Storage<>();
        Storage<Double> studentAverageStorage = new Storage<>();

        // Store values
        studentNameStorage.setItem("Bernard Nana Kwarteng");
        studentGradeStorage.setItem(95);
        studentAverageStorage.setItem(87.50);

        // Display results
        System.out.println("================================");
        System.out.println("STUDENT GRADES STORAGE SYSTEM");
        System.out.println("================================");

        System.out.println("Student Name: "
                + studentNameStorage.getItem());

        System.out.println("Student Grade: "
                + studentGradeStorage.getItem());

        System.out.println("Student Average: "
                + studentAverageStorage.getItem());

        System.out.println("================================");
    }
}