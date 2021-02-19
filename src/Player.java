import greenfoot.*;
public class Player extends Entity {

    public Player(){
        setHealthindex(5);
    }
    public void act() {
        World test = getWorld();
        System.out.println(getHealthindex());
        if (Greenfoot.isKeyDown("w")) {
            move(Directions.UP);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(Directions.LEFT);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(Directions.DOWN);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(Directions.RIGHT);
        }
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
