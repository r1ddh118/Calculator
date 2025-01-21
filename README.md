# Calculator Program

A beginner-friendly Java program that provides various mathematical operations and functions. This program is structured into three files for modularity: `Main.java`, `Calculator.java`, and `UserInput.java`.

---

## Features

The calculator supports the following operations:
1. Addition of two numbers
2. Subtraction of two numbers
3. Multiplication of two numbers
4. Division of two numbers (with error handling for division by zero)
5. Fibonacci sequence generation up to a given number of terms
6. Calculation of the mean (average) of an array
7. Calculation of the mode of an array

---

## File Structure

### 1. `Calculator.java`
Contains the core logic for mathematical operations:
- Addition, Subtraction, Multiplication, Division
- Fibonacci sequence generation
- Calculation of mean and mode

### 2. `UserInput.java`
Handles all user interactions:
- Input of two numbers or an array
- Menu selection and routing to the appropriate mathematical operation

### 3. `Main.java`
The entry point of the program:
- Initializes the program and calls methods in `UserInput.java`.
