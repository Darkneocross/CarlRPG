public class Character {
    private String name; //Name
    private int sta; //Health
    private int currentsta; //Current health
    private int dex; //Max Damage
    private int intel; //Max magic damage
    private int clar; //Max mana
    private int currentclar;//current mana
    private int level;//levelup!
    
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
    public int getLevelTens() {
        return this.level / 10;
    }
    
    public void setSTA(int sta) {
        this.sta = this.sta + sta;
    }
    public void setCurrentSTA(int currentsta) {
        this.currentsta = this.currentsta + currentsta;
    }
    public void setDEX(int dex) {
        this.dex = this.dex + dex;
    }
    public void setINT(int intel) {
        this.intel = this.intel + intel;
    }
    public void setCLAR(int clar) {
        this.clar = this.clar + clar;
    }
    public void setCurrentCLAR(int currentclar) {
        this.currentclar = currentclar;
    }
    public void levelUp() {
        this.level = this.level + 1;
    }
}

