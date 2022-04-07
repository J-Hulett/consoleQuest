package menu;

import World.Dungeon;
import World.Wall;
import characters.Character;

import java.io.PrintWriter;

public class GameRuntime {
    Dungeon runtimeDungeon;
    PrintWriter printWriter = new PrintWriter(System.out, true);

    public void gameStart(Character player) {
        runtimeDungeon = new Dungeon(100, 35, 600);
        runtimeDungeon.generateWalls(false);
        runtimeDungeon.printWalls(printWriter);
    }


}