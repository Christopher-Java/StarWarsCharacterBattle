package Characters.Sith;

import Powers.SithPower;
import Characters.Character;

public class DarthVader extends Sith {
    
    public DarthVader() {
        super("Darth Vader", 100, 25, 35, 100);
    }
    
    public void lightSaberAttack(){
        //Lightsaber attack
        performAttack();
    }
    
    
    public void forceLightning(Character opponent) {
        SithPower forceLightning = new SithPower("Force Lightning", 30, 30, 40, 0);
        forceLightning.forceLightning(this, opponent);
        
    }
    
    public void forceLifeSteal(Character opponent) {
    SithPower forceLifeSteal = new SithPower("Life Steal", 30,30,40,0);
    forceLifeSteal.forceLifeSteal(this,opponent);
    }
    
    public void forceFocusedRage() {
        SithPower forceFocusedRage = new SithPower("Focused rage", 40,0,0,30);
        forceFocusedRage.forceFocusedRage(this);
    
    }
}
