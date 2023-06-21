## Recursive Power Calculation
This is a Java program that calculates the power of a number using a recursive method. The base and exponent values are obtained from the user.

# Getting Started
To run this program, follow these steps:

1. Ensure you have Java installed on your machine.
2. Download the RecursivePower.java file from this repository.
3. Open your command prompt or terminal.
4. Navigate to the directory where the RecursivePower.java file is located.
5. Compile the Java file by running the command: javac RecursivePower.java
6. Run the program with the command: java RecursivePower
# Usage
When the program is executed, it prompts the user to enter the base and exponent values. After entering the values, it calculates the power using the recursive method and displays the result on the console.
Taban değerini girin: 2
Üs değerini girin: 3
2 üzeri 3 = 8

# How it Works
The program uses a recursive method called power to calculate the power of a number. The method takes two parameters: the base value and the exponent value. It follows the following logic:

1. If the exponent is 0, it returns 1.
2. If the exponent is 1, it returns the base value.
3. For any other exponent value, it recursively multiplies the base value by the result of power(base, exponent - 1).
The recursive approach breaks down the power calculation into smaller subproblems until the base case (exponent = 0 or 1) is reached.

# Contributing
Contributions are welcome! If you have any suggestions, improvements, or bug fixes, please open an issue or submit a pull request.