package Powers;

import Characters.Character;

import java.util.concurrent.ThreadLocalRandom;

public class SithPower {
    private String name;
    private int powerCost;
    private int minPowerDmg;
    private int maxPowerDmg;
    private int powerHeal;
    
    public SithPower(String name, int powerCost, int minPowerDmg, int maxPowerDmg, int powerHeal) {
        this.name = name;
        this.powerCost = powerCost;
        this.minPowerDmg = minPowerDmg;
        this.maxPowerDmg = maxPowerDmg;
        this.powerHeal = powerHeal;
    }
    
    public void forceLightning(Character player, Character opponent) {
        // Attack for x amount of powerdmg
        //Reduce mana if attack is successful
        //Reduce health if attack is successful
        
        if (powerCost <= player.getMana()) {
            int powerDmg = ThreadLocalRandom.current().nextInt(getMinPowerDmg(), getMaxPowerDmg() + 1);
            reduceHealth(opponent, powerDmg);
            if (opponent.getHealth() <= 0) {
                System.out.println("Player wins!");
            }
            
            reduceMana(player);
        } else {
            System.out.println("Not enough Mana to perform Force Lightning.");
        }
        
    }
    
    public void forceLifeSteal(Character player, Character opponent) {
        // Deal x amount of dmg and give to player as health
        // Reduce mana if attack is successful
        // Reduce health if attack is successful
        
        if (powerCost <= player.getMana()) {
            int powerDmg = ThreadLocalRandom.current().nextInt(getMinPowerDmg(), getMaxPowerDmg() + 1);
            reduceHealth(opponent, powerDmg);
            
            int newHealth = player.getHealth() + powerDmg;
            int orgHealth = player.getHealth();
            
            if (newHealth > orgHealth) {
                newHealth = orgHealth;
            }
            
            player.setHealth(newHealth);
            reduceMana(player);
            
        } else {
            System.out.println("Not enough Mana to perform Force LifeSteal.");
        }
        
    }
    
    public void forceFocusedRage(Character player) {
        // Increase attack dmg by 25% and add x amount of health
        //Reduce mana if attack is successful
        //newMinAttack & newMaxAttack = int, not double
        
        if (powerCost <= player.getMana()) {
            int newMinAttack = (int) (player.getMinPhysicalAttack() * 1.25);
            int newMaxAttack = (int) (player.getMaxPhysicalAttack() * 1.25);
            
            player.setMinPhysicalAttack(newMinAttack);
            player.setMaxPhysicalAttack(newMaxAttack);
            
            int newHealth = player.getHealth() + powerHeal;
            int orgHealth = player.getHealth();
            
            if (newHealth > orgHealth) {
                newHealth = orgHealth;
            }
            
            reduceMana(player);
            player.setHealth(newHealth);
            
        } else {
            System.out.println("Not enough mana to perform Focused rage.");
        }
        
    }
    
    public void reduceMana(Character character) {
        int newMana = character.getMana() - powerCost;
        character.setMana(newMana);
    }
    
    public void reduceHealth(Character character, int powerDmg) {
        int newHealth = character.getHealth() - powerDmg;
        character.setHealth(newHealth);
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
