package ChineseZodiacCalculator;

import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = inp.nextInt();

        String chineseZodiac = "";

        // Calculate Chinese Zodiac sign based on birth year
        switch (birthYear % 12) {
            case 0:
                chineseZodiac = "Monkey";
                break;
            case 1:
                chineseZodiac = "Rooster";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Rat";
                break;
            case 5:
                chineseZodiac = "Ox";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Sheep";
                break;
            default:
                System.out.println("Invalid birth year!");
                return;
        }
        inp.close();

        System.out.println("Your Chinese Zodiac sign is: " + chineseZodiac);
    }
}
