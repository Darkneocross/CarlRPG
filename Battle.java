import java.util.*;

public class Battle {
    public static void main(String[] args) {
        Adventurer hero;
        String name = "Peter";
        hero = new Adventurer(name, 0, 20, 20, 4, 1, 3, 3, 1, 20, 0, "Warrior");
        ArrayList<Items> inventory = new  ArrayList<Items>();
        inventory.add(new Items("Novice Potion", 5, true));
        
        
        
        Monster monster = new Monster("Tyler",0, 15, 15, 4, 0, 3, 3, 1, 3);
        battleSequence(hero, monster, inventory);
//        battleMonsterTurn(hero, monster);
//        battleHeroTurn(hero, monster, inventory);
    }
    
    public static void battleHeroTurn(Adventurer hero, Monster monster, ArrayList<Items> inventory) {
        try {
            int choice = 0;
            int damageDealt = 0;
            int magicDamage = 0;
            int randomDamageSub = (int)(Math.random() * 3);
            
            System.out.println("Choices: ");
            System.out.println("1. Attack");
            System.out.println("2. Item");
            System.out.println("3. Spell");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            while (choice != 1 && choice != 2 && choice != 3) {
                System.out.println("Please choose a valid choice!");
                choice = in.nextInt();
            }
            in.close();
            if (choice == 1) {
                damageDealt = (hero.getDEX() - randomDamageSub);
                if (damageDealt <= 0) {
                    damageDealt = 1;
                }
                damageDealt = damageDealt * -1;
                if (hero.getType().equals("Warrior")) {
                    System.out.printf("%-25s","You swing your sword!");
                    Thread.sleep(1000);
                    monster.setCurrentSTA(damageDealt);
                    System.out.printf("\n%-25s","HIT! You did " + -1 * damageDealt + " damage to the " + monster.getName() + "\n\n");
                } else {
                    System.out.printf("\n%-25s","You swing your staff!");
                    Thread.sleep(1000);
                    monster.setCurrentSTA(damageDealt);
                    System.out.printf("\n%-25s","HIT! You did " + -1 * damageDealt + " damage to the " + monster.getName() + ".\n\n");
                }
            } else if (choice == 2) {
                displayHealth(hero, monster);
                CarlRPG.showInventory(inventory);
                
            } else {
                if (hero.getType().equals("Mage")) {
                    String randomMagicSpell = "";
                    int randomMagicSpellNum = (int)(Math.random() * 5) + 1;
                    if (randomMagicSpellNum == 1) {
                        randomMagicSpell = "fire";
                    } else if (randomMagicSpellNum == 2) {
                        randomMagicSpell = "wind";
                    } else if (randomMagicSpellNum == 3) {
                        randomMagicSpell = "water";
                    } else if (randomMagicSpellNum == 4) {
                        randomMagicSpell = "earth";
                    } else {
                        randomMagicSpell = "lighting";
                    }
                    Thread.sleep(800);
                    System.out.printf("%-25s", "You cast a " + randomMagicSpell + " spell!\n");
                    magicDamage = -1 * (hero.getINT() - randomDamageSub);
                    monster.setCurrentSTA(magicDamage);
                    Thread.sleep(1000);
                    System.out.printf("\n%-25s","HIT! You did " + -1 * magicDamage + " damage to the " + monster.getName() + "\n\n");
                } else {
                    int randomSpecial = 0;
                    String randomSpecialAttack = "";
                    randomSpecial = (int)(Math.random() * 10) + 1;
                    if (randomSpecial == 1) {
                        randomSpecialAttack = "C Stick";
                    } else if (randomSpecial == 2) {
                        randomSpecialAttack = "Whirlwind strike";
                    } else if (randomSpecial == 3) {
                        randomSpecialAttack = "Sword slash";
                    } else if (randomSpecial == 4) {
                        randomSpecialAttack = "Asshole poke";
                    } else if (randomSpecial == 5) {
                        randomSpecialAttack = "Sword stab";
                    }
                    Thread.sleep(1250);
                    if (randomSpecial > 0 && randomSpecial <= 5) {
                        System.out.printf("%-25s", "You swing your sword and strike a " + randomSpecialAttack + " attack!\n\n");
                        int specialDamage = (int)(hero.getDEX() * 1.5);
                        monster.setCurrentSTA(-1 * specialDamage);
                    } else {
                        System.out.printf("%-25s", "You try to perform the attack but " + monster.getName() + " defended!\n\n");
                    }
                        
                        
                }
            }
            Thread.sleep(3000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        displayHealth(hero, monster);
    }
    public static void displayHealth(Adventurer hero, Monster monster) {
        if (monster.getCurrentSTA() < 0) {
            monster.setCurrentSTA(-1 * monster.getCurrentSTA());
        }
        if (hero.getCurrentSTA() < 0) {
            hero.setCurrentSTA(-1 * hero.getCurrentSTA());
        }
        System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
        System.out.printf("%-25s\n","[" + monster.getName() + "] Lv. " + monster.getLevel());
        System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
        System.out.printf("%-25s\n", "HP: " + monster.getCurrentSTA() + "/" + monster.getSTA());
        System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
        System.out.printf("%-25s", "MP: " + monster.getCurrentCLAR() + "/" + monster.getCLAR() + "\n");
    }
    public static void battleMonsterTurn(Adventurer hero, Monster monster) {
        try {
            int damageDealt = 0;
            int randomDamageSub = (int)(Math.random() * 3);
            damageDealt = (monster.getDEX() - randomDamageSub);
            if (damageDealt < 0) {
                int  randomNum = (int)((Math.random() * 2) + 1);
                if (randomNum == 1) {
                    damageDealt = 0;
                } else {
                    damageDealt = 1;
                }
            }
            hero.setCurrentSTA(-1 * damageDealt);
            System.out.printf("%-25s","The " + monster.getName() + " attacks you!");
            System.out.println();
            if (damageDealt == 0) {
                Thread.sleep(1150);
                System.out.printf("%-25s","Miss!");
                System.out.println("\n");
            } else {
                Thread.sleep(1000);
                System.out.printf("%-25s","The " + monster.getName() + " did " + damageDealt + " damage to " + hero.getName() + "!\n\n");
                
            }
            Thread.sleep(2000);
            displayHealth(hero, monster);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
    public static boolean heroAlive(Adventurer hero) {
        if (hero.getCurrentSTA() <= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean monsterAlive(Monster monster) {
        if (monster.getCurrentSTA() <= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void battleSequence(Adventurer hero, Monster monster, ArrayList<Items> inventory) {
        try {
            System.out.println("\n\n      [[[ BATTLE INITIATED ]]]\n");
            Thread.sleep(2000);
            displayHealth(hero, monster);
            while(monsterAlive(monster) && heroAlive(hero)) {
                int  randomNum = (int)((Math.random() * 2) + 1);
                if (randomNum == 1) {
                    battleHeroTurn(hero, monster, inventory);
                    Thread.sleep(4000);
                    if (!monsterAlive(monster)) {
                        break;
                    }
                    System.out.println("\n");
                    battleMonsterTurn(hero,monster);
                    Thread.sleep(4000);
                    if (!heroAlive(hero)) {
                        break;
                    }
                }
            }
            if (heroAlive(hero)) {
                System.out.println("\n\n      [[[ BATTLE FINISHED ]]]\n");
            } else {
                System.out.println("\n\n      [[[ GAME OVER ]]]\n");
            } 
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
