import greenfoot.*;
public class Enemy_1 extends Entity {
    private Class resetClass;
    public Enemy_1(Class newWorld) {
        resetClass = newWorld;
    }
    public void act() {
        World resetWorld = null;
        if(isTouching(Player.class)) {
            if(resetClass == Tutorial.class) {
                resetWorld = new Tutorial();
            }
            Greenfoot.setWorld(resetWorld);
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
