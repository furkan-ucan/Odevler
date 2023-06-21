package ExponentiationwithRecursiveMethods;
import java.util.Scanner;
public class ExponentiationwithRecursiveMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");

        int base = input.nextInt(); // get base number
        System.out.print("Enter exponent number: ");    
        int exponent = input.nextInt(); // get exponent number 
        
        int result = power(base, exponent); // call power method    
        System.out.println(base + " to the power " + exponent + " is: " + result);  

        input.close();
    }
    public static int power(int base, int exponent) {
        if (exponent != 0) // base case
            return (base * power(base, exponent - 1));
        else
            return 1;
    }   
}
