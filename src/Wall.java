import greenfoot.*;
public class Wall extends Solid {
    public void update(Solid wall) {
        if(wall != null) {
            wall.setConnections();
            wall.setImage();
        }
    }
    public void setImage() {
        setImage(new GreenfootImage("Wall_" + getConnections() + ".png"));
    }
}
