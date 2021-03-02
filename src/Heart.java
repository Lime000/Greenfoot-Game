import greenfoot.*; 
public class Heart extends Item {
    public void useItem(Player player) {
        player.addHeart(1);
        getWorld().removeObject(this);
    }
}