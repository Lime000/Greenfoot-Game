
import greenfoot.*;
public class World2 extends Worlds
{
    public void prepare(){
        super.prepare();
        Goal goal = new Goal(null);
        addObject(goal,17,12);
        Player player = new Player(this);
        addObject(player,2,2);
        Enemy1 enemy_1 = new Enemy1();
        addObject(enemy_1,3,12);
        Enemy2 enemy_2 = new Enemy2();
        addObject(enemy_2,15,3);
        for( int i=1; i<11; i++) {
            addObject(new Wall(new GreenfootImage("Wall.png")),5,i);
        }
        for( int i=5; i<15; i++) {
            addObject(new Wall(new GreenfootImage("Wall.png")),11,i);
        }
        Wall wall = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall,10,7);
        Wall wall1 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall1,9,7);
        Wall wall2 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall2,7,7);
        Wall wall3 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall3,6,7);
        Wall wall4 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall4,1,2);
        Wall wall5 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall5,1,1);
        Door door = new Door();
        addObject(door,0,2);
        Door door2 = new Door();
        addObject(door2,8,7);
        Button button = new Button(door);
        addObject(button,10,14);
    }
}
