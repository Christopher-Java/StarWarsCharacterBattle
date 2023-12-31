package Powers;

import Characters.Character;

import java.util.concurrent.ThreadLocalRandom;

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
    
    public void rocketBlast(Character player, Character opponent) {
        /// Attack for x amount of powerdmg
        //Reduce mana if attack is successful
        //Reduce health if attack is successful
        
        if (powerCost <= player.getMana()) {
            int powerDmg = ThreadLocalRandom.current().nextInt(getMinPowerDmg(), getMaxPowerDmg() + 1);
            reduceHealth(opponent, powerDmg);
            if (opponent.getHealth() <= 0) {
                System.out.println("Opponent died. Player wins!");
            }
            
            reduceMana(player);
            
        } else {
            System.out.println("Not enough Mana to perform Rocket blast.");
        }
    }
    
    public void bullsEye(Character player, Character opponent) {
        // BullsEye = normalAttack + 50% physicalDmg
        //Reduce mana if attack is successful
        //Reduce health if attack is successful
        
        if (powerCost <= player.getMana()) {
            int bullsEye = (int) (player.normalAttack() * 1.5);
            reduceHealth(opponent, bullsEye);
            
            reduceMana(player);
        } else {
            System.out.println("Not enough Mana to perform BullsEye");
        }
    }
    
    public void medKit(Character player) {
        // Heal user for x HP
        // New HP shouldnt go beyond original HP
        
        if (powerCost <= player.getMana()) {
            
            int newHealth = player.getHealth() + powerHeal;
            int orgHealth = player.getHealth();
            
            if (newHealth > orgHealth) {
                newHealth = orgHealth;
            }
            player.setHealth(newHealth);
            reduceMana(player);
            
        } else {
            System.out.println("Not enough Mana to perform medKit");
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
