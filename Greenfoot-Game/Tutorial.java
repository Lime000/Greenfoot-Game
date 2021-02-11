import greenfoot.*;
public class Tutorial extends Worlds {
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
        Enemy1 enemy_1 = new Enemy1(this);
        addObject(enemy_1,7,13);
        Enemy1 enemy_12 = new Enemy1(this);
        addObject(enemy_12,15,3);
    }
}
