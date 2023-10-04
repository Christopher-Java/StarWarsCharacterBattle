package Powers;

import Characters.Characters;

import java.util.concurrent.ThreadLocalRandom;

public class JediPower {
    private String name;
    private int powerCost;
    private int minPowerDmg;
    private int maxPowerDmg;
    private int powerHeal;
    
    public JediPower(String name, int powerCost, int minPowerDmg, int maxPowerDmg, int powerHeal) {
        this.name = name;
        this.powerCost = powerCost;
        this.minPowerDmg = minPowerDmg;
        this.maxPowerDmg = maxPowerDmg;
        this.powerHeal = powerHeal;
    }
    
    public void forceSpeed(Characters player) {
        //Physical attack twice in a row if powerCost is less than or equal to mana
        //Reduce mana if attack is successful
        //Reduce health occurs in performAttack()
        
        if (powerCost <= player.getMana()) {
            for (int i = 0; i < 2; i++) {
                player.performAttack();
            }
            
            reduceMana(player);
            
        } else {
            System.out.println("Not enough mana to perform Force Speed.");
        }
    }
    public void forceHeal(Characters player) {
        // Heal for x amount of health
        // Make sure newHealth doesnt go beyond original health
        
        if (powerCost <= player.getMana()) {
            
            int newHealth = player.getHealth() + powerHeal;
            int orgHealth = player.getHealth();
            
            if (newHealth > orgHealth) {
                newHealth = orgHealth;
            }
            player.setHealth(newHealth);
            
            reduceMana(player);
            
        } else {
            System.out.println("Unable to perform Force Heal. Not enough Mana.");
        }
    }
    
    public void forceSuperNova(Characters player, Characters opponent) {
        //High risk, high reward
        //Deal large amount of damage to the opponent and half(?) as much damage to the user
        if (powerCost <= player.getMana()) {
            int powerDmg = ThreadLocalRandom.current().nextInt(getMinPowerDmg(), getMaxPowerDmg() + 1);
            
            reduceHealth(opponent, powerDmg);
            
            int newPowerDmg = powerDmg / 2;
            reduceHealth(player, newPowerDmg);
            
            reduceMana(player);
            
            if (player.getHealth() <= 0) {
                System.out.println("Player 1 died. Opponent wins!");
                
            } else if (opponent.getHealth() <= 0) {
                System.out.println("Opponent died. Player 1 wins!");
            }
            
        } else {
            System.out.println("Not enough mana to perform Force Supernova.");
        }
    }
    
    public void reduceHealth(Characters character, int powerDmg) {
        int newHealth = character.getHealth() - powerDmg;
        character.setHealth(newHealth);
    }
    
    public void reduceMana(Characters character) {
        int newMana = character.getMana() - powerCost;
        character.setMana(newMana);
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
