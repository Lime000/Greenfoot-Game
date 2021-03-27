import greenfoot.*;
public class Sword extends Item {
    //Sword hat eine Haltbarkeit (durability) 
    //und kann über den Player angreifen.
    private int durability = 4;
    public void useItem(Player player) {
        super.useItem(player);
        World world = getWorld();
        durability --;
        if(durability <= 0) {
            removeItem();
            world.showText("", 6, 0);
        } else {
            world.showText(String.valueOf(durability), 6, 0);
            player.attack(1, 1);
        }
    }
}
