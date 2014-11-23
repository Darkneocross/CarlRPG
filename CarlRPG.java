import java.util.Scanner;

public class CarlRPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        String classChoice = "";
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        try {
            
            System.out.printf("%140s","Hello! Welcome to the Carl RPG!\n\n\n\n\n\n");
            
            Thread.sleep(3000);
            System.out.println("Please enter the name of your adventurer:\n");
            name = in.nextLine();
            Thread.sleep(1500);
            System.out.println("\nOkay " + name + " please pick a class to start your adventure!\n");
            System.out.println("Warrior | Mage\n");
            classChoice = in.nextLine();
            classChoice = classChoice.toLowerCase();
            while(!classChoice.equals("warrior")&&!classChoice.equals("mage")) {
                System.err.println("\nPlease enter a valid class!\n");
                classChoice = in.nextLine();
                classChoice = classChoice.toLowerCase();
            }
            Thread.sleep(1500);
            Adventurer hero;
            if (classChoice.equals("warrior")) {
                hero = new Adventurer(name, 20, 20, 4, 1, 3, 3, 1, 0,"Warrior");
            } else {
                hero = new Adventurer(name, 15, 15, 1, 4, 8, 8, 1, 0,"Mage");
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
            Thread.sleep(250);
            System.out.println("MAX MAGIC ATTACK: " + hero.getINT() + "\n\n\n\n");
            Thread.sleep(750);
            System.out.println("[" + name + "] \n\nHP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
            System.out.println("\nMP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
            System.out.println("\nGOOD LUCK ON YOUR NEW ADVENTURE!");
            Thread.sleep(5000);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            academy(hero);
        } catch(Exception e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void academy(Adventurer hero) {
        try {
            Scanner in = new Scanner(System.in);
            int attackChoice = 0;
            
            System.out.println("\nSameer: Hello " + hero.getName() + "! Welcome to the Hero Academy!");
            Thread.sleep(3000);
            System.out.println("\nSameer: Here, I will teach you the basics so you can start on your adventure!");
            Thread.sleep(4500);
            System.out.println("\n" + hero.getName() + ": Okay!");
            Thread.sleep(5000);
            System.out.println("\nSameer: Okay let's face a practice dummy.");
            Thread.sleep(5000);
            System.out.println("\n* A training dummy appears in front of you *");
            Thread.sleep(5000);
            System.out.println("\nSameer: Okay, so you have a standard set of attacks.");
            Thread.sleep(5000);
            if ((hero.getType()).equals("Warrior")) {
                System.out.println("\nSameer: Your first attack will hit the monster you are facing with your weapon.");
                Thread.sleep(5000);
                System.out.println("\nSameer: To use this attack press the '1' key.");
                Thread.sleep(5000);
                System.out.println("\n" + hero.getName() + ": The 1 key!?");
                Thread.sleep(3000);
                System.out.println("\nSameer: err.. I mean swing your sword.");
                Thread.sleep(5000);
                System.out.println("\n" + hero.getName() + ": Okay!");
                System.out.println("\nPress the '1' key to swing your sword at the training dummy\n");
                attackChoice = in.nextInt();
                while(attackChoice != 1) {
                    System.err.println("\nPlease type '1'!\n");
                    attackChoice = in.nextInt();
                }
                System.out.println(" \n* You did 2 damage to the training dummy! * \n");
                System.out.printf("%-20s","[" + hero.getName() + "]");
                System.out.printf("%-20s\n","[TrainingDummy]");
                System.out.printf("%-20s","HP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
                System.out.printf("%-20s\n", "HP: 3/5");
                System.out.printf("%-20s", "MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
                System.out.printf("%-20s", "MP: 5/5");
            } else {
            }
            
        } catch(Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
