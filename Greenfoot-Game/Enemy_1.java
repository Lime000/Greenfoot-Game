import greenfoot.*;
public class Enemy_1 extends Entity {
    private World start;
    public Enemy_1() {
        start = getWorld();
    }
    public void act() {
        if (isTouching(Player.class)){
            Greenfoot.setWorld(start);
        }

    }
    protected GreenfootImage getDirectionImage(Directions dir) {
        switch (dir) {
            case UP:
                return new GreenfootImage("Enemy.png");
            case RIGHT:
                return new GreenfootImage("Enemy.png");
            case DOWN:
                return new GreenfootImage("Enemy.png");
            case LEFT:
                return new GreenfootImage("Enemy.png");
            default:
                return new GreenfootImage("Enemy.png");
        }
    }
}
