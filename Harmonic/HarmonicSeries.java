package Harmonic;
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter a number and store the number in the `n` variable.
        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        // Create a variable named `sum` to store the sum of the harmonic series.
        double sum = 0;

        // Use a for loop to iterate from 1 to `n` and add 1.0 / i to the `sum` variable.
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // Print the value of the `sum` variable.
        System.out.println("The sum of the harmonic series is " + sum);
    }
}
