public class Items {
    private String name; //name of item
    private int amount; //the potency of the item
    private boolean heal; //decides if item heals or damages
    
    public Items(String name, int amount, boolean heal) {
        this.name = name;
        this.amount = amount;
        this.heal = heal;
    }
    
    public String getName() {
        return name;
    }
    public int getAmount() {
        return amount;
    }
    public boolean getHeal() {
        return heal;
    }
}