package HavaSıcaklıgı;

import java.util.Scanner;

public class HavaSıcaklıgınaGoreEtkinlikOnerme {

    // This class suggests an activity based on the temperature.

    public static void main(String[] args) {

        // Declare a Scanner object.
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter the temperature.
        System.out.println("Enter the temperature: ");

        // Get the temperature from the user.
        int temperature = inp.nextInt();

        // Check if the temperature is less than 5.
        if (temperature < 5) {

            // Suggest skiing.
            System.out.println("Suggested activity: Skiing");
        }

        // Check if the temperature is between 5 and 15.
        else if (temperature >= 5 && temperature <= 15) {

            // Suggest going to the cinema.
            System.out.println("Suggested activity: Cinema");
        }

        // Check if the temperature is between 15 and 25.
        else if (temperature >= 15 && temperature <= 25) {

            // Suggest going on a picnic.
            System.out.println("Suggested activity: Picnic");
        }

        // Check if the temperature is higher than 25.
        else if (temperature > 25) {

            // Suggest going swimming.
            System.out.println("Suggested activity: Swimming");
        }
        inp.close();
    }
}
