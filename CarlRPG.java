import java.util.Scanner;

public class CarlRPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        String classChoice = "";
                try {
        System.out.printf("%122s","Hello! Welcome to the Carl RPG!\n");

        Thread.sleep(3000);
            
        System.out.printf("%126s","Please enter the name of your adventurer:\n");
        name = in.nextLine();
        Thread.sleep(1500);
        System.out.println("Okay " + name + " please pick your class to start your adventure!");
        System.out.println("Warrior | Mage");
        classChoice = in.nextLine();
        classChoice = classChoice.toLowerCase();
        while(!classChoice.equals("warrior")&&!classChoice.equals("mage")) {
            System.err.println("Please enter a valid class!");
            classChoice = in.nextLine();
            classChoice = classChoice.toLowerCase();
        }
        Thread.sleep(1500);
        if (classChoice.equals("warrior")) {
            Adventurer hero = new Adventurer(name, 20, 20, 3, 1, 3, 3, 1, 0, "warrior");
        } else {
            Adventurer hero = new Adventurer(name, 15, 15, 1, 4, 8, 8, 1, 0,"mage");
        }
        System.out.println("NAME:" + name);
//        System
        
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