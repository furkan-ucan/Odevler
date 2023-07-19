package AdvantureGame;

public class  NormalLoc extends Locations {
    public NormalLoc(int id,Player player, String name){
        super(-1,player, name);
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are in the " + getName());
        return true;
    }
}
