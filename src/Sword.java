import greenfoot.*;
public class Sword extends Item {
    private int durability = 4;
    public void useItem(Player player) {
        super.useItem(player);
        durability --;
        if(durability <= 0) {
            removeItem();
            getWorld().showText("", 6, 0);
        } else {
            getWorld().showText(String.valueOf(durability), 6, 0);
            player.attack(1, 1);
        }
    }
}
