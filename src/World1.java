import greenfoot.*;
public class World1 extends Worlds {
    public void prepare() {
        super.prepare();
        Goal goal = new Goal(null);
        addObject(goal,17,12);
        Player player = new Player(this);
        addObject(player,2,2);
    }
}
