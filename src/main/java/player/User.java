package player;

import World.Dungeon;
import World.Wall;
import characters.Character;
import userIO.Colors;

public class User {

    private int userXposition;
    private int userYposition;
    private Character userCharacter;


    public User(Character player) {
        this.userCharacter = player;
    }

    public void generateStartingPosition(Dungeon dungeon){
        int generateX = (int) (Math.random() * (dungeon.getDungeonWidthX()));
        int generateY = (int) (Math.random() * (dungeon.getDungeonHeightY()));
        boolean notWall = true;
        for(Wall wall : dungeon.getWallPositions()){
            if(generateX == wall.getxPosition() && generateY == wall.getyPosition()){
                notWall = false;
                generateX = (int) (Math.random() * (dungeon.getDungeonWidthX()));
            }
        }
        if(notWall){
            this.userXposition = generateX;
            this.userYposition = generateY;
        }

    }

    public void addOrUpdateUserToDungeonMatrix(Dungeon dungeon){
        for(int i = 0; i < dungeon.getDungeonHeightY(); i++){
            for(int j = 0; j < dungeon.getDungeonWidthX(); j++){
                if(i == userYposition && j == userXposition){
                    dungeon.getDungeonMatrix()[i][j] = (Colors.Blue + "\u2591" + Colors.Reset);
                }
            }
        }
    }


    public void moveUser(String direction, Dungeon dungeon){


        if(direction.equals("North") && !dungeon.checkForWalls(userXposition, userYposition- 1)){
            wipePlayerCurrentPosition(dungeon);
            userYposition -= 1;
            addOrUpdateUserToDungeonMatrix(dungeon);
        } else if (direction.equals("South") && !dungeon.checkForWalls(userXposition, userYposition + 1)){
            wipePlayerCurrentPosition(dungeon);
           userYposition += 1;
            addOrUpdateUserToDungeonMatrix(dungeon);
        }else if (direction.equals("East") && !dungeon.checkForWalls(userXposition + 1, userYposition)){
            wipePlayerCurrentPosition(dungeon);
            userXposition += 1;
            addOrUpdateUserToDungeonMatrix(dungeon);
        } else if (direction.equals("West") && !dungeon.checkForWalls(userXposition, userYposition- 1)){
            wipePlayerCurrentPosition(dungeon);
            userXposition -= 1;
            addOrUpdateUserToDungeonMatrix(dungeon);
        }


    }

    public void wipePlayerCurrentPosition(Dungeon dungeon){
        for(int i = 0; i < dungeon.getDungeonHeightY(); i++){
            for(int j = 0; j < dungeon.getDungeonWidthX(); j++){
                if(i == userYposition && j == userXposition){
                    dungeon.getDungeonMatrix()[i][j] = (Colors.BACKGROUND_WHITE + "\u2593" + Colors.Reset);
                }
            }
        }
    }


    public String printUserXAndY(){
        return "Users X Position: " + userXposition + " Users Y Position: " + userYposition;
    }


    public int getUserXposition() {
        return userXposition;
    }

    public void setUserXposition(int userXposition) {
        this.userXposition = userXposition;
    }

    public int getUserYposition() {
        return userYposition;
    }

    public void setUserYposition(int userYposition) {
        this.userYposition = userYposition;
    }

    public Character getUserCharacter() {
        return userCharacter;
    }

    public void setUserCharacter(Character userCharacter) {
        this.userCharacter = userCharacter;
    }
}
