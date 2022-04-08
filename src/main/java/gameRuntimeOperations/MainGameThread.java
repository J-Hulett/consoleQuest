package gameRuntimeOperations;

import World.Dungeon;
import characters.Character;
import player.User;
import userIO.UserInput;
import userIO.UserOutput;

public class MainGameThread {

    UserOutput userOut = new UserOutput();
    UserInput userIn = new UserInput();
    GameSetup game;
    Character player;
    User currentUser;
    boolean isStarted = true;
    boolean isSelecting = false;
    boolean isMoving = false;

    boolean isPlaying = false;


    public void run() {

        while (isStarted) {
            userOut.welcomeScreen();
            userIn.continueFromWelcomeScreen(this);
        }

        while (isSelecting) {
            userOut.characterRaceSelect();
            player = userIn.userRaceSelect(this);
            game = new GameSetup();
            setPlaying(true);
            setSelecting(false);
        }

        while (isPlaying) {
            currentUser = game.gameStart(player, this);
            isPlaying = false;
        }

        while(isMoving){
            userOut.promptUserForMovement();
            userIn.userMoves(this, player, currentUser, game.getRuntimeDungeon());
            game.repaintDungeon();
        }


    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public boolean isSelecting() {
        return isSelecting;
    }

    public void setSelecting(boolean selecting) {
        isSelecting = selecting;
    }


}
