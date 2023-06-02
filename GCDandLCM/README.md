## GCD and LCM Calculator
This Java program calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using a while loop.

# Getting Started

Prerequisites

Java Development Kit (JDK) installed
A Java IDE or a text editor to run the program

# Running the Program
1. Clone the repository or download the source code files.
2. Open the Java IDE or a text editor.
3. Open the GCDandLCM.java file.
4. Run the program by clicking the "Run" or "Execute" button in the IDE, or by using the command line with the following command:
    javac GCDandLCM.java
    java GCDandLCM
5. Follow the instructions displayed in the console to enter the two numbers.
# How It Works 
1. The program prompts the user to enter two numbers.
2. The program uses a while loop to calculate the GCD and LCM.
3. The loop iterates from 2 up to the smaller of the two numbers.
4. If the current iteration value (k) is a common divisor for both numbers, it updates the GCD value.
5. If the LCM is divisible by both numbers, it updates the LCM value by dividing it by k.
6. Finally, the program displays the calculated GCD and LCM values.

# Example

Enter the first number: 12
Enter the second number: 18
GCD: 6
LCM: 36