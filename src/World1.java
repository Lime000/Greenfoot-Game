import greenfoot.*;
import java.util.Scanner;
public class World1 extends Worlds {
    public void prepare() {
        super.prepare();
        Goal goal = new Goal(null);
        addObject(goal,17,12);
        Player player = new Player(this);
        addObject(player,2,2);
    }
    public void act(){
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.next()+ "d");
        showText(scan.next(),5 , 5);
    }
}
