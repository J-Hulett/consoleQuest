package World;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private int dungeonWidthX;
    private int dungeonHeightY;
    private int numberOfWalls;
    private List<Wall> wallPositions = new ArrayList<>();


    public Dungeon(int dungeonWidthX, int dungeonHeightY, int numberOfWalls){
        this.dungeonWidthX = dungeonWidthX;
        this.dungeonHeightY = dungeonHeightY;
        this.numberOfWalls = numberOfWalls;
    }

    public void generateWalls(){
        for(int i = 0; i < numberOfWalls; i++){
            Wall wall = new Wall((int) (Math.random() * (dungeonWidthX))
                    , (int) (Math.random() * (dungeonHeightY)));
            wallPositions.add(wall);
        }
    }

    public void printWalls(PrintWriter printWriter){
        String[][] wallMatrix = new String[dungeonHeightY][dungeonWidthX];
        for(Wall wall : wallPositions){
            for(int i = 1; i < dungeonHeightY; i ++){
                for(int j = 1; j < dungeonWidthX; i++){
                    if(i == wall.getyPosition() && j == wall.getxPosition()){
                        wallMatrix[i-1][j-1] = "\u25A8";
                    } else
                        wallMatrix[i-1][j-1] = "\u25A2";
                }
            }
        }
        for(int i = 0; i < dungeonHeightY; i++){
            for(int j = 0; j < dungeonWidthX; i++){
                printWriter.print(wallMatrix[i][j]);
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
}
