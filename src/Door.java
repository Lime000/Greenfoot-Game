import greenfoot.*;
public class Door extends Solid {
    public void open() {
        getWorld().removeObject(this);
    }
}
