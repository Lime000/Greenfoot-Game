import greenfoot.*;  

public class Flash extends Item
{
    private int durability = 2;
    public void useItem(Player player) {
     super.useItem(player);
     durability --; 
     if(durability == 0) {
            removeItem();
        } else {
            getWorld().showText(String.valueOf(durability), 6, 0);
            player.attack(3, 3);
        }
    }
}
