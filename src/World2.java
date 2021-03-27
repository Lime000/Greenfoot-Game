import greenfoot.*;
public class World2 extends Worlds
{
    public void prepare(){
        super.prepare();
        Goal goal = new Goal(null);
        addObject(goal,17,12);
        Player player = new Player(this);
        addObject(player,2,2);
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
        Door door = new Door();
        addObject(door,16,8);
        Button button = new Button(door);
        addObject(button,10,14);
    }
}
