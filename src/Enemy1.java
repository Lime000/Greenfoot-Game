import greenfoot.*;
import java.util.List; 
public class Enemy1 extends Enemies {
    public void act() {
        super.act();
        if(canAct()) {
            List list = getObjectsInRange(20, Player.class);
            Player player = (Player) list.get(0); 
            System.out.println( player.getX());
            int x = player.getX();
            int y = player.getY();
            if (getX()>x){
                move(Directions.LEFT);
            }
            else {
                move(Directions.RIGHT);
            }
            
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
