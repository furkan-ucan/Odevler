# Diamond Pattern Program
The Diamond Pattern program is a simple Java program that prints a diamond-shaped pattern of asterisks (*) based on user input. The program prompts the user to enter the height of the diamond and then generates the pattern accordingly.

## How to Run the Program
To run the Diamond Pattern program, follow these steps:

Make sure you have Java installed on your system.
Copy the provided code into a file and save it with the name DiamondPattern.java.
Open a command prompt or terminal and navigate to the directory where you saved the DiamondPattern.java file.
Compile the Java file by running the following command:

javac DiamondPattern.java

After successful compilation, run the program with the following command:

java DiamondPattern

The program will prompt you to enter the height of the diamond. Enter a positive integer and press Enter.
The program will generate and print the diamond pattern based on the provided height.
## Program Logic
The Diamond Pattern program uses nested loops to print the upper and lower parts of the diamond separately. Here's a breakdown of the program logic:

The program prompts the user to enter the height of the diamond.
Two variables, spaceCount and starCount, are initialized with initial values based on the user input.
The program enters a loop to print the upper part of the diamond:
It prints the required number of spaces using a loop.
It prints the required number of asterisks using another loop.
It moves to the next line.
It adjusts the spaceCount and starCount variables for the next row.
After printing the upper part, the program enters another loop to print the lower part of the diamond:
It prints the required number of spaces using a loop.
It prints the required number of asterisks using another loop.
It moves to the next line.
It adjusts the spaceCount and starCount variables for the next row.
Once the pattern is fully printed, the program terminates.
