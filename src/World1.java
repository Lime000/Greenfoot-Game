import greenfoot.*;
public class World1 extends Worlds {
    public void prepare() {
        super.prepare();
        //PLAYER
        Player player = new Player(this);
        addObject(player,2,2);

        //GOAL
        Goal goal = new Goal(new World2());
        addObject(goal,17,12);

        //DOORS/BUTTONS
        Door door1 = new Door();
        addObject(door1,10,12);
        Button button = new Button(door1);
        addObject(button,9,12);

        //WALLS
        Wall wall = new Wall();
        addObject(wall,12,6);
        Wall wall2 = new Wall();
        addObject(wall2,12,5);
        Wall wall3 = new Wall();
        addObject(wall3,1,7);
        Wall wall4 = new Wall();
        addObject(wall4,1,6);
        Wall wall5 = new Wall();
        addObject(wall5,10,9);
        Wall wall6 = new Wall();
        addObject(wall6,10,8);
        Wall wall7 = new Wall();
        addObject(wall7,11,7);
        Wall wall8 = new Wall();
        addObject(wall8,1,3);
        Wall wall9 = new Wall();
        addObject(wall9,1,4);
        Wall wall10 = new Wall();
        addObject(wall10,1,5);
        Wall wall11 = new Wall();
        addObject(wall11,3,3);
        Wall wall12 = new Wall();
        addObject(wall12,3,4);
        Wall wall13 = new Wall();
        addObject(wall13,3,5);
        Wall wall14 = new Wall();
        addObject(wall14,4,6);
        Wall wall15 = new Wall();
        addObject(wall15,5,7);
        Wall wall16 = new Wall();
        addObject(wall16,6,8);
        Wall wall17 = new Wall();
        addObject(wall17,7,9);
        Wall wall18 = new Wall();
        addObject(wall18,8,10);
        Wall wall19 = new Wall();
        addObject(wall19,9,10);
        Wall wall20 = new Wall();
        addObject(wall20,10,10);
        Wall wall21 = new Wall();
        addObject(wall21,10,11);
        Wall wall22 = new Wall();
        addObject(wall22,12,4);
        Wall wall23 = new Wall();
        addObject(wall23,16,10);
        Wall wall24 = new Wall();
        addObject(wall24,17,10);
        Wall wall25 = new Wall();
        addObject(wall25,18,10);
        Wall wall26 = new Wall();
        addObject(wall26,19,10);
        Wall wall27 = new Wall();
        addObject(wall27,16,14);
        Wall wall28 = new Wall();
        addObject(wall28,17,14);
        Wall wall29 = new Wall();
        addObject(wall29,18,14);
        Wall wall30 = new Wall();
        addObject(wall30,19,14);
        Wall wall32 = new Wall();
        addObject(wall32,10,13);
        Wall wall33 = new Wall();
        addObject(wall33,10,14);

        //ENEMIES
        Enemy1 enemy2 = new Enemy1();
        addObject(enemy2,7,13);
        Enemy1 enemy3 = new Enemy1();
        addObject(enemy3,15,12);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,14,2);

        //ITEMS
        Sword sword1 = new Sword();
        addObject(sword1,4,8);
        Flash flash1 = new Flash();
        addObject(flash1,5,2);
    }
}
