import greenfoot.*;
public class Player extends Entity {
    public void act() {

    }
    protected GreenfootImage getDirectionImage(Directions dir) {
        switch (dir) {
            case UP:
                return new GreenfootImage("Player_UP.png");
            case RIGHT:
                return new GreenfootImage("Player_RIGHT.png");
            case DOWN:
                return new GreenfootImage("Player_DOWN.png");
            case LEFT:
                return new GreenfootImage("Player_LEFT.png");
            default:
                return new GreenfootImage("Player_DOWN.png");
        }
    }
}
