import greenfoot.*;
public abstract class Enemies extends Entity {
    public void act() {
        if(isTouching(Player.class)) {
            removeHeart(1);
        }
    }
}
