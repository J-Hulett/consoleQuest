package userIO;

import World.Dungeon;
import characters.Character;
import characters.Warrior;
import gameRuntimeOperations.MainGameThread;
import player.User;

import java.util.Scanner;

public class UserInput {
    Scanner inputScanner = new Scanner(System.in);

    public String getUserInput() {
        String userSelection = inputScanner.nextLine();
        return userSelection.trim().toUpperCase();
    }

    public void continueFromWelcomeScreen(MainGameThread mainGameThread) {
        String selction = getUserInput();
        switch (selction) {
            case "Y":
                mainGameThread.setSelecting(true);
                mainGameThread.setStarted(false);
                break;
            case "N":
                System.out.println("GOODBYE!");
                mainGameThread.setStarted(false);
                break;
            default:
                System.out.println("Invalid Selection - Please Select A Valid Option");
        }
    }

    public Character userRaceSelect(MainGameThread mainGameThread) {
        String selection = getUserInput();
        switch (selection) {
            case "1":
                String newCharacter = "Warrior";
                Character warrior = new Warrior(1150.0, 100, 3, 110.0, 100, 100, 8);
                return warrior;
            case "2":
                System.out.println("Dark Elf (Mage)");
                break;
            case "3":
                System.out.println("Wood Elf (Rogue)");
                break;
            default:
                System.out.println("Invalid Selection - Please Select A Valid Option");

        }

        return null;
    }

    public void userMoves(MainGameThread mainGameThread, Character character, User currentUser, Dungeon dungeon){
        String movement = getUserInput();
        switch (movement){
            case "NORTH":
                currentUser.moveUser("North", dungeon);
                break;
            case "SOUTH":
                currentUser.moveUser("South", dungeon);
                break;
            case "EAST":
                currentUser.moveUser("East", dungeon);
                break;
            case "WEST":
                currentUser.moveUser("West", dungeon);
                break;
            default:
                System.out.println("Invalid Selection - Please Select A Valid Direction");
        }
    }

}
