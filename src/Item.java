import greenfoot.*;
public class Item extends Actor {
    private Player player;
    private boolean usedOnce = false;
    public void useItem(Player newPlayer) {
        if(!usedOnce) {
            usedOnce = true;
            player = newPlayer;
        }
    }
    public void removeItem() {
        World world = getWorld();
        player.removeItem();
        world.removeObject(this);
        world.showText("", 6, 0);
    }
}
