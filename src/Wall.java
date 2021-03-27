import greenfoot.*;
public class Wall extends Solid {
    //Wall passt sein Bild an die benachbarten Solids an.
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
