package uce_ve_dorde_bolunme;
import java.util.Scanner;

public class uce_ve_dorde_bolunen_sayilar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No numbers divisible by both 3 and 4 found in this range.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of numbers divisible by both 3 and 4: " + average);
        }
        input.close();
    }
}
