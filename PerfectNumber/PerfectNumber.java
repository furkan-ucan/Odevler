package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

    // This program finds whether a number entered from the keyboard is a perfect number or not.

    public static void main(String[] args) {
        // Get the number from the user.
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = inp.nextInt();

        // Initialize the sum of factors.
        int sumOfFactors = 1;

        // Iterate through the numbers from 2 to the number, checking if each number is a factor of the number.
        for (int i = 2; i < number; i++) {
            // If the number is a factor of the number, update the sum of factors to include the number.
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }

        // Check if the sum of factors is equal to the number.
        if (sumOfFactors == number) {
            // If it is, print that the number is a perfect number.
            System.out.println(number + " is a perfect number");
        } else {
            // Otherwise, print that the number is not a perfect number.
            System.out.println(number + " is not a perfect number");
        }
        inp.close();
    }
}
