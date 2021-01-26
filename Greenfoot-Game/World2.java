import greenfoot.*;

public class World2 extends World {
    public World2() {
        super(20, 15, 50);
        Greenfoot.setSpeed(50);
        setBackground("images/Background.png");
        prepare();
    } 
    
    public void prepare() {

        Player player = new Player();
        addObject(player,0,6);
        Wall wall = new Wall();
        addObject(wall,8,1);
        Wall wall2 = new Wall();
        addObject(wall2,8,2);
        Wall wall3 = new Wall();
        addObject(wall3,8,3);
        Wall wall4 = new Wall();
        addObject(wall4,8,4);
        Wall wall5 = new Wall();
        addObject(wall5,8,5);
        Wall wall6 = new Wall();
        addObject(wall6,7,5);
        Wall wall7 = new Wall();
        addObject(wall7,6,5);
        Wall wall8 = new Wall();
        addObject(wall8,2,9);
        Wall wall9 = new Wall();
        addObject(wall9,3,9);
        Wall wall10 = new Wall();
        addObject(wall10,4,9);
        Wall wall11 = new Wall();
        addObject(wall11,5,9);
        Wall wall12 = new Wall();
        addObject(wall12,5,10);
        Wall wall13 = new Wall();
        addObject(wall13,5,11);
        Wall wall14 = new Wall();
        addObject(wall14,5,12);
        Wall wall15 = new Wall();
        addObject(wall15,10,8);
        Wall wall16 = new Wall();
        addObject(wall16,10,7);
        Wall wall17 = new Wall();
        addObject(wall17,10,6);
        Wall wall18 = new Wall();
        addObject(wall18,11,6);
        Wall wall19 = new Wall();
        addObject(wall19,12,6);
        Wall wall20 = new Wall();
        addObject(wall20,10,9);
        Wall wall21 = new Wall();
        addObject(wall21,10,10);
        Enemy_1 enemy_1 = new Enemy_1();
        addObject(enemy_1,13,2);
        enemy_1.setLocation(13,2);
        Enemy_1 enemy_12 = new Enemy_1();
        addObject(enemy_12,13,2);
        Enemy_1 enemy_13 = new Enemy_1();
        addObject(enemy_13,10,12);
        Goal goal = new Goal();
        addObject(goal,19,7);
        Wall wall22 = new Wall();
        addObject(wall22,19,6);
        Wall wall23 = new Wall();
        addObject(wall23,18,6);
        Wall wall24 = new Wall();
        addObject(wall24,17,6);
        Wall wall25 = new Wall();
        addObject(wall25,17,8);
        Wall wall26 = new Wall();
        addObject(wall26,18,8);
        Wall wall27 = new Wall();
        addObject(wall27,19,8);
    }
}
