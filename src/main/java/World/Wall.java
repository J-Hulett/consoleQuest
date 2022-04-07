package World;

public class Wall {
    private int xPosition;
    private int yPosition;

    public Wall(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String xYtoString(){
        return "X: " + getxPosition() + " Y: " + getyPosition();
    }

}
