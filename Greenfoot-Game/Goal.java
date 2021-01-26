import greenfoot.*;
public class Goal extends Actor {
    private World world;
    public Goal(World newWorld) {
        world = newWorld;
    }
    public void act() {
        if(isTouching(Player.class) && world != null) {
            Greenfoot.setWorld(world);
        }
    }
}
