import greenfoot.*;
public class Door extends Solid {
    public void open() {
        getWorld().removeObject(this);
    }
    public void update(Solid door) {
        if(door != null) {
            door.setConnections();
            door.setImage();
        }
    }
    public void setImage() {
        String connections = getConnections();
        if(connections.contains("U") || connections.contains("D") || connections.equals("Default")) {
            connections = "UD";
        } else if(connections.contains("L") || connections.contains("R")) {
            connections = "LR";
        }
        setImage(new GreenfootImage("Door_" + connections + ".png"));
    }
}
