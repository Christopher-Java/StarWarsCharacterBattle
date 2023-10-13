package Characters.BountyHunters;

import Characters.Characters;
import Powers.BountyHunterPower;

public class BobaFett extends BountyHunter {
    
    public BobaFett() {
        super("Boba Fett", 100, 25, 30, 100);
    }
    
    public void gunAttack() {
        //Regular attack
        performAttack();
    }
    
    public void rocketBlast(Characters opponent) {
        BountyHunterPower rocketBlast = new BountyHunterPower("RocketBlast", 30, 25, 35, 0);
        rocketBlast.rocketBlast(this, opponent);
    }
    
    public void bullsEye(Characters opponent) {
        BountyHunterPower bullsEye = new BountyHunterPower("BullsEye", 45, 0, 0, 0);
        bullsEye.bullsEye(this, opponent);
    }
    
    public void medKit() {
        BountyHunterPower medKit = new BountyHunterPower("MedKit", 25, 0, 0, 30);
        medKit.medKit(this);
    }
}
