package SumOfDigits;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.println("Enter a number: ");
        int number = inp.nextInt();

        // Initialize the sum to 0.
        int sum = 0;

        // Use a while loop to iterate from the number to 0.
        while (number > 0) {
            // Add the remainder of the number divided by 10 to the sum.
            sum += number % 10;

            // Divide the number by 10 to get the next digit.
            number /= 10;
        }

        // Print the sum.
        System.out.println("The sum of the digits is: " + sum);
        inp.close();
    }
}
