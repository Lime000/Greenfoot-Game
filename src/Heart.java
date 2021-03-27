import greenfoot.*;
public class Heart extends Item {
    public void useItem(Player player) {
        super.useItem(player);
        int playerHearts = player.getHearts();
        if(playerHearts < 5) {
            removeItem();
            player.addHeart(1);
            player.updateStatus(playerHearts + 1);
        }
    }
}
