package Characters.BountyHunters;

import Characters.Characters;
import Powers.BountyHunterPower;

public class BobaFett extends BountyHunter {
    
    public BobaFett() {
        super("Boba Fett", 100, 25, 30, 100);
    }
    
    public void rocketBlast(Characters opponent){
        BountyHunterPower rocketBlast = new BountyHunterPower("RocketBlast", 30,25,35,0);
        rocketBlast.rocketBlast(this,opponent);
    }
}
