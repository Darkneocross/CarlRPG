public class Character {
    private String name;
    private int sta;
    private int currentsta;
    private int dex;
    private int intel;
    private int clar;
    private int currentclar;
    private int level;
    
    public Character(String name, int sta, int currentsta, int dex, 
                     int intel, int clar, int currentclar, int level) {
        this.name = name;
        this.sta = sta;
        this.currentsta = currentsta;
        this.dex = dex;
        this.intel = intel;
        this.clar = clar;
        this.currentclar = currentclar;
        this.level = level;
    }
    
    public String getName() {
        return this.name;
    }
    public int getSTA() {
        return this.sta;
    }
    public int getCurrentSTA() {
        return this.currentsta;
    }
    public int getDEX() {
        return this.dex;
    }
    public int getINT() {
        return this.intel;
    }
    public int getCLAR() {
        return this.clar;
    }
    public int getCurrentCLAR() {
        return this.currentclar;
    }
    public int getLevel() {
        return this.level;
    }
    
    public void setCurrentSTA(int currentsta) {
        this.currentsta = currentsta;
    }
    public void setCurrentCLAR(int currentclar) {
        this.currentclar = currentclar;
    }
    public void levelUp() {
        this.level = this.level + 1;
    }
    
    
}

