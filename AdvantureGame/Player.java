package AdvantureGame;
import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    private int money;
    private int health;
    private int defaultHealth;
    private int damage;
    private String character;
    private Inventory inventory;

    

    public Player(String name, int age){
        this.name = name;
        this.age = age;
        this.inventory = new Inventory();

    }

    public void selectCharacter(){


        GameCharacter[] charlist = {new Archer(), new Samurai(), new Knight()};
        System.out.println("*********************************"); 
        for (GameCharacter character : charlist) {
            System.out.println("ID: "+character.getId()+
                "\tCharacter: "+character.getName()+
                "\tDamage: " + character.getDamage() +
                "\tHealth: " + character.getHealth() +
                "\tMoney: " + character.getMoney());
        }
        System.out.println("*********************************");
        System.out.println("Please select your character: ");
        int select = scanner.nextInt();

        switch(select){
            case 1:
                initPlayer(new Archer());
                break;
            case 2:
                initPlayer(new Samurai());
                break;
            case 3:
                initPlayer(new Knight());
            
                break;
            default:

                System.out.println("Invalid selection!");
                break;
        }
        
        System.out.println("Your character is " + this.getCharacter() + ".");
        System.out.println("Your damage is " + this.getDamage() + ".");
        System.out.println("Your health is " + this.getHealth() + ".");
        System.out.println("Your money is " + this.getMoney() + ".");
        System.out.println("Good luck!");
    
    }

    public void selectLocation(){
    Locations[] locations = {new SafeHouse(this, "Safe House"), new ToolStore(this), new Cave(this), new Forest(this), new River(this)};
        System.out.println("*********************************");
        for (Locations location : locations) {
            System.out.println("ID: "+location.getId()+
                "\tLocation: "+location.getName());
        }
        System.out.println("*********************************");
        System.out.println("Please select your location: ");
        int select = scanner.nextInt();

        switch(select){
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            case 1:
                initLoc(new SafeHouse(this, "Safe House"));
                break;
            case 2:
                initLoc(new ToolStore(this));
                break;
            case 3:
                initLoc(new Cave(this));
                break;
            case 4:
                initLoc(new Forest(this));
                break;
            case 5:
                initLoc(new River(this));
                break;
            default:
                System.out.println("Invalid selection!");
                break;
        }       
        
        locations[select-1].onLocation();

        
    }

    public void initPlayer(GameCharacter character){
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setDefaultHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharacter(character.getName());
    }

    public void initLoc(Locations location){}

    public void printInfo(){
        System.out.println("*********Updated information*********");
        System.out.println(
            "Weapon: " + this.getInventory().getWeapon().getName() + 
            "\nArmor: " + this.getInventory().getArmor().getName() + 
            "\nBlock: " + this.getInventory().getArmor().getBlock() + 
            " \nDamage: " +  this.getTotalDamage() + 
            "\nHealth: " + this.getHealth() +
            " \nMoney: " + this.getMoney());
    }
        


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCharacter(String character){
        this.character = character;
    }

    public String getCharacter(){
        return this.character;
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public int getDefaultHealth(){
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth){
        this.defaultHealth = defaultHealth;
    }



}


