import greenfoot.*;
import java.util.List;
public class Sword extends Item {
    public void useItem(Player player) {
        List enemies = player.getNeighbours(1, false, Enemies.class);
        for(int i = 0; i < enemies.size(); i++) {
            Enemies enemy = (Enemies) enemies.get(i);
            enemy.removeHeart(1);
        }
    }
}
