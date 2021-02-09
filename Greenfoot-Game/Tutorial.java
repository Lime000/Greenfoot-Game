import greenfoot.*;

public class Tutorial extends Worlds {
    public Tutorial() {
        //super(20, 15, 50);
        Greenfoot.setSpeed(50);
        setBackground("images/Background.png");
        prepare();
    } 
    public void reset() {
        prepare();
    }
    public void prepare() {
        Goal goal = new Goal(new World1());
        addObject(goal,18,8);
        Player player = new Player();
        addObject(player,2,2);
        Wall wall = new Wall();
        addObject(wall,8,4);
        Wall wall2 = new Wall();
        addObject(wall2,8,5);
        Wall wall3 = new Wall();
        addObject(wall3,8,6);
        Wall wall4 = new Wall();
        addObject(wall4,8,7);
        Wall wall5 = new Wall();
        addObject(wall5,8,8);
        Enemy_1 enemy_1 = new Enemy_1(this);
        addObject(enemy_1,7,13);
        Enemy_1 enemy_12 = new Enemy_1(this);
        addObject(enemy_12,15,3);
    }
}
