package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        fighter marc = new fighter("Marc", 15, 100, 90, 20); // create a new fighter object named "marc"
        fighter alex = new fighter("Alex", 10, 95, 100, 40); // create a new fighter object named "alex"
        Ring r = new Ring(marc, alex, 90, 100); // create a new Ring object with the two fighters and weight range
        r.run(); // run the boxing match
    }
}