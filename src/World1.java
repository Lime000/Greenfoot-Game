import greenfoot.*;
public class World1 extends Worlds {
    public void prepare() {
        super.prepare();
        Goal goal = new Goal(null);
        addObject(goal,17,12);
        Player player = new Player(this);
        addObject(player,2,2);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,14,2);
        Door door = new Door();
        addObject(door,16,8);
        Button button = new Button(door);
        addObject(button,15,8);
        Wall wall = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall,8,4); 
        Wall wall2 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall2,8,5);
        Wall wall3 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall3,8,6);
        Wall wall4 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall4,8,7);
        Wall wall5 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall5,9,8);
        Wall wall6 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall6,10,8);
        Wall walls = new Wall(new GreenfootImage("WallRusty.png"));
        Enemy1 enemy2 = new Enemy1();
        addObject(enemy2,7,13);
        Enemy1 enemy3 = new Enemy1();
        addObject(enemy3,15,3);
        Sword sword = new Sword();
        addObject(sword,4,8);
    }
}
