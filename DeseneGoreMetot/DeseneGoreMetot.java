package DeseneGoreMetot;
import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: "); // prompt the user to enter the value of n
        int n = scanner.nextInt(); // read the user's input for n
        scanner.close();
        
        recursiveMethod(n); // call the recursiveMethod() with the user's input
    }
    
    public static void recursiveMethod(int n) {
        System.out.println(n); // print the value of n to the console
        
        if (n <= 0) { // if n is less than or equal to 0, return from the method
            return;
        }
        
        recursiveMethod(n - 5); // subtract 5 from n and call the recursiveMethod() with the new value
        
        System.out.println(n); // print the value of n to the console
    }
}