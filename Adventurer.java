public class Adventurer extends Character {
    private int exp; //exp needed for a level
    private int currentexp; //current Exp
    private String type; //class
    
    public Adventurer(String name, int money, int sta, int currentsta, int dex, 
                      int intel, int clar, int currentclar, int level,
                      int exp, int currentexp, String type) {
        super(name, money, sta, currentsta, dex, intel, clar, currentclar, level);
        this.exp = exp;
        this.currentexp = currentexp;
        this.type = type;
    }
    
    public int getEXP() {
        return this.exp;
    }
    public String getType() {
        return this.type;
    }
    
    public void expGain(int expGained) {
        this.currentexp = this.currentexp + expGained;
    }
    public void statsUp(Adventurer hero, int level) {
        if (hero.getType().equals("Warrior")) {
            hero.setSTA(1);
            if ((hero.getLevel() % 3) == 0) {
                hero.setDEX(1);
            }
            if ((hero.getLevel() % 5) == 0) {
                hero.setINT(1);
            }
            if ((hero.getLevel() % 4) == 0) {
                hero.setCLAR(1);
            }
        }
    }
}