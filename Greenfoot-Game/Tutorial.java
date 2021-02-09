import greenfoot.*;

public class Tutorial extends World {
    public Tutorial() {
        super(20, 15, 50);
        Greenfoot.setSpeed(50);
        setBackground("images/Background.png");
        prepare();
        System.out.println(anleitung);
    } 
   
    private String anleitung = "WIllKOMMEN BEIM TUTORIAL. Hier lernst du dich im  Spiel zu Bewegen und zu agieren. Drücke W und nach oben zu gehen A um nach Links und D um nach Rechts zu gelangen. Mit S gehst du nach unten.";
    
    public void prepare() {
        Goal goal = new Goal(new World1());
        addObject(goal,18,8);
        Player player = new Player();
        addObject(player,2,2);
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
        Enemy_1 enemy_1 = new Enemy_1();
        addObject(enemy_1,7,13);
        Enemy_1 enemy_12 = new Enemy_1();
        addObject(enemy_12,15,3);
    }
}
