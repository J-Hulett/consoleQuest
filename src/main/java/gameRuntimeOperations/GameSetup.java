package gameRuntimeOperations;

import World.Dungeon;
import characters.Character;
import player.User;

import java.io.PrintWriter;

public class GameSetup {
    Dungeon runtimeDungeon;
    PrintWriter printWriter = new PrintWriter(System.out, true);


    public User gameStart(Character player, MainGameThread mainGameThread) {
        runtimeDungeon = new Dungeon(100, 25, 750);
        runtimeDungeon.generateWalls(false);
        runtimeDungeon.buildAndColorDungeonMatrix();
        runtimeDungeon.printDungeonMatrix(printWriter);
        User currentUser = new User(player);
        currentUser.generateStartingPosition(runtimeDungeon);
        System.out.println(currentUser.printUserXAndY());
        currentUser.addOrUpdateUserToDungeonMatrix(runtimeDungeon);
        runtimeDungeon.printDungeonMatrix(printWriter);
        mainGameThread.isMoving = true;
        return currentUser;
    }

    public void repaintDungeon(){
        runtimeDungeon.printDungeonMatrix(printWriter);
    }

    public Dungeon getRuntimeDungeon() {
        return runtimeDungeon;
    }
}