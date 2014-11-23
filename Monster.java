import java.util.*;

public class Monster extends Character {
    private int exp;
    ArrayList<Monster> monsterList = new ArrayList<Monster>();
    
    public void monsterCreate() {
        monsterList.add(new Monster("TrainingDummy", 5, 5, 0, 0, 1, 1, 0, 1)); //0
        monsterList.add(new Monster("TrainingDummy2", 5, 5, 0, 0, 1, 1, 0, 1)); //1
        monsterList.add(new Monster("TrainingDummy3", 5, 5, 0, 0, 1, 1, 0, 1)); //2
        monsterList.add(new Monster("Harrison", 10, 10, 1, 0, 3, 3, 1, 3)); //3
        monsterList.add(new Monster("Slime", 7, 7, 2, 0, 1, 1, 0, 2)); //4
        monsterList.add(new Monster("Blob", 8, 8, 1, 0, 1, 1, 0, 2)); //5
        monsterList.add(new Monster("Pig", 7, 7, 3, 0, 1, 1, 0, 3)); //6
        monsterList.add(new Monster("Skeleton", 9, 9, 2, 0, 1, 1, 0, 2)); //7
        monsterList.add(new Monster("Undead", 9, 9, 1, 0, 2, 2, 0, 1)); //8
        monsterList.add(new Monster("WeakAdventurer", 10, 10, 1, 0, 3, 3, 1, 3)); //9
    }
    public Monster(String name, int sta, int currentsta, int dex, 
                   int intel, int clar, int currentclar, int level, int exp) {
        super(name, sta, currentsta, dex, intel, clar, currentclar, level);
        this.exp = exp;
    }
    public int getEXP() {
        return this.exp;
    }
    public Monster monsterSearch(Adventurer hero) {
        Random rand = new Random();
        int randomNum = rand.nextInt() * 10;
        int level = hero.getLevelTens();
        int chooser = randomNum + level * 10;
        return monsterList.get(chooser);
    }
    public Monster getMonster(int choice) {
        return monsterList.get(choice);
    }
}
