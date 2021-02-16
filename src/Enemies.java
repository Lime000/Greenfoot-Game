import greenfoot.*;
public abstract class Enemies extends Entity {
    public void act() {
        if(isTouching(Player.class)) {
            Health.removeHeart(1);
        }
    }
}
