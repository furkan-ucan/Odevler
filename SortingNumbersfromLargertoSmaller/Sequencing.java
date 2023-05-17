package SortingNumbersfromLargertoSmaller;

import java.util.Scanner;

public class Sequencing {

    // This class sorts 3 numbers entered from smallest to largest.

    public static void main(String[] args) {

        // Declare variables.
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter the numbers.
        System.out.println("İlk sayıyı Giriniz: ");
        a = inp.nextInt();

        System.out.println("İkinci sayıyı Giriniz: ");
        b = inp.nextInt();

        System.out.println("Üçüncü sayıyı Giriniz: ");
        c = inp.nextInt();

        // Create a temporary variable.
        int temp;

        // Compare the first and second numbers.
        if (a > b) {

            // Swap the numbers if the first number is greater than the second number.
            temp = a;
            a = b;
            b = temp;
        }

        // Compare the first and third numbers.
        if (a > c) {

            // Swap the numbers if the first number is greater than the third number.
            temp = a;
            a = c;
            c = temp;
        }

        // Compare the second and third numbers.
        if (b > c) {

            // Swap the numbers if the second number is greater than the third number.
            temp = b;
            b = c;
            c = temp;
        }

        // Print the numbers in sorted order.
        System.out.println("Sayılar küçükten büyüğe: " + a + " " + b + " " + c);
    }
}
