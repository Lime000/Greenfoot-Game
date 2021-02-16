import greenfoot.*;
public class Enemy1 extends Enemies {
    public Enemy1(Worlds newWorld) {
        super(newWorld);
    }
    public void act() {
        super.act();
        if(canAct()) {
            move(Directions.NULL);
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
