import greenfoot.*;
public class Tutorial extends Worlds {
    private Player player = new Player(this);
    private boolean alreadyShown = false;
    public Tutorial() {
        super();
        showText("WIllKOMMEN BEIM TUTORIAL. Hier lernst du dich im  Spiel zu Bewegen und zu agieren.", 10, 10);
        showText("Drücke W um nach oben zu gehen, A um nach Links und D um nach Rechts zu gelangen.", 10, 11);
        showText("Mit S gehst du nach unten.", 10, 12);
    }
    public void act() {
        if(player.canAct() && !alreadyShown) {
            showText("Nimm das Schwert indem du auf das Feld mit dem Symbol gehst und E drückst.", 10, 10);
            showText("",10,11);
            showText("",10,12);
            alreadyShown = true;
        }
        if(Greenfoot.isKeyDown("e")) {
            showText("Um nun einen Gegner anzugreifen gehe in seine Nähe.", 10, 10);
            showText("Stehst du ein Feld von ihm entfernt, drücke Leertaste um ihn anzugreifen.", 10, 11);
            showText("Besiege nun alle Gegner! Und gehe danach zu Goal, um in die nächste Welt zu gelangen.", 10, 12);
        }
    }
    public void prepare() {
        super.prepare();
        Goal goal = new Goal(new World1());
        addObject(goal,18,8);
        Player player = new Player(this);
        addObject(player,2,2);
        Door door = new Door();
        addObject(door,16,8);
        Button button = new Button(door);
        addObject(button,14,8);
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
        Wall wall6 = new Wall();
        addObject(wall6,8,9);
        Wall wall7 = new Wall();
        addObject(wall7,16,7);
        Wall wall8 = new Wall();
        addObject(wall8,16,9);
        Enemy1 enemy_1 = new Enemy1();
        addObject(enemy_1,7,13);
        Enemy1 enemy_12 = new Enemy1();
        addObject(enemy_12,15,3);
        Sword sword = new Sword();
        addObject(sword,4,8);
    }
}
