import greenfoot.*;
import java.util.LinkedList;
import java.util.Queue;
public class Enemy2 extends Enemies {
    Queue<Directions> nextMoves = new LinkedList();
    public void act() {
        super.act();
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
