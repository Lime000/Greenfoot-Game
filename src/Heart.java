import greenfoot.*; 
public class Heart extends Item {
    public void useItem(Player player) {
        super.useItem(player);
        removeItem();
        player.addHeart(1);
    }
}