import Characters.BountyHunters.BobaFett;
import Characters.Jedi.AnakinSkywalker;
import Characters.Character;
import Characters.Sith.DarthVader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till Star Wars Character Battle!");
        System.out.println("Välj vilken karaktär du vill spela som.");
        
        System.out.println("1. Anakin Skywalker");
        System.out.println("2. Darth Vader");
        System.out.println("3. Boba Fett");
        
        Scanner scan = new Scanner(System.in);
        int choice;
        
        Character player = null;
        String playerName = "";
        
        do {
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    player = new AnakinSkywalker();
                    playerName = "Anakin Skywalker";
                    break;
                
                case 2:
                    player = new DarthVader();
                    playerName = "Darth Vader";
                    break;
                
                case 3:
                    player = new BobaFett();
                    playerName = "Boba Fett";
                    break;
                
                default:
                    System.out.println("Ogiltigt val!");
            }
        } while (choice < 1 || choice > 3);
        
    }
}