import greenfoot.*;

public class World1 extends World {
    public World1() {
        super(20, 15, 50);
        Greenfoot.setSpeed(50);
        setBackground("images/Background.png");
        prepare();
    } 
    
    public void prepare() { 
        Goal goal = new Goal(new World2());
        addObject(goal,17,12);
        Player player = new Player();
        addObject(player,1,4);
        Wall wall = new Wall();
        addObject(wall,10,6);
        Wall wall2 = new Wall();
        addObject(wall2,9,6);
        Enemy_1 enemy_1 = new Enemy_1();
        addObject(enemy_1,15,4);
        Enemy_1 enemy_12 = new Enemy_1();
        addObject(enemy_12,10,9);
        Enemy_1 enemy_13 = new Enemy_1();
        addObject(enemy_13,1,13);
        addObject(wall,11,6);
        addObject(wall2,9,7);
        Wall wall3 = new Wall();
        addObject(wall3,11,7);
        Wall wall4 = new Wall();
        addObject(wall4,11,5);
        Wall wall5 = new Wall();
        addObject(wall5,9,5);
        Wall wall6 = new Wall();
        addObject(wall6,13,9);
        Wall wall7 = new Wall();
        addObject(wall7,13,10);
        Wall wall8 = new Wall();
        addObject(wall8,13,13);
        Wall wall9 = new Wall();
        addObject(wall9,13,14);
        Wall wall10 = new Wall();
        addObject(wall10,14,7);
        Wall wall11 = new Wall();
        addObject(wall11,15,7);
        Wall wall12 = new Wall();
        addObject(wall12,16,7);
        Wall wall13 = new Wall();
        addObject(wall13,13,8);
        Wall wall14 = new Wall();
        addObject(wall14,17,7);
        Wall wall15 = new Wall();
        addObject(wall15,4,10);
        Wall wall16 = new Wall();
        addObject(wall16,4,11);
        Wall wall17 = new Wall();
        addObject(wall17,5,12);
        Wall wall18 = new Wall();
        addObject(wall18,5,13);
        Wall wall19 = new Wall();
        addObject(wall19,5,14);
        Wall wall20 = new Wall();
        addObject(wall20,8,7);
        Wall wall21 = new Wall();
        addObject(wall21,7,7);
        wall21.setLocation(7,7);
        Wall wall22 = new Wall();
        addObject(wall22,7,7);
        Wall wall23 = new Wall();
        addObject(wall23,6,7);
    }
}
