package HarmonicAverage;
import java.util.Scanner;
public class HarmonicAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to calculate the harmonic average for? ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        double harmonicSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + ". number: ");
            numbers[i] = input.nextDouble();
            harmonicSum += 1 / numbers[i];
        }

        double harmonicAverage = n / harmonicSum;

        System.out.println("The harmonic average of the entered numbers: " + harmonicAverage);

        input.close();
    }
    
}

