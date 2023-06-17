package AirfareCalculator;

import java.util.Scanner;

public class AirfareCalculator {

    private static final double FARE_PER_KM = 0.1;

    public static void main(String[] args) {
        // Get the distance, age, and trip type from the user.
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the distance in km:");
        int distance = inp.nextInt();

        System.out.println("Enter your age:");
        int age = inp.nextInt();

        System.out.println("Enter the trip type (1 => One Way, 2 => Round Trip):");
        int tripType = inp.nextInt();

        // Check if the values are valid.
        if (distance <= 0 || age <= 0 || tripType < 1 || tripType > 2) {
            System.out.println("You entered incorrect data !");
            return;
        }

        // Calculate the normal amount, age discount, discounted amount, and round trip discount.
        double normalAmount = distance * FARE_PER_KM;
        double ageDiscount = 0;
        if (age < 12) {
            ageDiscount = normalAmount * 0.5;
        } else if (age <= 24) {
            ageDiscount = normalAmount * 0.1;
        } else if (age > 65) {
            ageDiscount = normalAmount * 0.3;
        }

        double discountedAmount = normalAmount - ageDiscount;
        double roundTripDiscount = 0;
        if (tripType == 2) {
            roundTripDiscount = discountedAmount * 0.2;
        }
        inp.close();

        // Calculate the total amount.
        double totalAmount = discountedAmount + roundTripDiscount;

        // Print the total amount.
        System.out.println("Total Amount = " + totalAmount);
    }
}