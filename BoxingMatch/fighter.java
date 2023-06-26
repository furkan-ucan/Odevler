package BoxingMatch;

public class fighter {
    String name; // the name of the fighter
    int damage; // the damage that the fighter can inflict
    int health; // the health of the fighter
    int weight; // the weight of the fighter
    int dodge; // the dodge rate of the fighter

    public fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu."); // print a message indicating that the fighter has hit the foe
        if (foe.isDodge()) { // check if the foe has dodged the hit
            System.out.println(foe.name + " gelen hasarı blokladı."); // print a message indicating that the foe has blocked the hit
            return foe.health; // return the current health of the foe
        }
        if (foe.health - this.damage < 0) // check if the hit has killed the foe
            return 0; // return 0 to indicate that the foe has no health left
        return foe.health - this.damage; // return the remaining health of the foe
    }


    public boolean isDodge() {
        double randomNumber = Math.random() * 100; // generate a random number between 0 and 100
        return randomNumber <= this.dodge; // return true if the random number is less than or equal to the dodge rate of the fighter
    }


}