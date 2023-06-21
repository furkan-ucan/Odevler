package PrimeNumberChecker;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // get number

        if (isPrime(number)){ // call isPrime method
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }
        input.close();
    }

    public static boolean isPrime(int number){
        if(number <= 1){ // base case
            return false;
    }
    return isPrimeRecursive(number, number - 1); // call isPrimeRecursive method
    }
    public static boolean isPrimeRecursive(int number, int divisor){
        if(divisor == 1){ // base case
            return true;
        }
        if(number % divisor == 0){ // base case
            return false;
        }
        return isPrimeRecursive(number, divisor - 1); // recursive call
    }
}
