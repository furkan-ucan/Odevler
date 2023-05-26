package EvenAndMultiplesOfFour;
import java.util.Scanner;
public class EvenAndMultiplesOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (Enter an odd number to stop): ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {// If the number is even and a multiple of four, add it to the sum
            
                sum += number;
            }
        } while (number % 2 != 1);// Continue the loop as long as the number is not odd

        System.out.println("Sum of the entered even numbers and multiples of four: " + sum);
        input.close();
    }
}

