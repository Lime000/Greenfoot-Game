import greenfoot.*;
public class World3 extends Worlds {
    public void prepare() {
        super.prepare();
        Player player = new Player(this);
        addObject(player,2,2);
        Goal goal = new Goal(null);
        addObject(goal,18,13);
        Door door1 = new Door();
        addObject(door1,18,11);
        Button button = new Button(door1);
        addObject(button,18,2);
        Wall wall27 = new Wall();
        addObject(wall27,2,4);
        Wall wall28 = new Wall();
        addObject(wall28,1,4);
        Wall wall29 = new Wall();
        addObject(wall29,0,4);
        Wall wall30 = new Wall();
        addObject(wall30,16,11);
        Wall wall31 = new Wall();
        addObject(wall31,16,12);
        Wall wall32 = new Wall();
        addObject(wall32,16,13);
        Wall wall33 = new Wall();
        addObject(wall33,16,14);
        Wall wall34 = new Wall();
        addObject(wall34,17,11);
        Wall wall35 = new Wall();
        addObject(wall35,19,11);
        Wall wall36 = new Wall();
        addObject(wall36,15,11);
        Wall wall37 = new Wall();
        addObject(wall37,14,11);
        Wall wall38 = new Wall();
        addObject(wall38,13,11);
        Wall wall39 = new Wall();
        addObject(wall39,12,11);
        Wall wall40 = new Wall();
        addObject(wall40,12,12);
        Wall wall41 = new Wall();
        addObject(wall41,12,14);
        Wall wall42 = new Wall();
        addObject(wall42,8,11);
        Wall wall43 = new Wall();
        addObject(wall43,9,11);
        Wall wall44 = new Wall();
        addObject(wall44,11,11);
        Wall wall46 = new Wall();
        addObject(wall46,8,10);
        Wall wall47 = new Wall();
        addObject(wall47,8,9);
        Wall wall48 = new Wall();
        addObject(wall48,8,8);
        Wall wall49 = new Wall();
        addObject(wall49,8,7);
        Wall wall50 = new Wall();
        addObject(wall50,8,6);
        Wall wall51 = new Wall();
        addObject(wall51,8,5);
        Wall wall52 = new Wall();
        addObject(wall52,8,4);
        Wall wall53 = new Wall();
        addObject(wall53,8,3);
        Wall wall54 = new Wall();
        addObject(wall54,8,2);
        Wall wall55 = new Wall();
        addObject(wall55,8,1);
        Wall wall56 = new Wall();
        addObject(wall56,3,4);
        Wall wall57 = new Wall();
        addObject(wall57,4,4);
        Wall wall58 = new Wall();
        addObject(wall58,6,4);
        Wall wall59 = new Wall();
        addObject(wall59,7,4);
        Wall wall60 = new Wall();
        addObject(wall60,19,4);
        Wall wall61 = new Wall();
        addObject(wall61,18,4);
        Wall wall62 = new Wall();
        addObject(wall62,17,4);
        Wall wall63 = new Wall();
        addObject(wall63,16,4);
        Wall wall64 = new Wall();
        addObject(wall64,16,3);
        Wall wall65 = new Wall();
        addObject(wall65,16,1);
        Flash flash2 = new Flash();
        addObject(flash2,18,2);
        flash2.setLocation(14,13);
        Enemy2 enemy22 = new Enemy2();
        addObject(enemy22,1,9);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23,5,13);
        Enemy1 enemy12 = new Enemy1();
        addObject(enemy12,12,4);
        Enemy1 enemy13 = new Enemy1();
        addObject(enemy13,16,8);
        Heart heart = new Heart();
        addObject(heart,5,2);
    }
}
