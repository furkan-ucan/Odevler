package PrimeNumbers;


public class PrimeNumbers {

    // This program prints the prime numbers between 1 and 100 on the screen.

    public static void main(String[] args) {
        // Get the number from the user.

        System.out.println("Prime numbers between 1 and 100: ");

        // Iterate through the numbers from 2 to the number, checking if each number is a prime number.
        for (int i = 2; i <= 100; i++) {
            // Initialize the boolean variable isPrime to true.
            boolean isPrime = true;

            // Iterate through the numbers from 2 to i, checking if i is divisible by any of the numbers.
            for (int j = 2; j < i; j++) {
                // If i is divisible by any of the numbers, set isPrime to false and break out of the loop.
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If isPrime is still true, print the number.
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

