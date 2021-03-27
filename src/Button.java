import greenfoot.*;
public class Button extends Actor {
    //Buttons spiechern die Door, die sie öffnen.
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
