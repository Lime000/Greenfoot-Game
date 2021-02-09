import greenfoot.*;
public class Enemy_1 extends Entity {
    private Worlds resetWorld;
    public Enemy_1(Worlds newWorld) {
        resetWorld = newWorld;
    }
    public void act() {
        if(isTouching(Player.class)) {
            resetWorld.reset();
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
