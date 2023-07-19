package AdvantureGame;
public class ToolStore extends NormalLoc {
    public ToolStore(Player player){
        super(2 ,player, "Tool Store");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Welcome " + getName());
        while(true){
            System.out.println("1- Weapons");
            System.out.println("2- Armors");
            System.out.println("3- Exit");
            System.out.print("Select an option: ");
            int selectCase = scanner.nextInt();
            while(selectCase < 1 || selectCase > 3){
                System.out.println("Invalid selection!");
                System.out.print("Select an option: ");
                selectCase = scanner.nextInt();
            }
            switch(selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return true;
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }

    public void printWeapon(){
        System.out.println("---------Weapons--------");
        Weapon[] weapons = Weapon.weapons();
        for(Weapon weapon : weapons){
            System.out.println("ID: " + weapon.getId() + " Name: " + weapon.getName() + " Damage: " + weapon.getDamage() + " Price: " + weapon.getPrice());
        }
        System.out.println("0- Exit");
    }

    public void buyWeapon(){
        System.out.print("Select a weapon:  ");
        int selectWeapon = scanner.nextInt();
        while(selectWeapon < 0 || selectWeapon > Weapon.weapons().length){
            System.out.println("Invalid selection!");
            System.out.print("Select an option: ");
            selectWeapon = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponById(selectWeapon);


        if(selectWeapon != 0){
            if(selectedWeapon != null){
                if(selectedWeapon.getPrice() > getPlayer().getMoney()){
                    System.out.println("You don't have enough money!");
                }else{
                    System.out.println("You bought " + selectedWeapon.getName() + "!");
                    int balance = getPlayer().getMoney() - selectedWeapon.getPrice();
                    getPlayer().setMoney(balance);
                    System.out.println("Your balance: " + getPlayer().getMoney());
                    
                    getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
        
    }

    public void printArmor(){
        System.out.println("---------Armors--------");
        Armors[] armors = Armors.armors();
        for(Armors armor : armors){
            System.out.println("ID: " + armor.getId() + " Name: " + armor.getName() + " Block: " + armor.getBlock() + " Price: " + armor.getPrice());
        }
        System.out.println("0- Exit");
    }

    public void buyArmor(){

        System.out.print("Select an armor:  ");
        int selectArmor = scanner.nextInt();
        while(selectArmor < 0 || selectArmor > Armors.armors().length){
            System.out.println("Invalid selection!");
            System.out.print("Select an option: ");
            selectArmor = scanner.nextInt();
        }
        Armors selectedArmor = Armors.getArmorById(selectArmor);


        if(selectArmor != 0){
            if(selectedArmor != null){
                if(selectedArmor.getPrice() > getPlayer().getMoney()){
                    System.out.println("You don't have enough money!");
                }else{
                    System.out.println("You bought " + selectedArmor.getName() + "!");
                    int balance = getPlayer().getMoney() - selectedArmor.getPrice();
                    getPlayer().setMoney(balance);
                    System.out.println("Your balance: " + getPlayer().getMoney());
                    
                    getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}