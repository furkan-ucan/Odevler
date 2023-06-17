package GCDandLCM;

import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    private static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
