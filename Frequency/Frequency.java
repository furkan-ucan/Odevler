package Frequency;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create a frequency array to store the frequency of each element
        int[] frequency = new int[size];

        for (int i = 0; i < size; i++) {
            frequency[i] = 0;
        }

        // Iterate through the array and increment the frequency of each element
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    frequency[i]++;
                }
            }
        }

        // Print the frequency of each element
        System.out.println("The frequency of each element is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " : " + frequency[i]);
        }
        scanner.close();
    }
}

