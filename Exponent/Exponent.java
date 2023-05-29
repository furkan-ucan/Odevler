package Exponent;
import java.util.Scanner;
public class Exponent {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter the base number.
        System.out.println("Enter the base number: ");
        int base = inp.nextInt();

        // Prompt the user to enter the exponent.
        System.out.println("Enter the exponent: ");
        int exponent = inp.nextInt();

        // Initialize the result to 1.
        int result = 1;

        // Use a for loop to iterate from 0 to the exponent.
        for (int i = 0; i < exponent; i++) {
            // Multiply the result by the base number.
            result *= base;
        }

        // Print the result.
        System.out.println("The exponent of " + base + " with " + exponent + " is: " + result);
        inp.close();
    }
}
