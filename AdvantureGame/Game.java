package AdvantureGame;
import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to the Advanture Game!");
        Player player = new Player("", 0);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        player.setName(name);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        player.setAge(age);

        System.out.println("Welcome " + player.getName() + "!");
        System.out.println("Your age is " + player.getAge() + ".");
        player.selectCharacter();

        while(true){
            player.selectLocation();
            player.printInfo();
            if(player.getHealth() <= 0){
                System.out.println("You died!");
                break;

            }
        }



        

        
    }
}
