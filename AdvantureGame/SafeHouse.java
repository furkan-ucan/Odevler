package AdvantureGame;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player, String name){
        super(1,player, name);
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are in the " + getName());
        System.out.println("Your health is full now.");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        return true;
    }
    
}
