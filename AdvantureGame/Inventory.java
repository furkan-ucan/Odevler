package AdvantureGame;

public class Inventory {
    private Weapon weapon;
    private Armors armor;

    public Inventory(){
        this.weapon = new Weapon("Punch",0,0,0);
        this.armor = new Armors("No Armor",0,0,0);
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setArmor(Armors armor){
        this.armor = armor;
    }

    public Armors getArmor(){
        return this.armor;
    }

}
