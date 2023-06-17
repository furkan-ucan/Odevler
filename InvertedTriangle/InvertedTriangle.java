package InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        // Get the number of rows from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Draw the inverted triangle
        for (int i = numRows; i >= 1; i--) {
            // Print the asterisks for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}

