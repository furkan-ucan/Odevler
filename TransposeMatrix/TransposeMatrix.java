package TransposeMatrix;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        // Create a matrix to store the original matrix
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a matrix to store the transpose of the matrix
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose of the matrix
        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
