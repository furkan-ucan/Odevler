package Combination;
import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = inp.nextInt();

        System.out.println("Enter r: ");
        int r = inp.nextInt();

        int combination = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("The combination of n with r is: " + combination);
        inp.close();
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
