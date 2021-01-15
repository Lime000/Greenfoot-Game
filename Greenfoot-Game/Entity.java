import greenfoot.*;
abstract public class Entity extends Actor {
    public void act() {

    }
    abstract protected GreenfootImage getDirectionImage(Directions dir);
    public void move(Directions dir) {
        int x = getX();
        int y = getY();
        int dx = 0;
        int dy = 0;
        switch (dir) {
            case UP:
                setRotation(0);
                dy--;
                break;
            case RIGHT:
                setRotation(1);
                dx++;
                break;
            case DOWN:
                setRotation(2);
                dy++;
                break;
            case LEFT:
                setRotation(3);
                dx--;
                break;
        }
        setImage(getDirectionImage(dir));
        Greenfoot.delay(8);
        if(getOneObjectAtOffset​(dx, dy, Solid.class) == null) {
            setLocation(x + dx, y + dy);
        }
    }
}
