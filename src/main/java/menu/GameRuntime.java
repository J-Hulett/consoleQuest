package menu;

import World.Dungeon;
import World.Wall;
import characters.Character;

import java.io.PrintWriter;

public class GameRuntime {
    Dungeon runtimeDungeon;
    PrintWriter printWriter = new PrintWriter(System.out, true);

    public void gameStart(Character player) {
        runtimeDungeon = new Dungeon(75,20, 50);
        //printArray(printWriter);
        runtimeDungeon.generateWalls();
       // runtimeDungeon.printWalls(printWriter);
        printArray(printWriter);
    }

    public static void printArray(PrintWriter printWriter) {
        int rows = 20;
        int columns = 75;

        String[][] array = new String[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                    array[i][j] = "\u25A8";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                printWriter.print(array[i][j]);
            }
            printWriter.println();
        }

    }
}