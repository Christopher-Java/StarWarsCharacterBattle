package Characters.Jedi;

import Characters.Characters;
import Powers.JediPower;

public class AnakinSkywalker extends Jedi {
    public AnakinSkywalker() {
        super("Anakin Skywalker", 100, 20, 30, 100);
    }
    
    public void useForceSpeed() {
        JediPower forceSpeed = new JediPower("Force Speed", 30, getMinPhysicalAttack(), getMaxPhysicalAttack(), 0);
        forceSpeed.forceSpeed(this);
    }
    
    public void useForceSuperNova(Characters opponent) {
        JediPower forceSuperNova = new JediPower("Force Supernova", 40, 50, 60, 0);
        forceSuperNova.forceSuperNova(this, opponent);
    }
    
    public void useForceHeal() {
        JediPower forceHeal = new JediPower("ForceHeal", 30, 0, 0, 40);
        forceHeal.forceHeal(this);
    }
}
