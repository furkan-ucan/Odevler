package PowersOf4And5;
import java.util.Scanner;

public class PowersOf4And5 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner inp = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.println("Enter a number: ");
        int number = inp.nextInt();

        // Print a message to the user that the program is finished.
        System.out.println("The program is finished.");

        // Print the powers of 4 and 5 up to the number entered by the user.
        System.out.println("Powers of 4:");
        for (int i = 1; i <= number; i++) {
            System.out.println(4 * i);
        }

        System.out.println("Powers of 5:");
        for (int i = 1; i <= number; i++) {
            System.out.println(5 * i);
        }
        inp.close();
    }
}
