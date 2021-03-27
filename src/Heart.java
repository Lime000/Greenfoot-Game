import greenfoot.*;
public class Heart extends Item {
    //Heart gibt dem Spieler ein Leben 
    //(wenn er weniger als 5 Leben hat)
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
