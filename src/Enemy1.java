import greenfoot.*;
import java.util.List;
public class Enemy1 extends Enemies {
    //Enemy1 versucht immer auf dem schnellsten Weg zu dem Spieler zu kommen.
    //(Wenn er in Reichweite ist.)
    public Enemy1() {
        setHearts(2);
    }
    public void act() {
        super.act();
        if(canAct()) {
            List objectsInRange = getObjectsInRange(5, Player.class); //überprüfen, ob der Spieler in Reichweite ist
            if (!objectsInRange.isEmpty()) {
                Player player = (Player) objectsInRange.get(0);
                int playerX = player.getX(); //Die Position des Spielers ermitteln.
                int playerY = player.getY();
                int ownX = getX(); //Die eigene Position finden
                int ownY = getY();
                if (ownX > playerX){
                    move(Directions.LEFT);
                } else if(ownX < playerX){
                    move(Directions.RIGHT);
                }
                if(ownY > playerY){
                    move(Directions.UP);
                } else if (ownY < playerY) {
                    move(Directions.DOWN);
                }
            }
        }
    }
    protected GreenfootImage getDirectionImage(Directions dir) {
        switch (dir) {
            case UP:
                return new GreenfootImage("Enemy_UP.png");
            case RIGHT:
                return new GreenfootImage("Enemy_RIGHT.png");
            case DOWN:
                return new GreenfootImage("Enemy_DOWN.png");
            case LEFT:
                return new GreenfootImage("Enemy_LEFT.png");
            default:
                return new GreenfootImage("Enemy_DOWN.png");
        }
    }
}
