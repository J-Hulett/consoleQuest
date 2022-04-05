import menu.HomeMenu;

public class Game {

    HomeMenu home;

    boolean newGame = false;
    public static void main(String[] args) {
        HomeMenu home = new HomeMenu();
        home.run();
    }

}
