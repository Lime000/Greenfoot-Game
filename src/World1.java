import greenfoot.*;
public class World1 extends Worlds {
    public void prepare() {
        super.prepare();
        Goal goal = new Goal(new World2());
        addObject(goal,17,12);
        Player player = new Player(this);
        addObject(player,2,2);
    }
    public void act(){

    }
}
