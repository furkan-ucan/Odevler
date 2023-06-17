package LargestAndSmallestNumber;

import java.util.Scanner;

public class LargestAndSmallestNumber {

    // This program finds the largest and smallest numbers from N counting numbers entered from the keyboard.

    public static void main(String[] args) {
        // Get the number of numbers from the user.
        Scanner inp = new Scanner(System.in);

        System.out.println("How many numbers to enter: ");
        int numberOfNumbers = inp.nextInt();

        // Initialize the largest and smallest numbers.
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        // Iterate through the numbers, comparing each number to the largest and smallest numbers so far.
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Enter the number: ");
            int number = inp.nextInt();

            // If the number is larger than the largest number, update the largest number.
            if (number > largestNumber) {
                largestNumber = number;
            }

            // If the number is smaller than the smallest number, update the smallest number.
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        inp.close();

        // Print the largest and smallest numbers.
        System.out.println("Largest number: " + largestNumber);
        System.out.println("The smallest number: " + smallestNumber);
    }
}
