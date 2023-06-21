package PalindromeNumber;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        // Get the number from the user.
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = inp.nextInt();
        // Check if the number is a palindrome.
        boolean isPalindrome = false;
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        if (number == reverse) {
            isPalindrome = true;
        }
        // Print the results.
        if (isPalindrome) {
            System.out.println(number + " is a palindrome!");
        } else {
            System.out.println(number + " is not a palindrome!");
        }
        inp.close();
    }
}
