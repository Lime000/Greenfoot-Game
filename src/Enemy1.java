import greenfoot.*;
import java.util.List; 
public class Enemy1 extends Enemies {
    public void act() {
        super.act();
        if(canAct()) {
            List list = getObjectsInRange(5, Player.class); 
            if (!list.isEmpty()){
                Player player = (Player) list.get(0);
                int x = player.getX();
                int y = player.getY();
                if(getX() == x && getY() == y)
                {}
                if (getX() > x){
                    move(Directions.LEFT);
                } else {
                    move(Directions.RIGHT);
                }
                if(getY() > y){
                    move(Directions.UP);
                } else {
                    move(Directions.DOWN);
                }
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
