import greenfoot.*;
public class Sword extends Item {
    public void useItem(Player player) {
        player.attack(1, 1);
    }
}
