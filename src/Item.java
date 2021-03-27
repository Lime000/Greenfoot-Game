import greenfoot.*;
public class Item extends Actor {
    //Jedes Item speichert den Player, um ihn zu beeinflussen (Leben/ Angriff).
    private Player player;
    private boolean usedOnce = false;
    public void useItem(Player newPlayer) {
        if(!usedOnce) {
            usedOnce = true;
            player = newPlayer;
        }
    }
    public void removeItem() {
        player.removeItem();
        getWorld().removeObject(this);
    }
}
