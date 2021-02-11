import greenfoot.*;
public class Goal extends Actor {
    private World nextWorld;
    public Goal(World newWorld) {
        nextWorld = newWorld;
    }
    public void act() {
        if(isTouching(Player.class) && nextWorld != null) {
            Greenfoot.setWorld(nextWorld);
        }
    }
}
