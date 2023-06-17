package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

    // This program finds the Fibonacci series with loops.

    public static void main(String[] args) {
        // Get the number of elements of the Fibonacci series from the user.
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number of elements of the Fibonacci series: ");
        int n = inp.nextInt();

        // Initialize the first two terms of the Fibonacci series to 0 and 1.
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;

        // Print the first two terms.
        System.out.print(firstTerm + " " + secondTerm);

        // Iterate through the numbers from 3 to n, adding the first two terms and printing the result.
        for (int i = 3; i <= n; i++) {
            // Calculate the next term in the Fibonacci series.
            nextTerm = firstTerm + secondTerm;

            // Print the next term.
            System.out.print(" " + nextTerm);

            // Update the first two terms for the next iteration.
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        inp.close();
    }
}

