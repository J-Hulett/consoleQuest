package World;

import userIO.Colors;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private int dungeonWidthX;
    private int dungeonHeightY;
    private int numberOfWalls;
    private List<Wall> wallPositions = new ArrayList<>();
    String[][] dungeonMatrix;


    public Dungeon(int dungeonWidthX, int dungeonHeightY, int numberOfWalls) {
        this.dungeonWidthX = dungeonWidthX;
        this.dungeonHeightY = dungeonHeightY;
        this.numberOfWalls = numberOfWalls;
    }

    public void generateWalls(boolean printWallPositions) {
        for (int i = 0; i < numberOfWalls; i++) {
            Wall wall = new Wall((int) (Math.random() * (dungeonWidthX))
                    , (int) (Math.random() * (dungeonHeightY)));
            wallPositions.add(wall);
            if (printWallPositions)
                System.out.println("X: " + wall.getxPosition() + " Y: " + wall.getyPosition());
        }
    }

    public boolean checkForWalls(int userX, int userY){
        boolean isWall = false;
        for(Wall wall : wallPositions){
            if(userX == wall.getxPosition() && userY == wall.getyPosition()){
                isWall = true;
                break;
            } else {
                isWall = false;
            }
        }
        return isWall;
    }

    public void buildAndColorDungeonMatrix() {
        dungeonMatrix = new String[dungeonHeightY][dungeonWidthX];

        for (int i = 0; i < dungeonHeightY; i++) {
            for (int j = 0; j < dungeonWidthX; j++) {
                for (Wall wall : wallPositions) {
                    if (i == wall.getyPosition() && j == wall.getxPosition()) {
                        dungeonMatrix[i][j] = (Colors.BACKGROUND_RED + "\u2591" + Colors.Reset);
                        break;
                    } else {
                        dungeonMatrix[i][j] = (Colors.BACKGROUND_WHITE + "\u2593" + Colors.Reset);
                    }
                }
            }
        }
    }

    public void printDungeonMatrix(PrintWriter printWriter){
        for (int i = 0; i < dungeonHeightY; i++) {
            for (int j = 0; j < dungeonWidthX; j++) {
                printWriter.print(dungeonMatrix[i][j]);
            }
            printWriter.println();
        }
    }

    public int getDungeonWidthX() {
        return dungeonWidthX;
    }

    public void setDungeonWidthX(int dungeonWidthX) {
        this.dungeonWidthX = dungeonWidthX;
    }

    public int getDungeonHeightY() {
        return dungeonHeightY;
    }

    public void setDungeonHeightY(int dungeonHeightY) {
        this.dungeonHeightY = dungeonHeightY;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public List<Wall> getWallPositions() {
        return wallPositions;
    }

    public void setWallPositions(List<Wall> wallPositions) {
        this.wallPositions = wallPositions;
    }

    public String[][] getDungeonMatrix() {
        return dungeonMatrix;
    }

    public void setDungeonMatrix(String[][] dungeonMatrix) {
        this.dungeonMatrix = dungeonMatrix;
    }

}
