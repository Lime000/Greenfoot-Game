import greenfoot.*;
abstract public class Entity extends Actor {
    public void act() {

    }
    abstract protected GreenfootImage getDirectionImage(Directions dir);
    public void move(Directions dir) {
        int x = getX();
        int y = getY();
        setImage(getDirectionImage(dir));
        switch (dir) {
            case UP:
                setRotation(0);
                setLocation(x, y - 1);
                break;
            case RIGHT:
                setRotation(1);
                setLocation(x + 1, y);
                break;
            case DOWN:
                setRotation(2);
                setLocation(x, y + 1);
                break;
            case LEFT:
                setRotation(3);
                setLocation(x - 1, y);
                break;
        }
    }
}
