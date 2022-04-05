package userIO;

import characters.Character;
import characters.Warrior;
import menu.HomeMenu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    Scanner inputScanner = new Scanner(System.in);

    public String getUserInput(){
        String userSelection = inputScanner.nextLine();
        return userSelection.trim().toUpperCase();
    }

    public void continueFromWelcomeScreen(HomeMenu homeMenu){
        String selction = getUserInput();
        switch (selction){
            case "Y":
                homeMenu.setSelecting(true);
                homeMenu.setStarted(false);
                break;
            case "N":
                System.out.println("GOODBYE!");
                homeMenu.setStarted(false);
                break;
            default:
                System.out.println("Invalid Selection - Please Select A Valid Option");
        }
    }

    public Character userRaceSelect(HomeMenu homeMenu){
        String selection = getUserInput();
        switch (selection){
            case "1":
                String newCharacter = "Warrior";
                Character warrior = new Warrior(1150.0, 100, 3, 110.0,100,100,8);
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

}
