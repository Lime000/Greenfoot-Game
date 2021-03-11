import greenfoot.*;
public class Tutorial extends Worlds {
    private String anleitung = "WIllKOMMEN BEIM TUTORIAL. Hier lernst du dich im  Spiel zu Bewegen und zu agieren. ";
    private String anleitung2 = "Drücke W um nach oben zu gehen, A um nach Links und D um nach Rechts zu gelangen. ";
    private String anleitung3 = "Mit S gehst du nach unten.";
    public Tutorial() {
        super();
        showText(anleitung,10, 10);
        showText(anleitung2,10, 11);
        showText(anleitung3,10, 12);
        if(Player.move()){
              anleitung = "Nimm das Schwert indem du auf das Feld mit dem Symbol gehst und E drückst.";
        }
    }
    public void prepare() {
        super.prepare();
        System.out.println(anleitung);
        Goal goal = new Goal(new World1());
        addObject(goal,18,8);
        Player player = new Player(this);
        addObject(player,2,2);
        Door door = new Door();
        addObject(door,16,8);
        Button button = new Button(door);
        addObject(button,14,8);
        Wall wall = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall,8,4);
        Wall wall2 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall2,8,5);
        Wall wall3 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall3,8,6);
        Wall wall4 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall4,8,7);
        Wall wall5 = new Wall(new GreenfootImage("Wall.png"));
        addObject(wall5,8,8);
        Enemy1 enemy_1 = new Enemy1();
        addObject(enemy_1,7,13);
        Enemy1 enemy_12 = new Enemy1();
        addObject(enemy_12,15,3);
        Sword sword = new Sword();
        addObject(sword,4,8);

    }
}
