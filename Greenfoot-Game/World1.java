import greenfoot.*;

public class World1 extends World {
    public World1() {
        super(20, 15, 50);
        Greenfoot.setSpeed(50);
        setBackground("images/Background.png");
        prepare();
    } 
    
    public void prepare() {
        Goal goal = new Goal(null);
        addObject(goal,17,12);
    }
}
