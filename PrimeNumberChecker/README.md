## Recursive Prime Number Checker
This is a Java program that checks whether a given number is a "Prime" number or not, using a recursive method. The program prompts the user to enter a number and determines if it is prime or not.

# How It Works
1. The program takes input from the user, which is the number to be checked.
2. It calls the isPrime method, passing the entered number as an argument.
3. The isPrime method checks if the number is less than or equal to 1. If so, it returns false since prime numbers are greater than 1.
4. Otherwise, it calls the isPrimeRecursive method, passing the number and the initial divisor value (2) as arguments.
5. The isPrimeRecursive method checks if the divisor is equal to or greater than the number. If so, it means the number has no divisors other than 1 and itself, and it returns true (indicating that the number is prime).
6. If the number is divisible evenly by the current divisor, it means the number is not prime, and the method returns false.
7. If the number is not divisible by the current divisor, the method calls itself recursively with an incremented divisor value.
8. Steps 6 and 7 are repeated until the base case is reached, either when the number is determined to be prime or when the divisor becomes equal to or greater than the number.
9. The isPrime method prints the appropriate message based on the return value of isPrimeRecursive.
# How to Use
1. Clone the repository or download the source code file (PrimeNumber.java).
2. Compile the Java file using a Java compiler.
3. Run the compiled program.
4. Enter a number to check if it is prime or not.
5. The program will display whether the entered number is prime or not.
Note: Make sure you have Java Development Kit (JDK) installed on your system to compile and run the Java program.