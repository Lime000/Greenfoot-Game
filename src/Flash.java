import greenfoot.*;
public class Flash extends Item {
    //Flash hat, wie Sword, eine Haltbarkeit (durability) 
    //und kann über den Player angreifen. 
    //(Hat aber anderen Schaden und Reichweite)
    private int durability = 2;
    public void useItem(Player player) {
        super.useItem(player);
        World world = getWorld();
        durability --;
        if(durability <= 0) {
            removeItem();
            world.showText("", 6, 0);
        } else {
            world.showText(String.valueOf(durability), 6, 0);
            player.attack(3, 3);
        }
    }
}
