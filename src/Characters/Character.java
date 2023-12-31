package Characters;

import java.util.concurrent.ThreadLocalRandom;

public class Character {
    private String name;
    private int health;
    private int minPhysicalAttack;
    private int maxPhysicalAttack;
    private int mana;
    
    
    public Character(String name, int health, int minPhysicalAttack, int maxPhysicalAttack, int mana) {
        this.name = name;
        this.health = health;
        this.minPhysicalAttack = minPhysicalAttack;
        this.maxPhysicalAttack = maxPhysicalAttack;
        this.mana = mana;
    }
    
    public int normalAttack() {
        int attack = ThreadLocalRandom.current().nextInt(getMinPhysicalAttack(), getMaxPhysicalAttack() + 1);
        return attack;
    }
    
    public int performAttack() {
        int physicalDmg = normalAttack();
        reduceHealth(physicalDmg);
        return physicalDmg;
        /*
        Implement missedAttack?
        Random number between 1-10, if result is 1 or 2 attack will miss otherwise successful attack
         */
    }
    
    private void reduceHealth(int physicalDmg) {
        health -= physicalDmg;
        
        if (health <= 0) {
            System.out.println("Someone died!");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getMinPhysicalAttack() {
        return minPhysicalAttack;
    }
    
    public void setMinPhysicalAttack(int minPhysicalAttack) {
        this.minPhysicalAttack = minPhysicalAttack;
    }
    
    public int getMaxPhysicalAttack() {
        return maxPhysicalAttack;
    }
    
    public void setMaxPhysicalAttack(int maxPhysicalAttack) {
        this.maxPhysicalAttack = maxPhysicalAttack;
    }
    
    public int getMana() {
        return mana;
    }
    
    public void setMana(int mana) {
        this.mana = mana;
    }
}
