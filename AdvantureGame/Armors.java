package AdvantureGame;

public class Armors {
    private String name;

    private int id;
    private int block;
    private int price;

    public Armors(String name, int id, int block, int price){
        this.name = name;

        this.id = id;
        this.block = block;
        this.price = price;
    }

    public static Armors[] armors(){
        Armors[] armors = {new Armors("Light Armor",1,1,5),new Armors("Medium Armor",2,3,35),new Armors("Heavy Armor",3,5,45)};
        return armors;
    }

    public static Armors getArmorById(int id){
        for(Armors armor : armors()){
            if(armor.getId() == id){
                return armor;
            }
        }
        return null;
    }


    public int getId(){
        return this.id;
    }

    public int getBlock(){
        return this.block;
    }


    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBlock(int block){
        this.block = block;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }


}
