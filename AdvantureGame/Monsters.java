package AdvantureGame;

public class Monsters {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int award;
    private int defaultHealth;

    public Monsters(int id, String name, int damage, int health, int award){
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.defaultHealth = health;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setHealth(int health){
        if(health < 0){
            health = 0;
        }
        this.health = health;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAward(int award){
        this.award = award;
    }

    public void setDefaultHealth(int defaultHealth){
        this.defaultHealth = defaultHealth;
    }



    public int getId(){
        return this.id;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public int getAward(){
        return this.award;
    }

    public int getDefaultHealth(){
        return this.defaultHealth;
    }

    
}
