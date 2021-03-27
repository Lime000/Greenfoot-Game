import greenfoot.*;
public class Goal extends Actor {
    //Goal speichert die nächste Welt.
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
