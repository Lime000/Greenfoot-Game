import greenfoot.*; 
public class Heart extends Item {
    public void useItem(Player player) {
        super.useItem(player);
        if(player.getHearts() <= 5) {
            removeItem();
            player.addHeart(1);
        }
    }
}