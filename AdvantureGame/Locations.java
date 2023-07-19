package AdvantureGame;

import java.util.Scanner;

public abstract class Locations {
    private Player player;
    private String name;
    private int id;
    public static Scanner scanner = new Scanner(System.in);


    public Locations(int id,Player player, String name){
        this.id = id;
        this.player = player;
        this.name = name;
    }

    public abstract boolean onLocation();

    

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setPlayer(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }


}
