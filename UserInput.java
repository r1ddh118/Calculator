import java.util.Scanner;

public class UserInput {

    // Method to input two numbers
    public int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2]; // Array to hold two numbers
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt(); // Input first number
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt(); // Input second number
        return numbers;
    }

    // Method to input an array
    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // Input array size
        int[] array = new int[size]; // Create an array of given size
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) { // Loop to input array elements
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Method to select and perform a calculation
    public void selectOperation() {
        Calculator calculator = new Calculator(); // Create an object of Calculator
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mean of Array");
        System.out.println("7. Mode of Array");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt(); // Get user choice

        // Perform the selected operation
        if (choice == 1) {
            int[] numbers = inputNumbers();
            System.out.println("Result: " + calculator.add(numbers[0], numbers[1]));
        } else if (choice == 2) {
            int[] numbers = inputNumbers();
            System.out.println("Result: " + calculator.subtract(numbers[0], numbers[1]));
        } else if (choice == 3) {
            int[] numbers = inputNumbers();
            System.out.println("Result: " + calculator.multiply(numbers[0], numbers[1]));
        } else if (choice == 4) {
            int[] numbers = inputNumbers();
            if (numbers[1] == 0) { // Check for division by zero
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println("Result: " + calculator.divide(numbers[0], numbers[1]));
            }
        } else if (choice == 5) {
            System.out.print("Enter the number of terms for the Fibonacci sequence: ");
            int terms = scanner.nextInt();
            int[] fibonacci = calculator.fibonacci(terms);
            System.out.print("Fibonacci Sequence: ");
            for (int num : fibonacci) { // Print Fibonacci sequence
                System.out.print(num + " ");
            }
            System.out.println();
        } else if (choice == 6) {
            int[] array = inputArray();
            System.out.println("Mean: " + calculator.mean(array));
        } else if (choice == 7) {
            int[] array = inputArray();
            System.out.println("Mode: " + calculator.mode(array));
        } else {
            System.out.println("Invalid choice. Please try again."); // Invalid choice handling
        }
    }
}

