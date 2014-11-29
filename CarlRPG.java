import java.util.*;

public class CarlRPG {
    public static void main(String[] args) {
        ArrayList<Items> inventory = new ArrayList<Items>();
        Scanner in = new Scanner(System.in);
        String name = "";
        String classChoice = "";
        Adventurer hero;
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        try {
            
            System.out.printf("%145s","Hello! Welcome to the Carl RPG!\n\n\n\n\n\n\n\n\n\n");
            
            Thread.sleep(3000);
            System.out.println("Please enter the name of your adventurer:\n");
            name = in.nextLine();
            Thread.sleep(1500);
            System.out.println("\nOkay " + name + ", please pick a class to start your adventure!\n");
            System.out.println("Warrior | Mage | *TBA* | *TBA* | *TBA*\n");
            classChoice = in.nextLine();
            classChoice = classChoice.toLowerCase();
            while(!classChoice.equals("warrior")&&!classChoice.equals("mage")) {
                System.err.println("\nPlease enter a valid class!\n");
                classChoice = in.nextLine();
                classChoice = classChoice.toLowerCase();
            }
            Thread.sleep(1500);
            if (classChoice.equals("warrior")) {
                hero = new Adventurer(name, 0, 20, 20, 4, 1, 3, 3, 1, 20, 0, "Warrior");
            } else {
                hero = new Adventurer(name, 0, 15, 15, 1, 5, 8, 8, 1, 20, 0, "Mage");
            }
            System.out.println("\nCREATING CHARACTER\n");
            Thread.sleep(1500);
            System.out.println("...\n");
            Thread.sleep(250);
            System.out.println("NAME: " + name + "\n");
            Thread.sleep(1500);
            System.out.println("CLASS: " + hero.getType() + "\n");
            Thread.sleep(500);
            System.out.println("MAX HP: " + hero.getSTA() + "\n");
            Thread.sleep(600);
            System.out.println("MAX MP: " + hero.getCLAR() + "\n");
            Thread.sleep(1500);
            System.out.println("MAX ATTACK: " + hero.getDEX() + "\n");
            Thread.sleep(600);
            System.out.println("MAX MAGIC ATTACK: " + hero.getINT() + "\n\n");
            Thread.sleep(750);
            System.out.println("[" + name + "]\nHP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
            System.out.println("MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
            System.out.println("\nGOOD LUCK ON YOUR NEW ADVENTURE!\n\n");
            Thread.sleep(7000);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            Thread.sleep(5000);
//            chapterOne(hero, inventory);
            chapterTwo(hero,inventory);
        } catch(Exception e) {
            Thread.currentThread().interrupt();
        }
        
    }
    public static void chapterOne(Adventurer hero, ArrayList<Items> inventory) {
        try {
            Scanner in = new Scanner(System.in);
            int attackChoice = 0;
            
            System.out.printf("%130s\n", "======================");
            System.out.printf("%130s\n", "--    CHAPTER ONE   --");
            System.out.printf("%130s\n", "-- THE HERO ACADEMY --");
            System.out.printf("%130s\n", "======================");
            System.out.println("\n\n\n\n\n\n\n\n\n");
            Thread.sleep(3000);
            System.out.println("\nSameer: Hello " + hero.getName() + "! Welcome to the Hero Academy!");
            Thread.sleep(3000);
            System.out.println("\nSameer: I am the Academy's Chief Professor, Sameer Fourteen Inches.");
            Thread.sleep(3000);
            System.out.println("\nSameer: Here, I will teach you the basics so you can start on your adventure!");
            Thread.sleep(4500);
            System.out.println("\n" + hero.getName() + ": Okay!");
            Thread.sleep(5000);
            System.out.println("\nSameer: Now, let us begin the Academy's lessons.\n");
            Thread.sleep(5000);
            System.out.println("\n\n\n---LESSON 1: ATTACKING---\n\n\n\n");
            Thread.sleep(3000);
            System.out.println("\nSameer: Okay, let's face a practice dummy.");
            Thread.sleep(5000);
            System.out.println("\n* A training dummy appears in front of you *");
            Thread.sleep(3000);
            System.out.println("\nSameer: Okay, each adventurer uses standard attacks with a specific weapon.");
            Thread.sleep(5000);
            if ((hero.getType()).equals("Warrior")) {
//              WARRIOR ACADEMY ARC
//              *******************
//              *******************
                System.out.println("\nSameer: As a 'Warrior' class, your weapon of choice is the sword.");
                Thread.sleep(3000);
                System.out.println("\n* " + hero.getName() + " has acquired a 'Sword'! *");
                Thread.sleep(5000);
                System.out.println("\nSameer: Your first attack will hit the monster you are facing with your weapon.");
                Thread.sleep(5000);
                System.out.println("\nSameer: To use this attack press the '1' key.");
                Thread.sleep(5000);
                System.out.println("\n" + hero.getName() + ": The 1 key!?");
                Thread.sleep(3000);
                System.out.println("\nSameer: err.. I mean swing your sword.");
                Thread.sleep(5000);
                System.out.println("\n" + hero.getName() + ": Okay!");
                Thread.sleep(7000);
                System.out.println("\nSameer: Now you will practice attacking!\n");
                Thread.sleep(4000);
                System.out.println("\n\n      [[[ BATTLE INITIATED ]]]\n");
                Thread.sleep(2000);
                System.out.println("\nPress the '1' key to swing your sword at the training dummy.\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your sword!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 2 damage to TrainingDummy!\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 3/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5\n");
                System.out.println();
                Thread.sleep(3000);
                System.out.println("\nSameer: Now finish the battle against the practice dummy.\n\n");
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 3/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5\n");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your sword!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 3 damage to TrainingDummy!\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 0/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(2000);
                System.out.println("\n\n\n      [[[ BATTLE FINISHED ]]]\n");
                Thread.sleep(3000);
                System.out.println(" \n* You defeated TrainingDummy! *");
                System.out.println("    * You gained 1 EXP * \n");
                hero.expGain(1);
                Thread.sleep(2000);
                System.out.println("Sameer: Congratulations on passing the first lesson!\n");
                Thread.sleep(1750);
                System.out.println("Sameer: Now onto the Academy's second lesson!\n");
                Thread.sleep(5000);
                System.out.println("\n\n\n---LESSON 2: ITEM USAGE---\n\n\n\n\n");
                Thread.sleep(2600);
                System.out.println("Sameer: Now I will teach you how to use your items during combat.\n");
                Thread.sleep(2000);
                System.out.println(hero.getName() + ": What can items do?\n");
                Thread.sleep(4000);
                System.out.println("Sameer: I'm glad you asked!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: The most common items are used as healing devices in battle.\n");
                Thread.sleep(3500);
                System.out.println("Sameer: Other, more rare ones, can even deal damage to your opponent!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: In order to use an item, you must first open up your inventory and then select an item to use.\n");
                Thread.sleep(3000);
                System.out.println("Sameer: Now, you will practice using items!\n");
                Thread.sleep(3000);
                System.out.println(hero.getName() + ": Okay!\n");
                Thread.sleep(6000);
                System.out.println("\n      [[[ BATTLE INITIATED ]]]\n");
                Thread.sleep(2000);
                hero.setCurrentSTA(-5);
                System.out.println("\nSameer: I lowered your health a little before the fight started.");
                Thread.sleep(2000);
                inventory.add(new Items("Novice Potion", 5, true));
                System.out.println("\nSameer: Now use the 'Novice Potion' I added to your inventory to heal yourself.");
                Thread.sleep(3000);
                System.out.println("\nPress the '2' key to open up your inventory.\n");
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 2) {
                    System.err.println("\nPlease type '2'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println("\nPress the '1' key to use the item 'Novice Potion'");
                if (attackChoice == 2) {
                    showInventory(inventory);
                }
                attackChoice = in.nextInt();
                while(attackChoice != 1) {
                    System.err.println("\nPlease select the item!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println("\nThe 'Novice Potion' healed 5 HP!\n");
                Thread.sleep(4000);
                hero.setCurrentSTA(5);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.println("\n\nSameer: Now finish the battle against the training dummy.");
                Thread.sleep(3000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your sword!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 4 damage to TrainingDummy2!\n");
                Thread.sleep(4000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 1/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your sword!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("You did 1 damage to TrainingDummy2!\n");
                Thread.sleep(4000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 0/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(2000);
                System.out.println("\n\n      [[[ BATTLE FINISHED ]]]\n");
                Thread.sleep(3000);
                System.out.println(" \n* You defeated TrainingDummy2! *");
                System.out.println("    * You gained 1 EXP * \n");
                hero.expGain(1);
                Thread.sleep(2000);
                System.out.println("Sameer: Congratulations on passing the second lesson!\n");
                Thread.sleep(1750);
                System.out.println("Sameer: Now onto the Academy's third lesson!\n");
                Thread.sleep(5000);
                System.out.println("\n\n\n---LESSON 3: SPELLCASTING ---\n\n\n\n");
                Thread.sleep(2600);
                System.out.println("Sameer: Now I will teach you how to cast spells during combat.\n");
                Thread.sleep(4000);
                System.out.println(hero.getName() + ": What do spells do?\n");
                Thread.sleep(5000);
                System.out.println("Sameer: Spells are invocations of great power that can create phenomena!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: The 'Warrior' spell is called 'Double or Nothin'.\n");
                Thread.sleep(5000);
                System.out.println(hero.getName() + ": What does that spell do?\n");
                Thread.sleep(4000);
                System.out.println("Sameer: You will either perform a critical hit...\n");
                Thread.sleep(3000);
                System.out.println("Sameer: ...Or miss completely!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: As a 'Warrior', you don't really rely on your spells to fight.\n");
                Thread.sleep(3000);
                System.out.println("Sameer: However, spells do come in handy sometimes.\n");
                Thread.sleep(5000);
                System.out.println(hero.getName() + ": Okay!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: Now you will practice using your spell!\n");
                Thread.sleep(4000);
                System.out.println("\n\n      [[[ BATTLE INITIATED ]]]\n");
                Thread.sleep(3000);
                System.out.println("\nPress the '3' key to perform your spell at the training dummy.\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n3. Spell");
                System.out.println();
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 3) {
                    System.err.println("\nPlease type '3'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println(" \nYou try to perform the attack but TrainingDummy3 defended!\n");
                Thread.sleep(5000);
                System.out.println("Sameer: Sometimes your spell will fail.. but keep trying!\n");
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n3. Spell\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 3) {
                    System.err.println("\nPlease type '3'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println(" \nYou try to perform the attack but TrainingDummy3 defended!");
                Thread.sleep(5000);
                System.out.println("Sameer: So close! Keep trying!\n");
                System.out.println();
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n3. Spell\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 3) {
                    System.err.println("\nPlease type '3'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("You swing your sword and perform a Divine Sword attack!\n\n");
                System.out.println("HIT! You did 5 damage to TrainingDummy3!");
                Thread.sleep(2000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 0/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(2000);
                System.out.println("\n\n      [[[ BATTLE FINISHED ]]]\n");
                Thread.sleep(3000);
                System.out.println(" \n* You defeated TrainingDummy3! *");
                System.out.println("    * You gained 1 EXP * \n");
                hero.expGain(1);
                Thread.sleep(2000);
                System.out.println("Sameer: Congratulations on passing the third and final lesson!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: You have passed all of the Academy's lessons!\n");
                Thread.sleep(3000);
                System.out.println("Sameer: I have taught you all I could and you passed with flying colors.\n");
                Thread.sleep(3500);
                System.out.println("Sameer: Now venture forth into the world and follow your own journey!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: Hooray!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: Bonzai!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: All Hail!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: Hen hao!\n");
                Thread.sleep(5000);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Thread.sleep(4000);
                System.out.printf("%130s\n", "======================");
                System.out.printf("%130s\n", "--      END OF      --");
                System.out.printf("%130s\n", "--   CHAPTER ONE    --");
                System.out.printf("%130s\n", "======================");
                System.out.println("\n\n\n\n\n\n\n\n\n");
                Thread.sleep(5000);
            } else {
//              MAGE ACADEMY ARC
//              *******************
//              *******************
                System.out.println("\nSameer: As a 'Mage' class, your weapon of choice is the staff.");
                Thread.sleep(3000);
                System.out.println("\n* " + hero.getName() + " has acquired a 'Staff'! *");
                Thread.sleep(5000);
                System.out.println("\nSameer: Your first attack will hit the monster you are facing with your weapon.");
                Thread.sleep(5000);
                System.out.println("\nSameer: To use this attack press the '1' key.");
                Thread.sleep(5000);
                System.out.println("\n" + hero.getName() + ": The 1 key!?");
                Thread.sleep(3000);
                System.out.println("\nSameer: err.. I mean swing your staff.");
                Thread.sleep(5000);
                System.out.println("\n" + hero.getName() + ": Okay!");
                Thread.sleep(7000);
                System.out.println("\nSameer: Now you will practice attacking!\n");
                Thread.sleep(4000);
                System.out.println("\n\n      [[[ BATTLE INITIATED ]]]\n");
                Thread.sleep(2000);
                System.out.println("\nPress the '1' key to swing your staff at the training dummy.\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 3/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your staff!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 1 damage to TrainingDummy!\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 2/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5\n");
                System.out.println();
                Thread.sleep(3000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your staff!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 1 damage to TrainingDummy!\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 1/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5\n");
                System.out.println();
                Thread.sleep(3000);
                System.out.println("\nSameer: Now finish the battle against the practice dummy.\n\n");
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 1/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5\n");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your staff!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 1 damage to TrainingDummy!\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 0/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(2000);
                System.out.println("\n\n\n      [[[ BATTLE FINISHED ]]]\n");
                Thread.sleep(3000);
                System.out.println(" \n* You defeated TrainingDummy! *");
                System.out.println("    * You gained 1 EXP * \n");
                hero.expGain(1);
                Thread.sleep(2000);
                System.out.println("Sameer: Congratulations on passing the first lesson!\n");
                Thread.sleep(1750);
                System.out.println("Sameer: Now onto the Academy's second lesson!\n");
                Thread.sleep(5000);
                System.out.println("\n\n\n---LESSON 2: ITEM USAGE---\n\n\n\n\n");
                Thread.sleep(2600);
                System.out.println("Sameer: Now I will teach you how to use your items during combat.\n");
                Thread.sleep(2000);
                System.out.println(hero.getName() + ": What can items do?\n");
                Thread.sleep(4000);
                System.out.println("Sameer: I'm glad you asked!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: The most common items are used as healing devices in battle.\n");
                Thread.sleep(3500);
                System.out.println("Sameer: Other, more rare ones, can even deal damage to your opponent!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: In order to use an item, you must first open up your inventory and then select an item to use.\n");
                Thread.sleep(3000);
                System.out.println("Sameer: Now, you will practice using items!\n");
                Thread.sleep(3000);
                System.out.println(hero.getName() + ": Okay!\n");
                Thread.sleep(6000);
                System.out.println("\n      [[[ BATTLE INITIATED ]]]\n");
                Thread.sleep(2000);
                hero.setCurrentSTA(-5);
                System.out.println("\nSameer: I lowered your health a little before the fight started.");
                Thread.sleep(2000);
                inventory.add(new Items("Novice Potion", 5, true));
                System.out.println("\nSameer: Now use the 'Novice Potion' I added to your inventory to heal yourself.");
                Thread.sleep(3000);
                System.out.println("\nPress the '2' key to open up your inventory.\n");
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 3/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 2) {
                    System.err.println("\nPlease type '2'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println("\nPress the '1' key to use the item 'Novice Potion'");
                if (attackChoice == 2) {
                    showInventory(inventory);
                }
                attackChoice = in.nextInt();
                while(attackChoice != 1) {
                    System.err.println("\nPlease select the item!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println("\nThe 'Novice Potion' healed 5 HP!\n");
                Thread.sleep(4000);
                hero.setCurrentSTA(5);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 3/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.println("\n\nSameer: Now finish the battle against the training dummy.");
                Thread.sleep(3000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your staff!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 1 damage to TrainingDummy2!\n");
                Thread.sleep(4000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 2/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your staff!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("You did 1 damage to TrainingDummy2!\n");
                Thread.sleep(4000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 1/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(2000);
                Thread.sleep(3000);
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s","You swing your staff!");
                Thread.sleep(1000);
                System.out.println();
                System.out.println("HIT! You did 1 damage to TrainingDummy2!\n");
                Thread.sleep(4000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy2] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 0/3");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(5000);
                System.out.println("\n\n      [[[ BATTLE FINISHED ]]]\n");
                Thread.sleep(3000);
                System.out.println(" \n* You defeated TrainingDummy2! *");
                System.out.println("    * You gained 1 EXP * \n");
                hero.expGain(1);
                Thread.sleep(2000);
                System.out.println("Sameer: Congratulations on passing the second lesson!\n");
                Thread.sleep(1750);
                System.out.println("Sameer: Now onto the Academy's third lesson!\n");
                Thread.sleep(5000);
                System.out.println("\n\n\n---LESSON 3: SPELLCASTING ---\n\n\n\n");
                Thread.sleep(2600);
                System.out.println("Sameer: Now I will teach you how to cast spells during combat.\n");
                Thread.sleep(4000);
                System.out.println(hero.getName() + ": What do spells do?\n");
                Thread.sleep(5000);
                System.out.println("Sameer: Spells are invocations of great power that can create phenomena!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: The 'Mage' can perform up to 5 different spells.\n");
                Thread.sleep(5000);
                System.out.println("Sameer: The 5 different spell types are Fire, Wind, Lightning, Earth, and Water.");
                Thread.sleep(6000);
                System.out.println("Sameer: As a 'Mage', these spells will be your main attacks to monsters.");
                Thread.sleep(3000);
                System.out.println(hero.getName() + ": Okay!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: Now you will practice using your spells!\n");
                Thread.sleep(4000);
                System.out.println("\n\n      [[[ BATTLE INITIATED ]]]\n");
                Thread.sleep(3000);
                System.out.println("\nPress the '3' key to perform your spell at the training dummy.\n");
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n3. Spell");
                System.out.println();
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 3) {
                    System.err.println("\nPlease type '3'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println(" \nYou try to perform the spell but TrainingDummy3 defended!\n");
                Thread.sleep(5000);
                System.out.println("Sameer: Keep trying!\n");
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n3. Spell\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 3) {
                    System.err.println("\nPlease type '3'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println(" \nYou try to perform the spells but TrainingDummy3 defended!");
                Thread.sleep(5000);
                System.out.println("Sameer: So close! \n");
                System.out.println();
                Thread.sleep(3000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 5/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                System.out.printf("\n\n%20s", "Choices: ");
                System.out.println("\n1. Attack\n2. Item\n3. Spell\n");
                System.out.printf("Choose: ");
                attackChoice = in.nextInt();
                Thread.sleep(3000);
                while(attackChoice != 3) {
                    System.err.println("\nPlease type '3'!\n");
                    System.out.printf("Choose: ");
                    attackChoice = in.nextInt();
                    Thread.sleep(3000);
                }
                System.out.println();
                System.out.printf("%-25s", "You cast a Fire Spell!");
                Thread.sleep(1000);
                System.out.println("HIT! You did 5 damage to TrainingDummy3!");
                Thread.sleep(2000);
                System.out.printf("%-25s","[" + hero.getName() + "] Lv." + hero.getLevel());
                System.out.printf("%-25s\n","[TrainingDummy3] Lv. 1");
                System.out.printf("%-25s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-25s\n", "HP: 0/5");
                System.out.printf("%-25s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-25s", "MP: 5/5");
                Thread.sleep(2000);
                System.out.println("\n\n      [[[ BATTLE FINISHED ]]]\n");
                Thread.sleep(3000);
                System.out.println(" \n* You defeated TrainingDummy3! *");
                System.out.println("    * You gained 1 EXP * \n");
                hero.expGain(1);
                Thread.sleep(2000);
                System.out.println("Sameer: Congratulations on passing the third and final lesson!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: Since now that you have performed the spell, you will always be able to cast it!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: You have passed all of the Academy's lessons!\n");
                Thread.sleep(3000);
                System.out.println("Sameer: I have taught you all I could and you passed with flying colors.\n");
                Thread.sleep(3500);
                System.out.println("Sameer: Now venture forth into the world and follow your own journey!\n");
                Thread.sleep(4000);
                System.out.println("Sameer: Hooray!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: Bonzai!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: All Hail!\n");
                Thread.sleep(2000);
                System.out.println("Sameer: Hen hao!\n");
                Thread.sleep(5000);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Thread.sleep(4000);
                System.out.printf("%130s\n", "======================");
                System.out.printf("%130s\n", "--      END OF      --");
                System.out.printf("%130s\n", "--   CHAPTER ONE    --");
                System.out.printf("%130s\n", "======================");
                System.out.println("\n\n\n\n\n\n\n\n\n");
                Thread.sleep(5000);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void chapterTwo(Adventurer hero, ArrayList<Items> inventory) {
        try{    
            
        } catch(Exception e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void showInventory(ArrayList<Items> inventory) {
        System.out.println("\nChoose an item: ");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.print((i+1) + ". " + inventory.get(i).getName());
            if (inventory.get(i).getHeal() == true) {
                System.out.println(" (Heals " + inventory.get(i).getAmount() + " HP)");
            }
            else {
                System.out.println(" (Deals " + inventory.get(i).getAmount() + " Damage)");
            }
        }
        System.out.println((inventory.size() + 1) + ". Exit inventory\n");
        System.out.printf("Choose: ");
    }
}
