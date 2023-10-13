import Characters.BountyHunters.BobaFett;
import Characters.Jedi.AnakinSkywalker;
import Characters.Character;
import Characters.Sith.DarthVader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("*   Welcome to Star Wars Character Battle   *");
        System.out.println("*********************************************");
        System.out.println();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Player " + (i + 1) + "- Choose the character you want to play as :");
            
            System.out.println("1. Anakin Skywalker");
            System.out.println("2. Darth Vader");
            System.out.println("3. Boba Fett");
            
            Scanner scan = new Scanner(System.in);
            int choice;
            
            Character[] player = new Character[2];
            String[] playerName = new String[2];
            
            do {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        player[i] = new AnakinSkywalker();
                        playerName[i] = "Anakin Skywalker";
                        break;
                    
                    case 2:
                        player[i] = new DarthVader();
                        playerName[i] = "Darth Vader";
                        break;
                    
                    case 3:
                        player[i] = new BobaFett();
                        playerName[i] = "Boba Fett";
                        break;
                    
                    default:
                        System.out.println("Invalid option");
                }
            } while (choice < 1 || choice > 3);//Change the condition when more characters are added
            
            System.out.println("Player " + (i + 1) + " chose " + playerName[i]);
        }
    }
}