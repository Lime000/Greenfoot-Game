import greenfoot.*;
public abstract class Enemies extends Entity {
    private Worlds resetWorld;
    public Enemies(Worlds newWorld) {
        resetWorld = newWorld;
    }
    public void act() {
        if(isTouching(Player.class)) {
            Health.removeHeart(1);
        }
    }
}
