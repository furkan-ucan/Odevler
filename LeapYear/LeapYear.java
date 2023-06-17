package LeapYear;

import java.util.Scanner;

public class LeapYear {

    // This program determines if a year is a leap year.

    public static void main(String[] args) {
        // Get the year from the user.
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = inp.nextInt();

        // Check if the year is divisible by 4.
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            // If it is, check if it is divisible by 100.
            isLeapYear = true;
            if (year % 100 == 0) {
                // If it is, check if it is divisible by 400.
                isLeapYear = year % 400 == 0;
            }
        }

        // Print the results.
        if (isLeapYear) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
        inp.close();
    }
}

