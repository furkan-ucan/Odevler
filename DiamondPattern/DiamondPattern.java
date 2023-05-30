package DiamondPattern;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the height of the diamond: ");
        int height = inp.nextInt();

        int spaceCount = height - 1;
        int starCount = 1;

        // Upper part of the diamond
        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            
            System.out.println();

            spaceCount--;
            starCount += 2;
        }

        // Lower part of the diamond
        spaceCount = 1;
        starCount = height * 2 - 3;

        for (int i = 0; i < height - 1; i++) {
            // Print spaces
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            
            System.out.println();

            spaceCount++;
            starCount -= 2;
        }
        inp.close();
    }
}
