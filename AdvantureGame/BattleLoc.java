package AdvantureGame;

public abstract class BattleLoc extends Locations{
    private Monsters monster;   
    private String award;
    private int maxMonster;
    public BattleLoc(Player player, String name, Monsters monster, String award, int maxMonster){
        super(-1,player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }
    @Override
    public boolean onLocation(){
        int monsterNumber = randomMonster();
        System.out.println("You are in the " + getName() + " and there are " + monster.getName() + " monsters.");
        System.out.println("Be careful! There are " + monsterNumber + " " + monster.getName() + " in the " + getName() + ".");
        System.out.println("Are you ready for the battle? (Y/N)");
        String select = scanner.nextLine().toUpperCase();
        
        if (select.equals("Y") && battle(monsterNumber)){
            System.out.println("You have defeated all enemies.");
            return true;
        }

        if(this.getPlayer().getHealth() <= 0){
            System.out.println("You are dead!");
            return false;
        }

        return true;
    }


    public boolean battle(int monsterNumber){
        for(int i = 1; i <= monsterNumber;i++ ){
            this.getMonster().setHealth(this.getMonster().getDefaultHealth());
            playerStats();
            monsterStats(i);
            System.out.println("---------------");
            while(getPlayer().getHealth() > 0 && monster.getHealth() > 0){
                System.out.println("Hit the monster (H)");
                String select = scanner.nextLine();
                if(select.equals("H") || select.equals("h")){
                    System.out.println("You are hitting the monster...");
                    monster.setHealth(monster.getHealth() - getPlayer().getTotalDamage());
                    afterHit();
                    if(monster.getHealth() > 0){
                        System.out.println();
                        System.out.println("Monster is hitting you...");
                        int monsterDamage = monster.getDamage() - getPlayer().getInventory().getArmor().getBlock();
                        if(monsterDamage < 0){
                            monsterDamage = 0;
                        }
                        getPlayer().setHealth(getPlayer().getHealth() - monsterDamage);
                        afterHit();
                    }
                }
                else{
                    System.out.println("Invalid selection!");
                }
            }
            if(monster.getHealth() < getPlayer().getHealth()){
                System.out.println("You won the battle!");
                System.out.println("You got " + monster.getAward() + " " + getAward() + ".");
                getPlayer().setMoney(getPlayer().getMoney() + monster.getAward());
                System.out.println("Your money is " + getPlayer().getMoney() + ".");
                return true;
            } else {
                return false;

            }
            
        } return true;
    }
            
    


    public void afterHit(){
        System.out.println("----------------");
        System.out.println("Player Health: " + getPlayer().getHealth());
        System.out.println(monster.getName()+ "Monster Health: " + monster.getHealth());
        System.out.println("---------------");
    }

    public void playerStats(){
        System.out.println("Player Values:");
        System.out.println("---------------");
        System.out.println("Player Health: " + getPlayer().getHealth());
        System.out.println("Weapon Name: " + getPlayer().getInventory().getWeapon().getName());
        System.out.println("Player Damage: " + getPlayer().getTotalDamage());
        System.out.println("Armor Name: " + getPlayer().getInventory().getArmor().getName());
        System.out.println("Player Block: " + getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Player Money: " + getPlayer().getMoney());
        System.out.println("---------------");

        
    }

    public void monsterStats(int i){
        System.out.println("Monster Values:");
        System.out.println("---------------");
        System.out.println("Monster Name: " + monster.getName());

        System.out.println("Monster Health: " + monster.getHealth());
        System.out.println("Monster Damage: " + monster.getDamage());
        System.out.println("Monster Money: " + monster.getAward());
        System.out.println("---------------");
    }

    


    public int randomMonster() {
        return (int) (Math.random() * maxMonster) + 1;
    }

    public Monsters getMonster(){
        return this.monster;
    }

    public void setMonster(Monsters monster){
        this.monster = monster;
    }

    public String getAward(){
        return this.award;
    }

    public void setAward(String award){
        this.award = award;
    }

    public int getMaxMonster(){
        return this.maxMonster;
    }

    public void setMaxMonster(int maxMonster){
        this.maxMonster = maxMonster;
    }


    
}
