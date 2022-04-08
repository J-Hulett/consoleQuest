import gameRuntimeOperations.MainGameThread;

public class Game {

    MainGameThread home;

    boolean newGame = false;
    public static void main(String[] args) {
        MainGameThread home = new MainGameThread();
        home.run();
    }

}
