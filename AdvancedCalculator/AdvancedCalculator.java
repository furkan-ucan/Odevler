package AdvancedCalculator;
import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Get the number of numbers from the user.
        System.out.println("How many numbers will you operate with?");
        int numberOfNumbers = inp.nextInt();

        // Get the numbers from the user.
        int[] numbers = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = inp.nextInt();
        }

        // Get the operation from the user.
        System.out.println("Select the operation:");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exponentiation");
        System.out.println("6- Factorial");
        System.out.println("7- Find Mode");
        System.out.println("8- Rectangle Area and Perimeter");
        int operation = inp.nextInt();

        // Perform the operation and print the result.
        switch (operation) {
            case 1:
                System.out.println(sum(numbers));
                break;
            case 2:
                System.out.println(subtract(numbers));
                break;
            case 3:
                System.out.println(multiply(numbers));
                break;
            case 4:
                System.out.println(divide(numbers));
                break;
            case 5:
                System.out.println(exponent(numbers));
                break;
            case 6:
                System.out.println(factorial(numbers));
                break;
            case 7:
                int mode = findMode(numbers);
                System.out.println("The mode is: " + mode);
                break;
            case 8:
                int area = rectangleArea(numbers);
                int perimeter = rectanglePerimeter(numbers);
                System.out.println("The area is: " + area);
                System.out.println("The perimeter is: " + perimeter);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static int subtract(int[] numbers) {
        int difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }
        return difference;
    }

    private static int multiply(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    private static int divide(int[] numbers) {
        int quotient = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            quotient /= numbers[i];
        }
        return quotient;
    }

    private static int exponent(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = (int) Math.pow(result, numbers[i]);
        }
        return result;
    }

    private static int factorial(int[] numbers) {
        int factorial = 1;
        for (int number : numbers) {
            factorial *= number;
        }
        return factorial;
    }

    private static int findMode(int[] numbers) {
        int[] count = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            count[i] = 0;
        }
        for (int number : numbers) {
            count[number]++;
        }
        int maxCount = 0;
        int mode = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i;
            }
        }
        return mode;
    }

    private static int rectangleArea(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    private static int rectanglePerimeter(int[] numbers) {
        return 2 * (numbers[0] + numbers[1]);
    }
}
