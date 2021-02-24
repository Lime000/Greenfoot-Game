import greenfoot.*;
public class Button extends Actor {
    private Door door;
    public Button(Door newDoor) {
        door = newDoor;
    }
    public void act() {
        if(isTouching(Player.class)) {
            door.open();
            getWorld().removeObject(this);
        }
    }
}
