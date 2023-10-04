package Characters.Sith;

import Powers.SithPower;
import Characters.Characters;

import java.util.concurrent.ThreadLocalRandom;

public class DarthVader extends Sith {
    
    public DarthVader() {
        super("Darth Vader", 100, 25, 35, 100);
    }
    
    public void attack(){
        //Lightsaber attack
    }
    
    
    public void forceLightning(Characters opponent) {
        SithPower forceLightning = new SithPower("Force Lightning", 30, 30, 40, 0);
        forceLightning.forceLightning(this, opponent);
        
    }
    
    public void forceLifeSteal(Characters opponent) {
    SithPower forceLifeSteal = new SithPower("Life Steal", 30,30,40,0);
    forceLifeSteal.forceLifeSteal(this,opponent);
    }
    
    public void forceFocusedRage() {
        SithPower forceFocusedRage = new SithPower("Focused rage", 40,0,0,30);
        forceFocusedRage.forceFocusedRage(this);
    
    }
}
