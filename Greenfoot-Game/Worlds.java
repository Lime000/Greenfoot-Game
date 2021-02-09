import greenfoot.*;
abstract public class Worlds extends World {
    public Worlds() {
        super(20, 15, 50);
        Greenfoot.setSpeed(50);
        setBackground("images/Background.png");
        prepare();
    } 
    abstract public void reset();
    public void prepare() {
        
    }
}
