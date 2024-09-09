import java.util.*;
import jdk.jshell.spi.ExecutionControl;

public class Main{
    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Are you ready? \nPress P to Play or E to Exit");
            String play_decision = sc.nextLine();

            if (play_decision.equals("p")){
                System.out.println("Choose Player from John\\ Ben \\ Stacy\nEnter the name of the Player: ");
                String Player_name = sc.nextLine();
                Player_name = Player_name.toLowerCase();
                Player_name = Player_name.trim();
                switch (Player_name) {
                    case "john":
                        Player john = new Player("John", new String[4]);
                        break;
                    case "ben":
                        Player ben = new Player("Ben", new String[4]);
                        break;
                    case "stacy":
                        Player stacy = new Player("Stacy", new String[4]);
                        break;
                    default:
                        throw new AssertionError();
                }
                // Storyline: 
                // Player will  use map to navigate, health kit sets health to 100, while fruit increases health by 25
                // Sword will be used to kill the monster in the cave
                // Health kit is the entrance of the cave
                // The cave is in the forest

                // The person wakes up with 25% health on the beach where he finds the map
                // He goes to the forest to eat fruit
                // He eats fruit and looks for the sword
                // Adds sword to his inventory
                // Then goes to the cave and before entering uses health kit to make health 100
                // Then he kills the monster with his sword on the third strike
                // Display message: winner, Game End. Press P to play again and E to exit
            }
            else if (play_decision.equals("p")){
                System.out.println("End Game");
                break;
            }
            else{
                System.out.println("Wrong Key Entered");
            }
        }
    }
}