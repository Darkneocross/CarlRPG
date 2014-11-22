public class Adventurer extends Character {
    private int exp;
    private String type;
    
    public Adventurer(String name, int sta, int currentsta, int dex, 
                      int intel, int clar, int currentclar, int level,
                      int exp, String type) {
        super(name, sta, currentsta, dex, intel, clar, currentclar, level);
        this.exp = exp;
        this.type = type;
    }
    
    public void expGain(int expGained) {
        this.exp = this.exp + expGained;
    }
}