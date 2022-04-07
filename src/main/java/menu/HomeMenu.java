package menu;

import characters.Character;
import userIO.UserInput;
import userIO.UserOutput;

public class HomeMenu {

    UserOutput userOut = new UserOutput();
    UserInput userIn = new UserInput();
    GameRuntime game;
    Character player;
    boolean isStarted = true;
    boolean isSelecting = false;


    boolean isPlaying = false;


    public void run() {

        while (isStarted) {
            userOut.welcomeScreen();
            userIn.continueFromWelcomeScreen(this);
        }

        while (isSelecting) {
            userOut.characterRaceSelect();
            player = userIn.userRaceSelect(this);
            game = new GameRuntime();
            setPlaying(true);
            setSelecting(false);
        }

        while (isPlaying) {
            game.gameStart(player);
            isPlaying = false;
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
