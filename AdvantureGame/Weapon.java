package AdvantureGame;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(String name,int id, int damage, int price){
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons(){
        Weapon[] weapons = {new Weapon("Pistol",1,3,5),new Weapon("Sword",2,2,35),new Weapon("Rifle",3,7,45)};
        return weapons;
    }

    public static Weapon getWeaponById(int id){
        for(Weapon weapon : weapons()){
            if(weapon.getId() == id){
                return weapon;
            }
        }
        return null;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }




    
}
