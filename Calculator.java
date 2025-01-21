// Calculator.java

public class Calculator {

    // Addition of two numbers
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    // Subtraction of two numbers
    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    // Multiplication of two numbers
    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    // Division of two numbers
    public double divide(int firstNum, int secondNum) {
        if (secondNum == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 to indicate an error
        }
        return (double) firstNum / secondNum;
    }

    // Generate Fibonacci sequence up to n terms
    public int[] fibonacci(int n) {
        int[] sequence = new int[n];
        if (n > 0) sequence[0] = 0; // First term
        if (n > 1) sequence[1] = 1; // Second term
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }

    // Calculate mean of an array
    public double mean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Calculate mode of an array
    public int mode(int[] array) {
        int maxCount = 0;
        int mode = array[0];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        return mode;
    }
}


