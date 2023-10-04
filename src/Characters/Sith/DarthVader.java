package Characters.Sith;

import Powers.SithPower;
import Characters.Characters;

public class DarthVader extends Sith{
    
    public DarthVader() {
        super("Darth Vader", 100, 25, 35, 100);
    }
    
    public void forceLightning(Characters opponent){
        SithPower forceLightning = new SithPower("Force Lightning", 30,30,40,0);
        forceLightning.forceLightning(this,opponent );
    
    }
    
    public void forceLifeSteal(){
    
    }
    
    public void forceFocusedRage(){
    
    }
}
