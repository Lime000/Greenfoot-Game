import greenfoot.*;
import java.util.List;
import java.util.LinkedList;
public class Enemy2 extends Enemies {
    LinkedList<Directions> nextMoves = new LinkedList();
    public Enemy2() {
        setHearts(3);
    }
    public void act() {
        super.act();
        if(canAct()) {
            if (!nextMoves.isEmpty()) {
                move(nextMoves.remove(0));
            } else {
                List objectsInRange = getObjectsInRange(5, Player.class);
                if (!objectsInRange.isEmpty()) { //überprüfen, ob der Spieler in Reichweite ist
                    Player player = (Player) objectsInRange.get(0);
                    int playerX = player.getX(); //Die Position des Spielers
                    int playerY = player.getY();
                    int ownX = getX(); //Die eigene Position
                    int ownY = getY();
                    for(int i = 0; i <= 3; i++) { // Die nächsten drei Bewegungen finden
                        if (ownX > playerX){
                            nextMoves.add(Directions.LEFT);
                            ownX --;
                        } else if(ownX < playerX){
                            nextMoves.add(Directions.RIGHT);
                            ownX ++;
                        } else if(ownY > playerY){
                            nextMoves.add(Directions.UP);
                            ownY --;
                        } else if (ownY < playerY) {
                            nextMoves.add(Directions.DOWN);
                            ownY ++;
                        }
                    }
                }
            }
        }
    }
    protected GreenfootImage getDirectionImage(Directions dir) {
        switch (dir) {
            case UP:
                return new GreenfootImage("Enemy2.png");
            case RIGHT:
                return new GreenfootImage("Enemy2.png");
            case DOWN:
                return new GreenfootImage("Enemy2.png");
            case LEFT:
                return new GreenfootImage("Enemy2.png");
            default:
                return new GreenfootImage("Enemy2.png");
        }
    }
}
