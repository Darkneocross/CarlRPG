import java.util.Scanner;

public class CarlRPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        String classChoice = "";
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try {
        System.out.printf("%130s","Hello! Welcome to the Carl RPG!\n\n\n\n\n\n");

        Thread.sleep(3000);
            
        System.out.println("Please enter the name of your adventurer:\n");
        name = in.nextLine();
        Thread.sleep(1500);
        System.out.println("\nOkay " + name + " please pick a class to start your adventure!\n");
        System.out.println("Warrior | Mage\n");
        classChoice = in.nextLine();
        classChoice = classChoice.toLowerCase();
        while(!classChoice.equals("warrior")&&!classChoice.equals("mage")) {
            System.err.println("\nPlease enter a valid class!");
            classChoice = in.nextLine();
            classChoice = classChoice.toLowerCase();
        }
        Thread.sleep(1500);
        Adventurer hero;
        if (classChoice.equals("warrior")) {
            hero = new Adventurer(name, 20, 20, 4, 1, 3, 3, 1, 0,"warrior");
        } else {
            hero = new Adventurer(name, 15, 15, 1, 4, 8, 8, 1, 0,"mage");
        }
        System.out.println("\nCREATING CHARACTER\n");
        Thread.sleep(1500);
        System.out.println("...\n");
        Thread.sleep(250);
        System.out.println("NAME: " + name + "\n");
        Thread.sleep(1500);
        System.out.println("CLASS: " + hero.getName() + "\n");
        Thread.sleep(500);
        System.out.println("MAX HP: " + hero.getSTA() + "\n");
        Thread.sleep(600);
        System.out.println("MAX MP: " + hero.getCLAR() + "\n");
        Thread.sleep(1500);
        System.out.println("MAX ATTACK: " + hero.getDEX() + "\n");
        Thread.sleep(250);
        System.out.println("MAX MAGIC ATTACK: " + hero.getINT() + "\n\n\n\n");
        Thread.sleep(750);
        System.out.println("[" + name + "] \nHP: " + hero.getCurrentSTA() + "/" + hero.getSTA());
        System.out.println("MP: " + hero.getCurrentCLAR() + "/" + hero.getCLAR());
        System.out.println("GOOD LUCK ON YOUR NEW ADVENTURE!");

        
        
        
                } catch(Exception e) {
                    Thread.currentThread().interrupt();
        }
    }
}
class Battle {
    public boolean isFinished() {
        return true;
    }
}
