import greenfoot.*;
public class World1 extends Worlds {
    public void prepare() {
        super.prepare();
<<<<<<< HEAD
        //PLAYER
=======
        Goal goal = new Goal(new World2());
        addObject(goal,17,12);
>>>>>>> 80826bf9b96310c9d5bb434dba23194d0f79f614
        Player player = new Player(this);
        addObject(player,2,2);
     
        //GOAL
        Goal goal = new Goal(null);
        addObject(goal,17,12);
        
        //DOORS/BUTTONS
        Door door = new Door();
        addObject(door,16,8);
        Button button = new Button(door);
        addObject(button,15,8);
        
        //WALLS
        Wall wall = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall,8,4); 
        Wall wall2 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall2,8,5);
        Wall wall3 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall3,8,6);
        Wall wall4 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall4,8,7);
        Wall wall5 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall5,9,8);
        Wall wall6 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall6,10,8);
        Wall wall7 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall7,10,9);
        Wall wall8 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall8,1,3);
        Wall wall9 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall9,1,4);
        Wall wall10 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall10,1,5);
        Wall wall11 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall11,3,3);
        Wall wall12 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall12,3,4);
        Wall wall13 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall13,3,5);
        Wall wall14 = new Wall(new GreenfootImage("WallRusty.png"));
        addObject(wall14,4,6);
        
        //ENEMIES
        Enemy1 enemy2 = new Enemy1();
        addObject(enemy2,7,13);
        Enemy1 enemy3 = new Enemy1();
        addObject(enemy3,15,11);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,14,2);
        
        //ITEMS
        Sword sword = new Sword();
        addObject(sword,4,8);
    }
    public void act(){

    }
}
