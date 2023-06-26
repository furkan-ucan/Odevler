package BoxingMatch;
import java.util.Random;

public class Ring {
    fighter f1; // the first fighter
    fighter f2; // the second fighter
    int minWeight; // the minimum weight for the match
    int maxWeight; // the maximum weight for the match

    public Ring(fighter f1, fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) { // check if the weight of both fighters is within the specified range
            Random rnd = new Random(); // create a new random object
            int rand = rnd.nextInt(2); // generate a random number between 0 and 1
            System.out.println("======== MAÇ BAŞLADI ===========");
            if (rand == 1) { // if the random number is 1, the first fighter hits first
                System.out.println("İlk vuruş " + f1.name + " vurdu.");
                f2.health = f1.hit(f2); // the first fighter hits the second fighter
                if (isWin()) { // check if there is a winner
                    return;
                }
            } else { // if the random number is 0, the second fighter hits first
                System.out.println("İlk vuruş " + f2.name + " vurdu.");
                f1.health = f2.hit(f1); // the second fighter hits the first fighter
                if (isWin()) { // check if there is a winner
                    return;
                }
            }
            while (f1.health > 0 && f2.health > 0) { // continue the match until one of the fighters has no health left
                System.out.println("======== YENİ ROUND ===========");
                f2.health = f1.hit(f2); // the first fighter hits the second fighter
                if (isWin()) { // check if there is a winner
                    break;
                }
                f1.health = f2.hit(f1); // the second fighter hits the first fighter
                if (isWin()) { // check if there is a winner
                    break;
                }
                printScore(); // print the remaining health of each fighter
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor."); // print an error message if the weight of the fighters is not within the specified range
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight); // check if the weight of both fighters is within the specified range
    }

    public boolean isWin() {
        if (f1.health == 0) { // if the first fighter has no health left, the second fighter wins
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) { // if the second fighter has no health left, the first fighter wins
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false; // if neither fighter has no health left, the match continues
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health); // print the remaining health of the first fighter
        System.out.println(f2.name + " Kalan Can \t:" + f2.health); // print the remaining health of the second fighter
    }
}