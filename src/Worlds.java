import greenfoot.*;
public class Worlds extends World {
    public Worlds() {
        super(20, 15, 50);
        Greenfoot.setSpeed(30);
        setBackground("images/Background.png");
        setActOrder(Player.class);
        prepare();
    }
    public void reset() {
        removeObjects(getObjects(null));
        prepare();
    }
    public void prepare() {
        for(int i=0; i<20; i++) {
            addObject(new StatusBar(), i, 0);
        }
        showText("World-Wanderer", 17, 0);
    }
}
