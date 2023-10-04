package Powers;

public class BountyHunterPower {
    private String name;
    private int powerCost;
    private int minPowerDmg;
    private int maxPowerDmg;
    private int powerHeal;
    
    public BountyHunterPower(String name, int powerCost, int minPowerDmg, int maxPowerDmg, int powerHeal) {
        this.name = name;
        this.powerCost = powerCost;
        this.minPowerDmg = minPowerDmg;
        this.maxPowerDmg = maxPowerDmg;
        this.powerHeal = powerHeal;
    }
    
    public void rocketBlast() {
        // Attack for x amount of powerdmg
    }
    
    public void bullsEye() {
        // Double attackDmg
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPowerCost() {
        return powerCost;
    }
    
    public void setPowerCost(int powerCost) {
        this.powerCost = powerCost;
    }
    
    public int getMinPowerDmg() {
        return minPowerDmg;
    }
    
    public void setMinPowerDmg(int minPowerDmg) {
        this.minPowerDmg = minPowerDmg;
    }
    
    public int getMaxPowerDmg() {
        return maxPowerDmg;
    }
    
    public void setMaxPowerDmg(int maxPowerDmg) {
        this.maxPowerDmg = maxPowerDmg;
    }
    
    public int getPowerHeal() {
        return powerHeal;
    }
    
    public void setPowerHeal(int powerHeal) {
        this.powerHeal = powerHeal;
    }
}
