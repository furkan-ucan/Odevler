package NearestNumbers;
import java.util.Arrays;
import java.util.Scanner;
public class NearestNumbers {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = input.nextInt();

        Arrays.sort(numbers); // Sort the array in ascending order

        int nearestSmaller = Integer.MIN_VALUE; // Variable to store the nearest smaller number
        int nearestLarger = Integer.MAX_VALUE; // Variable to store the nearest larger number

        for (int number : numbers) {
            if (number < target && number > nearestSmaller) {
                nearestSmaller = number; // Update nearestSmaller if a closer smaller number is found
            }
            if (number > target && number < nearestLarger) {
                nearestLarger = number; // Update nearestLarger if a closer larger number is found
            }
        }

        System.out.println("Nearest smaller number to the input: " + nearestSmaller);
        System.out.println("Nearest larger number to the input: " + nearestLarger);

        input.close();
    }
}
